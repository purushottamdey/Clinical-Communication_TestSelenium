package myApp.pageAction.implementation;


import myApp.pageAction.interfaces.ISignInActions;
import myApp.pageObject.implementation.SignInPage;
import myApp.pageObject.interfaces.ISignInPage;
import myApp.util.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInActions implements ISignInActions {

    static Logger logger = LogManager.getLogger(SignInActions.class);
    private final Utilities utilities;
    private final ISignInPage signInPage;
    WebDriver driver;

    public SignInActions(WebDriver driver) {
        this.driver = driver;
        this.utilities = new Utilities();
        this.signInPage = new SignInPage();
    }

    @Override
    public void enterText(String text, By locator) {
        try {
            utilities.sendKey(driver, locator, text);
            logger.info("Text entered: {}", text);
        } catch (Exception e) {
            logger.info("Text entered error: {}", e.getMessage());
            throw new RuntimeException(e);
        }

    }

    @Override
    public void clickSignInButton() {
        try {
            utilities.doClick(driver, signInPage.getSignInButtonLocator());
        } catch (Exception e) {
            logger.error("Error while clicking sign-in button: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getErrorMessageOnSignInPage() {
        return utilities.findElement(driver, signInPage.getErrorMessageLocator()).getText();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}

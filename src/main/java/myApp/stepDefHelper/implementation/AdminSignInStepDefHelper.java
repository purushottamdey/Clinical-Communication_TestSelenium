package myApp.stepDefHelper.implementation;

import myApp.pageAction.interfaces.ISignInActions;
import myApp.pageObject.interfaces.ISignInPage;
import myApp.stepDefHelper.interfaces.IAdminSignInStepDefHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;


public class AdminSignInStepDefHelper implements IAdminSignInStepDefHelper {

    ISignInActions signInActions;
    ISignInPage signInPage;

    Logger logger = LogManager.getLogger(AdminSignInStepDefHelper.class);

    public AdminSignInStepDefHelper(ISignInActions signInActions, ISignInPage signInPage) {
        this.signInActions = signInActions;
        this.signInPage = signInPage;
    }

    @Override
    public void verifyErrorMessage(String expectedMessage) {
        String actualMessage = signInActions.getErrorMessageOnSignInPage();
        logger.info("Actual message: " + actualMessage);
        Assert.assertEquals("The expected error message is not present in Sign In page", actualMessage, expectedMessage);
    }
    public void verifyPopUpMessage(String validationMsg) {
        Assert.assertEquals("Please include an '@' in the email address. 'purushottam.dey' is missing an '@'.", validationMsg);
        }
    public void verifyUserInLoginPage(String actualURL) {
            logger.info("User Navigates to: " + actualURL);
            Assert.assertEquals("Did not navigate to the correct dashboard URL.",
                    "/dashboard", actualURL.replace("http://localhost:3000", ""));
        }
    public void performEnterUsername(String string) {
        logger.info("Entering username " + string);
        signInActions.enterText(string,signInPage.getEmailAddressInputBoxLocator());
    }
    public void performEnterPassword(String string) {
        logger.info("Entering password " + string);
        signInActions.enterText(string,signInPage.getPasswordInputBoxLocator());
    }
    public void performClick() {
        logger.info("Performed Click ");
        signInActions.clickSignInButton();
    }
}

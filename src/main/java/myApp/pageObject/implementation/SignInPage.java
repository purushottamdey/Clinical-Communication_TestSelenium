package myApp.pageObject.implementation;

import myApp.pageObject.interfaces.ISignInPage;
import org.openqa.selenium.By;

public class SignInPage implements ISignInPage {

    @Override
    public By getEmailAddressInputBoxLocator() {
        return By.id("email");
    }

    @Override
    public By getPasswordInputBoxLocator() {
        return By.id("password");
    }

    @Override
    public By getSignInButtonLocator() {
        return By.xpath("//button[normalize-space(text())='Sign In']");
    }

    @Override
    public By getErrorMessageLocator() {
        return By.xpath("//*[@role='alert']");
    }

    @Override
    public By getAdminLabelLocator() {
        return By.xpath("//h6");
    }

    @Override
    public By getAppNameLocator() {
        return By.xpath("//h1");
    }

    public String getHomePageURL() {
        return "/dashboard";
    }

    public String getSignInPageURL() {
        return "/login";
    }


}

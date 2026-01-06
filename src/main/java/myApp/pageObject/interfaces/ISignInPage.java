package myApp.pageObject.interfaces;

import org.openqa.selenium.By;

public interface ISignInPage {
    By getEmailAddressInputBoxLocator();
    By getPasswordInputBoxLocator();
    By getSignInButtonLocator();
    By getErrorMessageLocator();
    By getAdminLabelLocator();
    By getAppNameLocator();
}

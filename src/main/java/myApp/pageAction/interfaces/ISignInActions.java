package myApp.pageAction.interfaces;

import org.openqa.selenium.By;

public interface ISignInActions {

    void enterText(String text, By locator);

    void clickSignInButton();
    String getErrorMessageOnSignInPage();
    String getCurrentURL();


}

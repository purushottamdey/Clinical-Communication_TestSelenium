package myApp.stepDefHelper.interfaces;

public interface IAdminSignInStepDefHelper {
    public void verifyErrorMessage(String message);
    public void verifyPopUpMessage(String validationMsg);
    public void verifyUserInLoginPage(String actualURL);
    public void performEnterUsername(String string);

    void performEnterPassword(String string);

    public void performClick();
}

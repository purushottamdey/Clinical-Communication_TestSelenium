package myApp.stepDefinition.adminSignInStepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myApp.pageAction.implementation.SignInActions;
import myApp.pageAction.interfaces.ISignInActions;
import myApp.pageObject.implementation.SignInPage;
import myApp.pageObject.interfaces.ISignInPage;
import myApp.stepDefHelper.implementation.AdminSignInStepDefHelper;
import myApp.stepDefHelper.interfaces.IAdminSignInStepDefHelper;
import myApp.util.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class AdminSignInStepDef {
    Logger logger = LogManager.getLogger(AdminSignInStepDef.class);
    ISignInActions signInActions;
    ISignInPage signInPage;
    IAdminSignInStepDefHelper adminSignInStepDefHelper;
    Utilities utilities;

    public AdminSignInStepDef() {
        signInPage = new SignInPage();
        signInActions = new SignInActions(myApp.hook.Hooks.driver);
        utilities = new Utilities();
        adminSignInStepDefHelper = new AdminSignInStepDefHelper(signInActions,signInPage);
    }

    @Given("user open chrome browser")
    public void user_open_chrome_browser() {
        //Handled in Hook
    }

    @Given("user navigate to the Sign-in page")
    public void user_navigate_to_the_sign_in_page() {

    }

    @Given("I am on the sign-in page")
    public void i_am_on_the_sign_in_page() throws InterruptedException {
        //
//        check(true, "Sign-in Page not displayed", signInPage.getAdminLabelLocator());
        logger.info("Sign-in Page Displayed");

    }

    @When("I enter username {string}")
    public void i_enter_username(String string) throws InterruptedException {

        logger.info("Entering username " + string);
        adminSignInStepDefHelper.performEnterUsername(string);


    }

    @When("I enter password {string}")
    public void i_enter_password(String string) throws InterruptedException {

        logger.info("Entering password " + string);
        adminSignInStepDefHelper.performEnterPassword(string);


    }

    @And("I clicked on Sign In button")
    public void iClickedOnButton() throws InterruptedException {

        logger.info("Clicking on Sign In button");
        adminSignInStepDefHelper.performClick();
    }

    @Then("I should see {string}")
    public void i_should_see(String string) throws InterruptedException {

        logger.info("Checking if '" + string + "' is displayed");
//        String actualMessage = signInActions.getErrorMessageOnSignInPage();
//        logger.info("Actual message: " + actualMessage);
        adminSignInStepDefHelper.verifyErrorMessage(string);
    }


    @Then("I should see email validation pop-up")
    public void iShouldSeeEmailValidationPopUp() {
        adminSignInStepDefHelper.performClick();
        String errorMessage = utilities.getAlertText();
        adminSignInStepDefHelper.verifyPopUpMessage(errorMessage);
    }

    @Then("user navigate on home page")
    public void userNavigateOnHomePage() throws InterruptedException {
        logger.info("Navigating on home page");
        Thread.sleep(1000);
        adminSignInStepDefHelper.verifyUserInLoginPage(signInActions.getCurrentURL());
    }

}

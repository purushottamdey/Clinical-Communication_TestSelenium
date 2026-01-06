package myApp.stepDefinition.adminHospitalManagementStepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myApp.pageAction.implementation.HospitalManagementAction;
import myApp.pageAction.interfaces.IHospitalManagementAction;
import myApp.pageObject.implementation.HospitalManagementPage;
import myApp.pageObject.interfaces.IHospitalManagementPage;
import myApp.stepDefHelper.implementation.AdminHospitalManagementStepDefHelper;
import myApp.stepDefHelper.interfaces.IAdminHospitalManagementStepDefHelper;
import myApp.util.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdminHospitalManagementStepDef {
    Logger logger = LogManager.getLogger(AdminHospitalManagementStepDef.class);
    IHospitalManagementAction hospitalManagementAction;
    IHospitalManagementPage hospitalManagementPage;
    IAdminHospitalManagementStepDefHelper adminHospitalManagementStepDefHelper;
    Utilities utilities;

    public AdminHospitalManagementStepDef(){
        hospitalManagementPage = new HospitalManagementPage();
        hospitalManagementAction = new HospitalManagementAction(myApp.hook.Hooks.driver);
        utilities = new Utilities();
        adminHospitalManagementStepDefHelper = new AdminHospitalManagementStepDefHelper(hospitalManagementAction,hospitalManagementPage);
    }
    @And("user navigate to the Hospital Management page")
    public void userNavigateToTheHospitalManagementPage() {
        // Write code here that turns the phrase above into concrete actions
        logger.info("Clicking on the Hospital Management page dropdown");
        adminHospitalManagementStepDefHelper.performClickOnHospitalDropDown();
        adminHospitalManagementStepDefHelper.performClickOnHospitalButton();
    }


    @When("I click on Add Hospital button")
    public void iClickOnAddHospitalButton() {
        // Write code here that turns the phrase above into concrete actions
        logger.info("Clicking on Add Hospital button");
        adminHospitalManagementStepDefHelper.performClickOnAddHospitalButton();

    }

    @And("I enter hospital name {string}")
    public void iEnterHospitalName(String string) {
        // Write code here that turns the phrase above into concrete actions
        logger.info("Entering Hospital name");
        adminHospitalManagementStepDefHelper.performEnterHospitalName(string);
    }

    @And("I enter address {string}")
    public void iEnterAddress(String string) {
        // Write code here that turns the phrase above into concrete actions
        logger.info("Entering Hospital Address");
        adminHospitalManagementStepDefHelper.performEnterHospitalAddress(string);
    }

    @And("I enter city {string}")
    public void iEnterCity(String string) {
        // Write code here that turns the phrase above into concrete actions
        logger.info("Entering Hospital City");
        adminHospitalManagementStepDefHelper.performEnterHospitalCity(string);
    }

    @And("I enter state {string}")
    public void iEnterState(String string) {
        // Write code here that turns the phrase above into concrete actions
        logger.info("Entering Hospital State");
        adminHospitalManagementStepDefHelper.performEnterHospitalState(string);
    }

    @And("I enter zip {string}")
    public void iEnterZip(String string) {
        // Write code here that turns the phrase above into concrete actions
        logger.info("Entering Hospital Zip");
        adminHospitalManagementStepDefHelper.performEnterHospitalZipCode(string);
    }

    @And("I enter phone number {string}")
    public void iEnterPhoneNumber(String string) {
        // Write code here that turns the phrase above into concrete actions
        logger.info("Entering Hospital Phone Number");
        adminHospitalManagementStepDefHelper.performEnterHospitalPhoneNumber(string);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String string) {
        // Write code here that turns the phrase above into concrete actions
        logger.info("Entering Hospital Email");
        adminHospitalManagementStepDefHelper.performEnterHospitalEmailAddress(string);
    }

    @And("I click on Create button")
    public void iClickOnCreateButton() {
        // Write code here that turns the phrase above into concrete actions
        logger.info("Clicking on Create button");
        adminHospitalManagementStepDefHelper.performClickOnHospitalCreateButton();
    }

    @Then("hospital {string} added successfully")
    public void hospitalShouldBeAddedSuccessfully(String string) {
        // Write code here that turns the phrase above into concrete actions
        adminHospitalManagementStepDefHelper.verifyHospitalIsAdded(string);
    }

    @And("I click on Cancel button")
    public void iClickOnCancelButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("Add Hospital modal should be closed")
    public void addHospitalModalShouldBeClosed() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("hospital should not be added")
    public void hospitalShouldNotBeAdded() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("I click on Edit icon for a hospital")
    public void iClickOnEditIconForAHospital() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("I update hospital phone number {string}")
    public void iUpdateHospitalPhoneNumber(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("I click on Save button")
    public void iClickOnSaveButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("hospital details should be updated successfully")
    public void hospitalDetailsShouldBeUpdatedSuccessfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("I click on Delete icon for a hospital")
    public void iClickOnDeleteIconForAHospital() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("I confirm delete hospital")
    public void iConfirmDeleteHospital() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("hospital should be removed from hospital list")
    public void hospitalShouldBeRemovedFromHospitalList() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("I search hospital with {string}")
    public void iSearchHospitalWith(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("only matching hospitals should be displayed")
    public void onlyMatchingHospitalsShouldBeDisplayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}

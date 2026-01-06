package myApp.stepDefHelper.implementation;


import myApp.pageAction.interfaces.IHospitalManagementAction;
import myApp.pageObject.interfaces.IHospitalManagementPage;
import myApp.stepDefHelper.interfaces.IAdminHospitalManagementStepDefHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;


public class AdminHospitalManagementStepDefHelper implements IAdminHospitalManagementStepDefHelper {

    IHospitalManagementPage hospitalManagementPage;
    IHospitalManagementAction hospitalManagementAction;

    Logger logger = LogManager.getLogger(AdminHospitalManagementStepDefHelper.class);


    public AdminHospitalManagementStepDefHelper(IHospitalManagementAction hospitalManagementAction, IHospitalManagementPage hospitalManagementPage) {

        this.hospitalManagementAction = hospitalManagementAction;
        this.hospitalManagementPage = hospitalManagementPage;

    }

    @Override
    public void performClickOnHospitalDropDown() {

        logger.info("Performed Click on dropdown");
        hospitalManagementAction.clickHospitalDropDown();
    }

    @Override
    public void performClickOnHospitalButton() {
        logger.info("Performed Click on hospitals");
        hospitalManagementAction.clickHospitalsButton();
    }

    @Override
    public void performClickOnAddHospitalButton() {
        logger.info("Performed Click on Add hospitals");
        hospitalManagementAction.performClickOnAddHospitalButton();
    }

    @Override
    public void performEnterHospitalName(String hospitalName) {
        logger.info("Entered Hospital name in Hospital name TextBox");
        hospitalManagementAction.performEnterText(hospitalName, hospitalManagementPage.getHospitalNameInputBoxLocator());
    }

    @Override
    public void performEnterHospitalAddress(String hospitalAddress) {
        logger.info("Entered Hospital name in Hospital Address TextBox");
        hospitalManagementAction.performEnterText(hospitalAddress, hospitalManagementPage.getAddressInputBoxLocator());
    }

    @Override
    public void performEnterHospitalCity(String hospitalCity) {
        logger.info("Entered Hospital name in Hospital City TextBox");
        hospitalManagementAction.performEnterText(hospitalCity, hospitalManagementPage.getCityInputBoxLocator());
    }

    @Override
    public void performEnterHospitalState(String hospitalState) {
        logger.info("Entered Hospital name in Hospital State TextBox");
        hospitalManagementAction.performEnterText(hospitalState, hospitalManagementPage.getStateInputBoxLocator());

    }

    @Override
    public void performEnterHospitalZipCode(String hospitalZipCode) {
        logger.info("Entered Hospital name in Hospital Zip Code TextBox");
        hospitalManagementAction.performEnterText(hospitalZipCode,hospitalManagementPage.getZipInputBoxLocator());
    }

    @Override
    public void performEnterHospitalPhoneNumber(String hospitalPhoneNumber) {
    logger.info("Entered Hospital name in Hospital Phone Number TextBox");
    hospitalManagementAction.performEnterText(hospitalPhoneNumber, hospitalManagementPage.getPhoneInputBoxLocator());
    }

    @Override
    public void performEnterHospitalEmailAddress(String hospitalEmailAddress) {
    logger.info("Entered Hospital name in Hospital Email Address TextBox");
    hospitalManagementAction.performEnterText(hospitalEmailAddress, hospitalManagementPage.getEmailInputBoxLocator());
    }

    @Override
    public void performClickOnHospitalCreateButton() {
    logger.info("Clicking on Create button");
    hospitalManagementAction.performClickOnCreateButton();
    }

    @Override
    public void performClickOnHospitalDeleteButton() {

    }

    @Override
    public void performClickOnHospitalCancelButton() {

    }

    @Override
    public void verifyHospitalIsAdded(String hospitalName) {
        Assert.assertEquals("Hospital Name Matched", hospitalName, hospitalManagementAction.getHospitalNameFromListLocator(hospitalManagementPage.getHospitalNameInputBoxLocator()));
    }
}

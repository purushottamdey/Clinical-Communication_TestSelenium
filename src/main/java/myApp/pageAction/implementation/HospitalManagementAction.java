package myApp.pageAction.implementation;

import myApp.pageAction.interfaces.IHospitalManagementAction;
import myApp.pageObject.implementation.HospitalManagementPage;
import myApp.pageObject.interfaces.IHospitalManagementPage;
import myApp.util.Utilities;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HospitalManagementAction implements IHospitalManagementAction {
    WebDriver driver;
    Utilities utilities;
    IHospitalManagementPage hospitalManagementPage;
    Logger logger = LogManager.getLogger(HospitalManagementAction.class);

    public HospitalManagementAction(WebDriver driver) {
        this.driver = driver;
        this.utilities = new Utilities();
        this.hospitalManagementPage = new HospitalManagementPage();
    }


    @Override
    public void clickHospitalDropDown() {
        try {
            utilities.doClick(driver, hospitalManagementPage.getHospitalNavBarDropdownLocator());
        } catch (Exception e) {
            logger.error("Error while clicking Hospital dropdown: {}", e.getMessage());
            throw new RuntimeException(e);
        }

    }

    @Override
    public void clickHospitalsButton() {
        try {
            utilities.doClick(driver, hospitalManagementPage.getHospitalNavBarLocator());
        } catch (Exception e) {
            logger.error("Error while clicking Hospitals button: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void performClickOnCreateButton() {
        try {
            utilities.doClick(driver, hospitalManagementPage.getCreateButtonLocator());
        } catch (Exception e) {
            logger.error("Error while clicking Create Hospitals button: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void performClickOnCancelHospitalButton() {
        try {
            utilities.doClick(driver, hospitalManagementPage.getCancelButtonLocator());
        } catch (Exception e) {
            logger.error("Error while clicking Cancel button: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void performClickOnAddHospitalButton() {
        try {
            utilities.doClick(driver, hospitalManagementPage.getAddHospitalButtonLocator());
        } catch (Exception e) {
            logger.error("Error while clicking Add Hospitals button: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public void performEnterText(String text, By locator) {
        try {
            utilities.sendKey(driver, locator, text);
            logger.info("Hospital Name entered: {}", text);
        } catch (Exception e) {
            logger.info("Hospital Name entered error: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getHospitalNameFromListLocator(By locator) {
        String hospitalName;
        utilities.waitAndFindElement(driver, locator, Duration.ofSeconds(2));
        try {
            hospitalName = driver.findElement(locator).getAttribute("value");;
            logger.info("Hospital Name found: {}", hospitalName);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        return hospitalName;
    }


}

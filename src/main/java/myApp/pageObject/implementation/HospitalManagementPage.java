package myApp.pageObject.implementation;

import myApp.pageObject.interfaces.IHospitalManagementPage;
import org.openqa.selenium.By;

public class HospitalManagementPage implements IHospitalManagementPage {
    @Override
    public By getHospitalNavBarLocator() {
        return By.xpath(("//span[contains(text(),'Hospitals')]"));
    }
    @Override
    public By getHospitalNavBarDropdownLocator() {
        return By.xpath("(//span[contains(@class, 'MuiTypography-root') and contains(@class, 'MuiTypography-body1')])[2]");
    }
    @Override
    public By getSearchBoxLocator() {
        return By.xpath("//input[@type='text']");
    }
    @Override
    public By getAddHospitalButtonLocator() {
        return By.xpath("//button[contains(text(),'Add Hospital')]");
    }

    @Override
    public By getHospitalNameInputBoxLocator() {
        return By.xpath("(//label[normalize-space(text())='Address']/preceding::input)[3]");
    }

    @Override
    public By getAddressInputBoxLocator() {
        return By.xpath("(//label[normalize-space(text())='Address']/following::input)[1]");
    }

    @Override
    public By getCityInputBoxLocator() {
        return By.xpath("(//label[normalize-space(text())='City']/following::input)[1]");
    }

    @Override
    public By getStateInputBoxLocator() {
        return By.xpath("(//label[normalize-space(text())='State']/following::input)[1]");
    }

    @Override
    public By getZipInputBoxLocator() {
        return By.xpath("(//label[normalize-space(text())='ZIP Code']/following::input)[1]");
    }

    @Override
    public By getPhoneInputBoxLocator() {
        return By.xpath("(//label[normalize-space(text())='Phone Number']/following::input)[1]");
    }

    @Override
    public By getEmailInputBoxLocator() {
        return By.xpath("//label[normalize-space(text())='Email']/following::input");
    }

    @Override
    public By getCancelButtonLocator() {
        return By.xpath("//button[contains(text(),'Cancel')]");
    }

    @Override
    public By getCreateButtonLocator() {
        return By.xpath("//button[normalize-space()='Create']") ;
    }

    @Override
    public By getHospitalNameFromListLocator() {
        return By.xpath("(//div[@role='cell'])[1]/div") ;
    }

    @Override
    public By getCityFromListLocator() {
        return By.xpath("(//div[@role='cell'])[2]/div") ;
    }

    @Override
    public By getStateFromListLocator() {
        return By.xpath("(//div[@role='cell'])[3]/div") ;
    }

    @Override
    public By getPhoneFromListLocator() {
        return By.xpath("(//div[@role='cell'])[4]/div") ;
    }

    @Override
    public By getEmailFromListLocator() {
        return By.xpath("(//div[@role='cell'])[5]/div") ;
    }


}

package myApp.pageObject.interfaces;

import org.openqa.selenium.By;

public interface IHospitalManagementPage {
    public By getHospitalNavBarLocator();

    public By getHospitalNavBarDropdownLocator();

    public By getSearchBoxLocator();

    public By getAddHospitalButtonLocator();

    public By getHospitalNameInputBoxLocator();

    public By getAddressInputBoxLocator();

    public By getCityInputBoxLocator();

    public By getStateInputBoxLocator();

    public By getZipInputBoxLocator();

    public By getPhoneInputBoxLocator();

    public By getEmailInputBoxLocator();

    public By getCancelButtonLocator();

    public By getCreateButtonLocator();

    public By getHospitalNameFromListLocator();

    public By getCityFromListLocator();

    public By getStateFromListLocator();

    public By getPhoneFromListLocator();

    public By getEmailFromListLocator();

}

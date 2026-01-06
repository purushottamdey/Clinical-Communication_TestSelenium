package myApp.pageAction.interfaces;

import org.openqa.selenium.By;

public interface IHospitalManagementAction {
    void clickHospitalDropDown();
    void clickHospitalsButton();
    void performClickOnCreateButton();
    void performClickOnCancelHospitalButton();
    void performClickOnAddHospitalButton();
    void performEnterText(String text, By locator);
    String getHospitalNameFromListLocator(By locator);

}

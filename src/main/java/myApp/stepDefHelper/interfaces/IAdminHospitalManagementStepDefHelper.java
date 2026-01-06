package myApp.stepDefHelper.interfaces;

public interface IAdminHospitalManagementStepDefHelper {

    void performClickOnHospitalDropDown();
    void performClickOnHospitalButton();
    void performClickOnAddHospitalButton();
    void performEnterHospitalName(String hospitalName);
    void performEnterHospitalAddress(String hospitalAddress);
    void performEnterHospitalCity(String hospitalCity);
    void performEnterHospitalState(String hospitalState);
    void performEnterHospitalZipCode(String hospitalZipCode);
    void performEnterHospitalPhoneNumber(String hospitalPhoneNumber);
    void performEnterHospitalEmailAddress(String hospitalEmailAddress);
    void performClickOnHospitalCreateButton();
    void performClickOnHospitalDeleteButton();
    void performClickOnHospitalCancelButton();
    void verifyHospitalIsAdded(String hospitalName);

}

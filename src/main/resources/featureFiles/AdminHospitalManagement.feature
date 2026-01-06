Feature: User performs Hospital Management operations

  Background:
    Given user open chrome browser
    And user navigate to the Sign-in page
    And I enter username "admin@clinical.com"
    And I enter password "Admin@123"
    And I clicked on Sign In button
    And user navigate to the Hospital Management page

  @addHospitalWithValidData
  Scenario Outline: Add hospital with valid details
    When I click on Add Hospital button
    And I enter hospital name "<hospitalName>"
    And I enter address "<address>"
    And I enter city "<city>"
    And I enter state "<state>"
    And I enter zip "<zip>"
    And I enter phone number "<phone>"
    And I enter email "<email>"
    And I click on Create button
    Then hospital "<hospitalName>" added successfully

    Examples:
      | hospitalName            | address   | city     | state  | zip    | phone      | email                   |
      | City General Hospital 1 | MG Road   | New York | NY     | 10001  | 15550100   | info@citygeneral.com    |
      | Apollo Hospital         | Marine Dr | Kochi    | Kerala | 682016 | 9876543210 | info@apollohospital.com |

  @addHospitalWithMissingMandatoryField
  Scenario Outline: Add hospital without mandatory hospital name
    When I click on Add Hospital button
    And I enter hospital name "<hospitalName>"
    And I click on Create button
    Then I should see "<message>"

    Examples:
      | hospitalName | message                   |
      |              | Hospital Name is required |

  @cancelAddHospital
  Scenario: Cancel add hospital operation
    When I click on Add Hospital button
    And I click on Cancel button
    Then Add Hospital modal should be closed
    And hospital should not be added

  @editHospital
  Scenario: Edit existing hospital details
    When I click on Add Hospital button
    And I enter hospital name "NewHospital"
    And I click on Create button
    And hospital "NewHospital" added successfully
    And I click on Edit icon for a hospital
    And I update hospital phone number "9999999999"
    And I click on Save button
    Then hospital details should be updated successfully

  @deleteHospital
  Scenario: Delete hospital
    When I click on Add Hospital button
    And I enter hospital name "NewHospital"
    And I click on Create button
    And hospital "NewHospital" added successfully
    And I click on Delete icon for a hospital
    And I confirm delete hospital
    Then hospital should be removed from hospital list

  @searchHospital
  Scenario Outline: Search hospital by name
    Given I click on Add Hospital button
    And I enter hospital name "<hospitalName>"
    And I enter address "<address>"
    And I enter city "<city>"
    And I enter state "<state>"
    And I enter zip "<zip>"
    And I enter phone number "<phone>"
    And I enter email "<email>"
    And I click on Create button
    Then hospital "<hospitalName>" added successfully
    When I search hospital with "<hospitalName>"
    Then only matching hospitals should be displayed
    Examples:
      | hospitalName          | address   | city     | state  | zip    | phone      | email                   |
      | City General Hospital | MG Road   | New York | NY     | 10001  | 15550100   | info@citygeneral.com    |
      | Apollo Hospital       | Marine Dr | Kochi    | Kerala | 682016 | 9876543210 | info@apollohospital.com |


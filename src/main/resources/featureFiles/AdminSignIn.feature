Feature: user perform sign-in operation

  Background:
    Given user open chrome browser
    And user navigate to the Sign-in page

  @loginValidationWithWrongEmailAndPassword
  Scenario Outline: Login validation with wrong email and wrong password
    Given I am on the sign-in page
    When I enter username "<email>"
    And I enter password "<password>"
    And I clicked on Sign In button
    Then I should see "<message>"

    Examples:
      | email               | password    | message             |
      | testuser@gmail.com  | Password123 | Invalid credentials |
      | wronguser@gmail.com | wrongpass   | Invalid credentials |
      | Hiranmay            |             | Enter Password      |

#  Scenario Outline: Login Validation with invalid email and wrong password
#    Given I am on the sign-in page
#    When I enter username "<email>"
#    And I enter password "<password>"
#    And I clicked on Sign In button
#    Then  I should see email validation pop-up
#
#    Examples:
#      | email      | password  |
#      | John.Abrem | asjdgsjag |

  @loginWIthValidEmailAndPassword
  Scenario Outline: Login validation correct email and correct password
    Given I am on the sign-in page
    When I enter username "<email>"
    And I enter password "<password>"
    And I clicked on Sign In button
    Then user navigate on home page

    Examples:
      | email               | password  |
      | admin@clinical.com  | Admin@123 |
      | doctor@clinical.com | ad123     |

  @loginAsAdmin
  Scenario: Login as admin user
    Given I am on the sign-in page
    When I enter username "admin@clinical.com"
    And I enter password "Admin@123"
    And I clicked on Sign In button
    Then user navigate on home page

  @loginAsClinicalUser
  Scenario: Login as clinical user
    Given I am on the sign-in page
    When I enter username "doctor@clinical.com"
    And I enter password "ad123"
    And I clicked on Sign In button
    Then user navigate on home page
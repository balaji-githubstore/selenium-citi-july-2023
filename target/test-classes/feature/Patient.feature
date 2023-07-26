@patient
Feature: Patient
  In order to add patient records 
  as a user
  I should get access to modify the patient records.

  @addpatient
  Scenario Outline: Add Valid Patient
    Given I have browser with OpenEMR application
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    And I click on patient menu
    And I click on new-search menu
    And I fill the patient records form
      | firstname | lastname | dob   | gender   |
      | <fname>   | <lname>  | <dob> | <gender> |
    And I click on create new patient
    And I click on confirm create new patient
    And I store the alert text and handle it
    And I click on close happy birthday popup if available
    Then I should get the added patient name as '<expected_patient_name>'

    Examples: 
      | username | password | fname | lname | dob        | gender | expected_patient_name                |
      | admin    | pass     | john  | wick  | 2023-07-26 | Male   | Medical Record Dashboard - john wick |
      | admin    | pass     | peter | henry | 2023-07-26 | Male   | Medical Record Dashboard - john wick |

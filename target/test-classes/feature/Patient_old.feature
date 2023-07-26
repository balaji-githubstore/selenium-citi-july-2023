#
#Feature: Patient
  #In order to add patient records 
  #as a user
  #I should get access to modify the patient records.
#
  #
  #Scenario: Add Valid Patient
    #Given I have browser with OpenEMR application
    #When I enter username as 'john'
    #And I enter password as 'john123'
    #And I click on login
    #And I click on patient menu
    #And I click on new-search menu
    #And I fill the patient records form
      #| firstname | lastname | dob        | gender |
      #| john      | wick     | 2023-07-26 | Male   |
    #And I click on create new patient
    #And I click on confirm create new patient
    #And I store the alert text and handle it
    #And I click on close happy birthday popup if available
    #Then I should get the added patient name as 'Medical Record Dashboard - john wick'
#

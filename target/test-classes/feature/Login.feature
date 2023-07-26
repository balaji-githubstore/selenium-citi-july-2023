@login
Feature: Login
  In order maintain the health records
  As a user
  I want to access the OpenEMR portal

  Background: 
    Given I have browser with OpenEMR application

  @invalid
  Scenario: Invalid Login
    When I enter username as 'john'
    And I enter password as 'john123'
    And I click on login
    Then I should not get access to portal with error as 'Invalid username or password'

  @smoke @valid
  Scenario Outline: Valid Login
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    Then I should get access to portal with title as '<title>'

    Examples: 
      | username   | password   | title   |
      | admin      | pass       | OpenEMR |
      | accountant | accountant | OpenEMR |
  #	@smoke  @valid
  #Scenario: Valid Login
  #Given I have browser with OpenEMR application
  #When I enter username as 'admin'
  #And I enter password as 'pass'
  #And I click on login
  #Then I should get access to portal with title as 'OpenEMR'

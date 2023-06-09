@smoke
Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter "automation"
    And user enter last name
    And user enter date of day
    And user enter date of month
    And user enter date of year
    And user enter email
    And user fills Password fields
    And user fills Confirm Password fields
    And user clicks on register button
    Then success message is displayed

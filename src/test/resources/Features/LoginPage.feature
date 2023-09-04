Feature: Login Page Feature

  Scenario: Login Page Title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Test Login | Practice Test Automation"

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters Username "student"
    And user enters Password "Password123"
    And user click on Submit button
    Then user get the title of the Homepage
    And the page title should be "Logged In Successfully | Practice Test Automation"
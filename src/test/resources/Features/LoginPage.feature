Feature: Login Page Feature

  Scenario: Login Page Title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Test Login | Practice Test Automation"

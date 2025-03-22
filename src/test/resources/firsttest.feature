Feature: Logging into W3Schools

  Scenario: User cannot sign in without valid credentials
    Given the home page is accessed
    When the login button is clicked
    Then the login page should be displayed
    When invalid login credentials are provided
    Then the user should not be logged in
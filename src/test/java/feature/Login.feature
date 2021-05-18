Feature: To verify login functionality

  Scenario: To validate customer is able to login successfully
    Given Customer is on login page
    When Customer logged in with valid credentials
    Then Customer create category
    Then Customer create a blog



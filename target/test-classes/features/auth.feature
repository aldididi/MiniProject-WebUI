Feature: Auth
  As a user
  I want to login and regist account
  So that I can buy products

  Scenario: As a user I want to login
    Given I am on the login page
    When I input valid username
    And I input valid password
    And click login button
    Then I go to home page
Feature: Auth
  As a user
  I want to login and regist account
  So that I can buy products

#  Scenario: As a user I want to login
#    Given I am on the login page
#    When I input valid username
#    And I input valid password
#    And click login button
#    Then I go to home page
#
#  Scenario: Failed login
#    Given I am on the login page
#    When I input invalid username
#    And I input valid password
#    And click login button
#    Then error message "email or password is invalid"

    Scenario: Register account
      Given I am on the register page
      When I input valid nama lengkap
      And I inpput valid email
      And I input valid regis password
      And click register button
      Then I directed to login page
#      And I input valid email regis
#      And I input valid pw regis
#      And click login button
#      Then I go to home page
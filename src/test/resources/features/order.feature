Feature: Order
  As a user
  I want to order
  So that I can buy products

  Scenario: Order without login
    Given : Iam on main page
    When I click beli
    And I click cart
    And click bayar
    Then direct to login page

    Scenario: Order with login
      Given  Iam on login page
      When I input valid username
      And I input valid password
      And click login button
      And I go to home page
      And I click beli
      And I click cart
      And I click bayar
      Then Directed to transaction page


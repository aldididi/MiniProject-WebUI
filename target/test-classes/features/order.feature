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


@smoke
Feature: Flipcart Ecommerce
  
Background: 
Given I landed on filpcart Website

  @tag1
  Scenario: Placing laptop
    Given Searching the product in search box
    When Select the newest laptop filter
    Then Select the laptop
    And Add the product to cart
    And place the order

   
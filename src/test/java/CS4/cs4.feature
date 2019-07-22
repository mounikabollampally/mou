
Feature: Title of your feature
  Scenario Outline: User moves to cart without adding items in it
    Given User registered into TestMeApp
    When user search for HeadPhones
    And Proceeds to payment without adding items
       Then TestMeApp doesnt the cart icon
   Examples:
   |username|password  |
   |lalitha|Password123|

Feature: TestMeApp
  @smoke @Assembly
  Scenario: login
    When i enter user name
    And password
     Then the home page appeares
    @Assembly @Unit
  Scenario: logout
    When  i click on logout option
   Then the login screen appeares
    @Unit @smoke
  Scenario: purchase HeadPhone
    When  I go to All Categories
    And I navigate to Electronics
    When Click on Headphones
   Then the payment page appeares
    
 
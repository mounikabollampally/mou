
Feature: Title of your feature
   Scenario Outline: Login
    Given Click on the URL
    Given Click on the SignIN button
    When I enter the Credentials "<username>","<password>"
     When Click on login
     Examples: 
      |username  |password      | 
      |Lalitha    |Password123  |
      

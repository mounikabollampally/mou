Feature: Title of your feature
  Scenario: Create account
    Given Register new user
    And enters valid data
      | name  | password | 
      | name1 |     5    | 
      | name2 |     7    | 
      When he clicks on login button
      Then Home page is displayed

@tag
Feature: The Login Page
  I want to enter in the login page
  As a user
  By entering correct Emailid and Password 

 @tag1
  Scenario: the user should be able to login with correct username and pasword
    Given user is on the login page
    When user enters correct user name and password
   
    Then user gets confirmation
 

 @tag2
  Scenario Outline: the user should be able to login
    Given user is on the login page
    When user enters email <username>
    And user enters password <password>
    And user clicks login button
    Then user gets confirmation

    Examples: 
      | username  | password |
      | yourid    | yourpass  |
      | Wrongid   | wrongpass  |
      |aveeks7@gmail.com|Messi@10|




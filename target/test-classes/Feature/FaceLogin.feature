@Face
Feature: 
  To Validate for Facebook Login Page

  Background: 
    Given To pass Facebook login page url

  Scenario: 
    The Facebook Login Filed invalid username and invalid password give to check

    When To pass invalid username and password
      | Vajithraguman | 8870 | vajith@gmail.com |
    And To Click login button
    Then To Verify loginpage Url

  Scenario: 
    The Facebook Login Filed invalid username and invalid password give to check

    When To pass invalid Username and password
      | vajithraguman | 8870 | vajith@gmail.com |
      | raguman       | 7865 | raguman@gmai.com |
    And To Click Login button
    Then To Verify loginpage Url

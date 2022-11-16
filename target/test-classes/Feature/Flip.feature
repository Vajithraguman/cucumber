@Flipkart
Feature: 
  To validate flipkart username and password

  Background: 
    Given To pass valid flipkart url

  Scenario: 
    To validate username and passeword field using invalid password and username

    When To pass username and password
      | Username | vajith |
      | password |   8870 |
    And Click login field

  Scenario: 
    To validate username and passeword field using invalid password and valid username

    When To pass valid username and password
      | username | password |
      | vajith   |     8870 |
      | raguman  |    78685 |
    And Click login secondfield

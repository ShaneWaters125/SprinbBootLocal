Feature: get a specific film

  Scenario Outline: getting a specific film from the db
    Given a film exists with id <filmid>
    When i request a films details
    Then the webpage should show the films "<title>"
    Examples:
      | filmid | title                 |
      | 1      | ACADEMY DINOSAUR      |
      | 2      | ACE GOLDFINGER        |
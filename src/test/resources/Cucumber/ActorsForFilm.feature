Feature: get a list of actors for a specific film

  Scenario Outline: getting a list of actors for a film from the db
    Given a film exists with id <filmid> and has actors
    When i request a films actors
    Then the webpage should show the films "<actors>" list
    Examples:
      | filmid | actors |
      | 1      | John DoeNICK WAHLBERGCHRISTIAN GABLELUCILLE TRACYSANDRA PECKJOHNNY CAGEMENA TEMPLEWARREN NOLTEOPRAH KILMERROCK DUKAKISMARY KEITEL |
      | 2      | BOB FAWCETTMINNIE ZELLWEGERSEAN GUINESSCHRIS DEPP |
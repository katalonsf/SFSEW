@LoginAsCFO
Feature: Common Concession Management Steps

  Scenario Outline: Concession loaded successfully
    And I click on the Search and search for
    And I click on the login button on setup user page
    And I try fo find billing acount 1042163
    And I Delete the unnecessary cookies
    And I reload the page
    And I click on CCPaument button for Frank Murray

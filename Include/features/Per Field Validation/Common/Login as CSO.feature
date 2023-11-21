@LoginAsCSO
Feature: Switch to another user 

  Scenario Outline: Login as a CSO user
  
    And I click on the Search and search for
    And I click on the login button on setup user page
    And I try fo find billing acount 12345
    And I Delete the unnecessary cookies
    And I reload the page
    And I click on CCPaument button for FXXX MXXX

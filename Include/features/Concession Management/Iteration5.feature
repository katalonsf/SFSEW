Feature: Concession Management negative 

Background:
 
    Given I open a browser and after I max window I navigate to SF homepage
    When I enter my credentials and login to the page
    Then I click on the Gear icon and open the setup page
     And I click on the Search and search for SCO user
    And I click on the login button on setup user page for SCO user
    @Login, @LoginAsCSO

  
  Scenario Outline: Concession not loaded successfully  
  
    And I search for Billing Account# XXXXXX
    And I Delete the unnecessary cookies to load concession button negative scenario
    And I reload the page to click on concession button negative scenario
    And I choose Concession negative scenario
    And I create a new concession for J-F-C
    And I continue steps to create the new billing acount for the customer negative
    And I click on Yes,add concession radio button to procced the progress 
    And I capture the text which is the concession was not successfully added 
    
     Examples: 
      | Customer Name | Billing Account Number | 
      |  XXXXX     XXX|  111111111             |
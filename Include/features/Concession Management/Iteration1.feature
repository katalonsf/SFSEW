Feature: Concession Management

Background:
 
    Given I open a browser and after I max window I navigate to SF homepage
    When I enter my credentials and login to the page
    Then I click on the Gear icon and open the setup page
     And I click on the Search and search for SCO user
    And I click on the login button on setup user page for SCO user
    @Login, @LoginAsCSO
   
      
  Scenario Outline: Concession loaded successfully 
   

      And I search for Billing Account# XXXX
    And I Delete the unnecessary cookies to load concession button
    And I reload the page to click on concession button
    And I choose Concession 
    And I remove the concession for customer from Billing account
    And I add a new concession in billing account for customer
    And I config the options in Concession Management page
    And I click on Yes to add the concession
    And I verify that the phrase Successfuly Added present and take a full screenshot
    And I click on the Finish Button
    And I take a full screenshot and close the browser


  Examples: 
      | Customer Name | Billing Account Number | 
      |     XXXX XXXX |        111111          |

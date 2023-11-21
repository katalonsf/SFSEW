Feature: Concession Management

Background:
 
    Given I open a browser and after I max window I navigate to SF homepage
    When I enter my credentials and login to the page
    Then I click on the Gear icon and open the setup page
     And I click on the Search and search for DXXX TXXX
    And I click on the login button on setup user page for DXXX TXXX
    @Login, @LoginAsDiana
   
      
  Scenario Outline: Concession loaded successfully 
   
    And I search for Billing Account# 12345
    And I choose Concession from Dropdwn-List
    And I remove the concession for DXXX WXXX from Billing account
    And I add a new concession in billing account for DXXX WXXX
    And I config the options in Concession Management page
    And I click on Yes to add the concession
    And I verify that the phrase Successfuly Added present and take a full screenshot
    And I click on the Finish Button
    And I take a full screenshot and close the browser

    Examples:

  | Billing Account Number: 12345       |
  | Customer Name: DXXX & SXXX  WXXX  |
  

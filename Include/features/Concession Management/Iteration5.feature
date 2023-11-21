Feature: Concession Management negative 

Background:
 
    Given I open a browser and after I max window I navigate to SF homepage
    When I enter my credentials and login to the page
    Then I click on the Gear icon and open the setup page
     And I click on the Search and search for DXXX TXXX
    And I click on the login button on setup user page for DXXX TXXX
    @Login, @LoginAsDiana

  
  Scenario Outline: Concession not loaded successfully  
  
    And I search for Billing Account# 12345
    And I choose Concession from Dropdwn-List- for negative scenario
    And I create a new concession for JXXX-HXXX-FXXX-CXXX
    And I continue steps to create the new billing acount for JXXX-HXXX-FXXX-CXXX
    And I click on Yes,add concession radio button to procced the progress 
    And I capture the text which is the concession was not successfully added 
    
      Examples:

  | Billing Account Number: 123456       |
  | Customer Name: JXXX-HXXX-FXXX-CXXX  |
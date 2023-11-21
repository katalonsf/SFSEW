Feature: Per field validation 1 

  Background: 
    Given I open a browser and after I max window I navigate to SF homepage
    When I enter my credentials and login to the page
    Then I click on the Gear icon and open the setup page
    And I click on the Search and search for FXXX MXXX
    And I click on the login button on setup user page for FXXX MXXX
    And I try fo find billing acount 12345
    And I Delete the unnecessary cookies
    And I reload the page
    And I click on CCPaument button for FXXX MXXX

  @Login, @LoginAsCFO
  Scenario Outline: Validate Credit Card Payments via a SEW CSO Pulse Front End
   
    And I click on Credit Card Type and select Visa for AXXX P CXXX
    And I enter credit card number for AXXX P CXXX
    And I set the expiry date
    And I set the customer name
    And I set the CVV
    And I set the Amount
    And I enter on Submit to submit the payment form
    And I take an screenshot of the successful payment page
 


  Examples: 
      | CCpayment customer | Credit Card Type | Card num            | Expiry Date | Name on the Card | CVN | Amount |
      | AXXX P CXXX        | Visa             | 1111 2222 3333 4444 | 03/2020     | AXXX X CXXX      | 123 | 150    |

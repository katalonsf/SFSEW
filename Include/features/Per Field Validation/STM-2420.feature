Feature: Per field validation 1 

  Background: 
    Given I open a browser and after I max window I navigate to SF homepage
    When I enter my credentials and login to the page
    Then I click on the Gear icon and open the setup page
    And I click on the Search and search
    And search for CsoUser
    And I click on the login button on setup user page for CFO user
    And I try fo find billing acount #######
    And I Delete the unnecessary cookies to load CCPayment button
    And I reload the page to click on CCPayment button
    And I click on CCPaument button for logged in CFO user

  @Login, @LoginAsCFO
  
   Scenario Outline: Validate Credit Card Payments via a SEW CSO Pulse Front End
   
    And I click on Credit Card Type and select Visa for the customer
    And I enter credit card number for the customer
    And I set the expiry date
    And I set the customer name
    And I set the CVV
    And I set the Amount
    And I enter on Submit to submit the payment form
    And I take an screenshot of the successful payment page
 


  Examples: 
      | CCpayment customer | Credit Card Type | Card num            | Expiry Date | Name on the Card | CVN | Amount |
      | XXXX XXXX          | XXX              | 1111 1111 1111 1111 | 01/2000     | XXXX XXXX        | 111 | 111    |

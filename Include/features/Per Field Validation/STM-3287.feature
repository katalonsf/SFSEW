Feature: Per field validation 2

  Background: 
    Given I open a browser and after I max window I navigate to SF homepage
    When I enter my credentials and login to the page
    Then I click on the Gear icon and open the setup page
    And I click on the Search and search
    And search for CsoUser
    And I click on the login button on setup user page for CFO user
    And I try fo find billing acount #######
    And I Delete the unnecessary cookies
    And I reload the page
    And I click on CCPaument button for logged in CFO user

  @Login, @LoginAsCFO
  
  Scenario Outline: Validate Credit Card Payments via a SEW CSO Pulse Front End - Incorrect Card Type
    And I click on Credit Card Type and select Visa for the customer negative scenario
    And I enter credit card number for the customer negative scenario
    And I set the Expiry Date for negative scenario
    And I set the customer name for negative scenario
    And I set the CVV for negative scenario
    And I set the Amount for negative scenario
    And I enter on Submit to submit the payment form for negative scenario
    And I take an screenshot of the not successful payment page

    Examples: 
      | CCpayment customer | Credit Card Type | Card num            | Expiry Date | Name on the Card | CVN | Amount |
      | Customer Name      | card type        | 1111 1111 1111 1111 | 00/0000     | XXX XXX          | 000 |    150 |

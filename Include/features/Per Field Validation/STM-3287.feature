Feature: Per field validation 2

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
  Scenario Outline: Validate Credit Card Payments via a SEW CSO Pulse Front End - Incorrect Card Type
    And I click on Credit Card Type and select Master for AXXX X CXXX for negative scenario
    And I enter credit card number for AXXX X CXXX for negative scenario
    And I set the Expiry Date for negative scenario
    And I set the customer name for negative scenario
    And I set the CVV for negative scenario
    And I set the Amount for negative scenario
    And I enter on Submit to submit the payment form for negative scenario
    And I take an screenshot of the not successful payment page

    Examples: 
      | CCpayment customer | Credit Card Type | Card num            | Expiry Date | Name on the Card | CVN | Amount |
      | AXXX X CXXX        | MasterCard       | 1111 2222 3333 4444 | 03/2020     | AXXX X CXXX      | 111 |    150 |

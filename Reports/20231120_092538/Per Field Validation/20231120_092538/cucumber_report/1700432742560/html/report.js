$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HamidSamavat/Desktop/Katalon/Salesforce-MFA-Login-main/Salesforce-MFA-Login-main/Include/features/Per Field Validation/STM-2420.feature");
formatter.feature({
  "name": "Per field validation 1",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate Credit Card Payments via a SEW CSO Pulse Front End",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login,"
    },
    {
      "name": "@LoginAsCFO"
    }
  ]
});
formatter.step({
  "name": "I click on Credit Card Type and select Visa for AARON P CROSS",
  "keyword": "And "
});
formatter.step({
  "name": "I enter credit card number for AARON P CROSS",
  "keyword": "And "
});
formatter.step({
  "name": "I set the expiry date",
  "keyword": "And "
});
formatter.step({
  "name": "I set the customer name",
  "keyword": "And "
});
formatter.step({
  "name": "I set the CVV",
  "keyword": "And "
});
formatter.step({
  "name": "I set the Amount",
  "keyword": "And "
});
formatter.step({
  "name": "I enter on Submit to submit the payment form",
  "keyword": "And "
});
formatter.step({
  "name": "I take an screenshot of the successful payment page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "CCpayment customer",
        "Credit Card Type",
        "Card num",
        "Expiry Date",
        "Name on the Card",
        "CVN",
        "Amount"
      ]
    },
    {
      "cells": [
        "AARON P CROSS",
        "Visa",
        "4005 5500 0000 0001",
        "03/2027",
        "AARON P CROSS",
        "326",
        "150"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I open a browser and after I max window I navigate to SF homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "STM2485Iteration1.navigateToSFHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter my credentials and login to the page",
  "keyword": "When "
});
formatter.match({
  "location": "STM2485Iteration1.clickOnUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Gear icon and open the setup page",
  "keyword": "Then "
});
formatter.match({
  "location": "STM2485Iteration1.clickOnGearIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Search and search for Frank Murray",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.findCsoUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button on setup user page for Frank Murray",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.clickOnLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I try fo find billing acount 1042163",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.clickOnSearchAll()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Delete the unnecessary cookies",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.deleteCookies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I reload the page",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.reloadCurrentPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on CCPaument button for Frank Murray",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.clickOnCcPayment()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Credit Card Payments via a SEW CSO Pulse Front End",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login,"
    },
    {
      "name": "@LoginAsCFO"
    }
  ]
});
formatter.step({
  "name": "I click on Credit Card Type and select Visa for AARON P CROSS",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.definePaymentDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter credit card number for AARON P CROSS",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.enterCredit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the expiry date",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.setExpiry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the customer name",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.setcusname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the CVV",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.setCVV()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set the Amount",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.setAmount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter on Submit to submit the payment form",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.clickSubmit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I take an screenshot of the successful payment page",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.takeScreenshotPaymentSuccess()"
});
formatter.result({
  "status": "passed"
});
});
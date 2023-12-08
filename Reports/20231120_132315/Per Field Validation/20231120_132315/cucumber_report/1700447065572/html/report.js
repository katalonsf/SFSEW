$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HamidSamavat/Desktop/Katalon/Salesforce-MFA-Login-main/Salesforce-MFA-Login-main/Include/features/Per Field Validation/STM-3287.feature");
formatter.feature({
  "name": "Per field validation 2",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate Credit Card Payments via a SEW CSO Pulse Front End - Incorrect Card Type",
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
  "name": "I click on Credit Card Type and select Master for AARON P CROSS for negative scenario",
  "keyword": "And "
});
formatter.step({
  "name": "I enter credit card number for AARON P CROSS for negative scenario",
  "keyword": "And "
});
formatter.step({
  "name": "I set the Expiry Date for negative scenario",
  "keyword": "And "
});
formatter.step({
  "name": "I set the customer name for negative scenario",
  "keyword": "And "
});
formatter.step({
  "name": "I set the CVV for negative scenario",
  "keyword": "And "
});
formatter.step({
  "name": "I set the Amount for negative scenario",
  "keyword": "And "
});
formatter.step({
  "name": "I enter on Submit to submit the payment form for negative scenario",
  "keyword": "And "
});
formatter.step({
  "name": "I take an screenshot of the not successful payment page",
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
        "MasterCard",
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

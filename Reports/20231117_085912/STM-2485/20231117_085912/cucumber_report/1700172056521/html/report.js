$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HamidSamavat/Desktop/Katalon/Salesforce-MFA-Login-main/Salesforce-MFA-Login-main/Include/features/STM-2485/Iteration5.feature");
formatter.feature({
  "name": "Concession Management negative",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Concession not loaded successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I search for Billing Account# 1834935",
  "keyword": "And "
});
formatter.step({
  "name": "I choose Concession from Dropdwn-List- for negative scenario",
  "keyword": "And "
});
formatter.step({
  "name": "I create a new concession for Justin-Halcon-Fleur-Colcheedas",
  "keyword": "And "
});
formatter.step({
  "name": "I continue steps to create the new billing acount for Justin-Halcon-Fleur-Colcheedas",
  "keyword": "And "
});
formatter.step({
  "name": "I click on Yes,add concession radio button to procced the progress",
  "keyword": "And "
});
formatter.step({
  "name": "I capture the text which is the concession was not successfully added",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Billing Account Number: 1834935"
      ]
    },
    {
      "cells": [
        "Customer Name: Justin-Halcon-Fleur-Colcheedas"
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

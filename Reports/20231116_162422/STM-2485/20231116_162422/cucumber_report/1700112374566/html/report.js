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
  "name": "I click on the Search and search for Diana Turney",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.clickOnSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button on setup user page",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.clickOnButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
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
formatter.match({
  "location": "STM2485Iteration5.clickOnSearchAll()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose Concession from Dropdwn-List- for negative scenario",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration5.clickToDropdownList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create a new concession for Justin-Halcon-Fleur-Colcheedas",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration5.clickOnNextButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I continue steps to create the new billing acount for Justin-Halcon-Fleur-Colcheedas",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration5.checkOnDavidWrenn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Yes,add concession radio button to procced the progress",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration5.checkPrivacyStatement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I capture the text which is the concession was not successfully added",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration5.checkRadioButton()"
});
formatter.result({
  "status": "passed"
});
});
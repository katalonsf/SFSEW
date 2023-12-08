$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HamidSamavat/Desktop/Katalon/Salesforce-MFA-Login-main/Salesforce-MFA-Login-main/Include/features/STM-2485/Iteration1.feature");
formatter.feature({
  "name": "Concession Management",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Concession loaded successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I search for Billing Account# 188051",
  "keyword": "And "
});
formatter.step({
  "name": "I choose Concession from Dropdwn-List",
  "keyword": "And "
});
formatter.step({
  "name": "I remove the concession for David Wrenn from Billing account",
  "keyword": "And "
});
formatter.step({
  "name": "I add a new concession in billing account for David Wrenn",
  "keyword": "And "
});
formatter.step({
  "name": "I config the options in Concession Management page",
  "keyword": "And "
});
formatter.step({
  "name": "I click on Yes to add the concession",
  "keyword": "And "
});
formatter.step({
  "name": "I verify that the phrase Successfuly Added present and take a full screenshot",
  "keyword": "And "
});
formatter.step({
  "name": "I click on the Finish Button",
  "keyword": "And "
});
formatter.step({
  "name": "I take a full screenshot and close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Billing Account Number: 188051"
      ]
    },
    {
      "cells": [
        "Customer Name: David \u0026 Sally  Wrenn"
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
  "name": "Concession loaded successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I search for Billing Account# 188051",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.clickOnSearchAll()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose Concession from Dropdwn-List",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.clickToSeeAllItemsInList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove the concession for David Wrenn from Billing account",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.clickOnNextButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a new concession in billing account for David Wrenn",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.checkOnDavidWrenn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I config the options in Concession Management page",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.checkPrivacyStatement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Yes to add the concession",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.checkRadioButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that the phrase Successfuly Added present and take a full screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.verifyPhraseIsPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Finish Button",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.clickOnFinishButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I take a full screenshot and close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});
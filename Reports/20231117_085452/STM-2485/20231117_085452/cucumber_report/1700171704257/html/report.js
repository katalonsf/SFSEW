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
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to click on object \u0027Object Repository/IFrames/Concession/Next-Button\u0027\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.click(ClickKeyword.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.execute(ClickKeyword.groovy:40)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.click(WebUiBuiltInKeywords.groovy:620)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$click$3.call(Unknown Source)\r\n\tat STM2485Iteration1.clickOnNextButton(STM2485Iteration1.groovy:129)\r\n\tat ✽.I remove the concession for David Wrenn from Billing account(C:/Users/HamidSamavat/Desktop/Katalon/Salesforce-MFA-Login-main/Salesforce-MFA-Login-main/Include/features/STM-2485/Iteration1.feature:16)\r\nCaused by: com.kms.katalon.core.webui.exception.WebElementNotFoundException: Web element with id: \u0027Object Repository/IFrames/Concession/Next-Button\u0027 located by \u0027//button[normalize-space()\u003d\u0027Next\u0027]\n\u0027 not found\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElement(WebUiCommonHelper.java:1381)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:27)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword$_click_closure1.doCall(ClickKeyword.groovy:65)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword$_click_closure1.call(ClickKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.click(ClickKeyword.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.execute(ClickKeyword.groovy:40)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.click(WebUiBuiltInKeywords.groovy:620)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$click$3.call(Unknown Source)\r\n\tat STM2485Iteration1.clickOnNextButton(STM2485Iteration1.groovy:129)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:70)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:52)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:69)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat STM-2485-Iteration1-BDD.run(STM-2485-Iteration1-BDD:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:448)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:439)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:418)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:410)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:285)\r\n\tat com.kms.katalon.core.common.CommonExecutor.accessTestCaseMainPhase(CommonExecutor.java:65)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:148)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:106)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:187)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1700171692605.run(TempTestSuite1700171692605.groovy:36)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I add a new concession in billing account for David Wrenn",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.checkOnDavidWrenn()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I config the options in Concession Management page",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.checkPrivacyStatement()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Yes to add the concession",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.checkRadioButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify that the phrase Successfuly Added present and take a full screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.verifyPhraseIsPresent()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on the Finish Button",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.clickOnFinishButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I take a full screenshot and close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "STM2485Iteration1.closeBrowser()"
});
formatter.result({
  "status": "skipped"
});
});
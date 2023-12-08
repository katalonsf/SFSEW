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
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to click on object \u0027Object Repository/Home-Setup/Frank Murray\u0027\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.click(ClickKeyword.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.execute(ClickKeyword.groovy:40)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.click(WebUiBuiltInKeywords.groovy:620)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$click$3.call(Unknown Source)\r\n\tat STM2420.findCsoUser(STM2420.groovy:59)\r\n\tat ✽.I click on the Search and search for Frank Murray(C:/Users/HamidSamavat/Desktop/Katalon/Salesforce-MFA-Login-main/Salesforce-MFA-Login-main/Include/features/Per Field Validation/STM-3287.feature:7)\r\nCaused by: com.kms.katalon.core.webui.exception.WebElementNotFoundException: Web element with id: \u0027Object Repository/Home-Setup/Frank Murray\u0027 located by \u0027//a[normalize-space()\u003d\u0027Frank Murray\u0027]\u0027 not found\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElement(WebUiCommonHelper.java:1381)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:27)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword$_click_closure1.doCall(ClickKeyword.groovy:65)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword$_click_closure1.call(ClickKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.click(ClickKeyword.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.execute(ClickKeyword.groovy:40)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.click(WebUiBuiltInKeywords.groovy:620)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$click$3.call(Unknown Source)\r\n\tat STM2420.findCsoUser(STM2420.groovy:59)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:70)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:52)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:69)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat STM-3287.run(STM-3287:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:448)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:439)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:418)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:410)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:285)\r\n\tat com.kms.katalon.core.common.CommonExecutor.accessTestCaseMainPhase(CommonExecutor.java:65)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:148)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:106)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:187)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1700432738692.run(TempTestSuite1700432738692.groovy:36)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I click on the login button on setup user page for Frank Murray",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.clickOnLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I try fo find billing acount 1042163",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.clickOnSearchAll()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Delete the unnecessary cookies",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.deleteCookies()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I reload the page",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.reloadCurrentPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on CCPaument button for Frank Murray",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.clickOnCcPayment()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
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
formatter.match({
  "location": "STM3287.definePaymentDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter credit card number for AARON P CROSS for negative scenario",
  "keyword": "And "
});
formatter.match({
  "location": "STM3287.enterCredit()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set the Expiry Date for negative scenario",
  "keyword": "And "
});
formatter.match({
  "location": "STM3287.setExpiry()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set the customer name for negative scenario",
  "keyword": "And "
});
formatter.match({
  "location": "STM3287.setcusname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set the CVV for negative scenario",
  "keyword": "And "
});
formatter.match({
  "location": "STM3287.setCVV()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set the Amount for negative scenario",
  "keyword": "And "
});
formatter.match({
  "location": "STM3287.setAmount()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter on Submit to submit the payment form for negative scenario",
  "keyword": "And "
});
formatter.match({
  "location": "STM3287.clickSubmit()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I take an screenshot of the not successful payment page",
  "keyword": "And "
});
formatter.match({
  "location": "STM3287.takeScreenshotPaymentSuccess()"
});
formatter.result({
  "status": "skipped"
});
});
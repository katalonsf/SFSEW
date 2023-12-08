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
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to wait for object \u0027Object Repository/Home-Setup/Frank Murray\u0027 to be clickable\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.WaitForElementClickableKeyword.waitForElementClickable(WaitForElementClickableKeyword.groovy:107)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.WaitForElementClickableKeyword.execute(WaitForElementClickableKeyword.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.waitForElementClickable(WebUiBuiltInKeywords.groovy:504)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$waitForElementClickable$8.call(Unknown Source)\r\n\tat STM2420.findCsoUser(STM2420.groovy:59)\r\n\tat ✽.I click on the Search and search for Frank Murray(C:/Users/HamidSamavat/Desktop/Katalon/Salesforce-MFA-Login-main/Salesforce-MFA-Login-main/Include/features/Per Field Validation/STM-2420.feature:7)\r\nCaused by: org.openqa.selenium.WebDriverException: disconnected: not connected to DevTools\n  (failed to check if window was closed: disconnected: not connected to DevTools)\n  (Session info: chrome\u003d119.0.6045.160)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027DESKTOP-BG27TAB\u0027, ip: \u0027192.168.1.127\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_362\u0027\nDriver info: com.kms.katalon.selenium.driver.CChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 119.0.6045.160, chrome: {chromedriverVersion: 119.0.6045.105 (38c72552c5e..., userDataDir: C:\\Users\\HAMIDS~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:57527}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 83e552098d0956b6cc4109a4ccef859a\n*** Element info: {Using\u003dxpath, value\u003d//a[normalize-space()\u003d\u0027Frank Murray\u0027]}\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat com.kms.katalon.selenium.driver.CChromeDriver.execute(CChromeDriver.java:19)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:432)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.lambda$new$1(EventFiringWebDriver.java:105)\r\n\tat com.sun.proxy.$Proxy18.findElements(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElements(EventFiringWebDriver.java:182)\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findElementByNormalMethods(WebUiCommonHelper.java:1027)\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findElementsBySelectedMethod(WebUiCommonHelper.java:919)\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findElementsBySelectedMethod(WebUiCommonHelper.java:901)\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findElementsBySelectedMethod(WebUiCommonHelper.java:896)\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findElementsByDefault(WebUiCommonHelper.java:892)\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElements(WebUiCommonHelper.java:720)\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElement(WebUiCommonHelper.java:1376)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:27)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword$findWebElement.call(Unknown Source)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.WaitForElementClickableKeyword$_waitForElementClickable_closure1.doCall(WaitForElementClickableKeyword.groovy:79)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.WaitForElementClickableKeyword$_waitForElementClickable_closure1.doCall(WaitForElementClickableKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.WaitForElementClickableKeyword.waitForElementClickable(WaitForElementClickableKeyword.groovy:107)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.WaitForElementClickableKeyword.execute(WaitForElementClickableKeyword.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.waitForElementClickable(WebUiBuiltInKeywords.groovy:504)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$waitForElementClickable$8.call(Unknown Source)\r\n\tat STM2420.findCsoUser(STM2420.groovy:59)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:70)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:52)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:69)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat STM-2420.run(STM-2420:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:448)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:439)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:418)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:410)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:285)\r\n\tat com.kms.katalon.core.common.CommonExecutor.accessTestCaseMainPhase(CommonExecutor.java:65)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:148)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:106)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:187)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1700446995893.run(TempTestSuite1700446995893.groovy:36)\r\n",
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
  "status": "skipped"
});
formatter.step({
  "name": "I enter credit card number for AARON P CROSS",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.enterCredit()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set the expiry date",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.setExpiry()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set the customer name",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.setcusname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set the CVV",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.setCVV()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set the Amount",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.setAmount()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter on Submit to submit the payment form",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.clickSubmit()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I take an screenshot of the successful payment page",
  "keyword": "And "
});
formatter.match({
  "location": "STM2420.takeScreenshotPaymentSuccess()"
});
formatter.result({
  "status": "skipped"
});
});
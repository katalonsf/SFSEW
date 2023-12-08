package clearSiteData

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.openqa.selenium.chrome.ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.remote.DesiredCapabilities;



import org.openqa.selenium.JavascriptExecutor


public class ClearSiteDataKeyword {

	@Keyword
	public static void clearSiteData() {
		// Get the WebDriver instance
		def driver = DriverFactory.getWebDriver()

		// Execute JavaScript to clear site data
		((JavascriptExecutor) driver).executeScript("window.localStorage.clear();")
		((JavascriptExecutor) driver).executeScript("window.sessionStorage.clear();")
		((JavascriptExecutor) driver).executeScript("document.cookie.split(';').forEach(function(c) { document.cookie = c.replace(/^\\s+/,'').replace(/=.*/, '=;expires=' + new Date().toUTCString() + ';path=/'); });")
	}
}


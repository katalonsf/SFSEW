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

import com.kms.katalon.core.webui.driver.DriverFactory

import org.openqa.selenium.Cookie

import internal.GlobalVariable


// Method to delete Salesforce-related cookies
public static void deleteSalesforceCookies() {
	// Get the WebDriver instance from DriverFactory
	def driver = DriverFactory.getWebDriver()

	// Get all cookies from the WebDriver
	Set<Cookie> cookies =  driver.manage().getCookies();
	
	//List<Cookie> cookies = driver.manage().getCookies()

	// Loop through the cookies and delete the Salesforce-related cookies
	for (Cookie cookie : cookies) {
		if (cookie.getDomain().contains('salesforce')) {
			driver.manage().deleteCookie(cookie)
		}
	}
}




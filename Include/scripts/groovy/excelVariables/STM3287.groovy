package excelVariables

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Cookie
import java.util.Date
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.selenium.driver.CChromeDriver
import org.openqa.selenium.ElementNotInteractableException as ElementNotInteractableException
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebDriver as WebDriver
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.openqa.selenium.chrome.ChromeOptions
import groovy.lang.GroovyShell
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*

import clearSiteData.ClearSiteDataKeyword
import org.openqa.selenium.interactions.Actions
import java.awt.datatransfer.StringSelection
import java.awt.Toolkit
import java.awt.datatransfer.Clipboard


public class STM3287 {

	@And ("I click on Credit Card Type and select Visa for the customer negative scenario")
	def definePaymentDetails() {


		//WebUI.waitForElementClickable(('IFrames/Pay Bill/Credit Card Type'), 10)

		WebUI.selectOptionByValue(findTestObject('IFrames/Pay Bill/Credit Card Type'), 'MasterCard', true, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@And ("I enter credit card number for the customer negative scenario")
	def enterCredit() {
		CreditCardNumber1.performExcelOperation()
		CreditCardNumber2.performExcelOperation()
		CreditCardNumber3.performExcelOperation()
		CreditCardNumber4.performExcelOperation()
	}

	@And ("I set the Expiry Date for negative scenario")
	def setExpiry() {
		WebUI.click(findTestObject('IFrames/Pay Bill/Expiry Date Month'))
		WebUI.selectOptionByValue(findTestObject('IFrames/Pay Bill/Expiry Date Month'), '03', true, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('IFrames/Pay Bill/Expiry Date Year'))
		WebUI.selectOptionByValue(findTestObject('IFrames/Pay Bill/Expiry Date Year'), '2027', true, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@And ("I set the customer name for negative scenario")
	def setcusname() {
		// Identify the source field and click
		def sourceField = findTestObject('Object Repository/IFrames/Pay Bill/Customer')
		WebUI.waitForElementVisible(sourceField, 10)
		WebUI.click(sourceField)

		// Use Actions class to perform Ctrl+A and then Ctrl+C
		def actions = new Actions(DriverFactory.getWebDriver())
		actions.keyDown(Keys.CONTROL).sendKeys('a').keyUp(Keys.CONTROL).perform()
		actions.keyDown(Keys.CONTROL).sendKeys('c').keyUp(Keys.CONTROL).perform()

		// Identify the target field and paste the text
		def targetField = findTestObject('Object Repository/IFrames/Pay Bill/Name on card')
		WebUI.waitForElementVisible(targetField, 10)
		WebUI.click(targetField)

		// Use Actions class to perform Ctrl+V
		actions.keyDown(Keys.CONTROL).sendKeys('v').keyUp(Keys.CONTROL).perform()
	}

	@And ("I set the CVV for negative scenario")
	def setCVV() {
		CVV.performExcelOperation()
	}


	@And ("I set the Amount for negative scenario")
	def setAmount() {
		//WebUI.click(findTestObject('Object Repository/IFrames/Pay Bill/Amount', Keys.chord(Keys.CONTROL, 'a', Keys.DELETE)))
		WebUI.setText(findTestObject('Object Repository/IFrames/Pay Bill/Amount'), ('150'))
	}

	@And ("I enter on Submit to submit the payment form for negative scenario")
	def clickSubmit() {
		WebUI.sendKeys(findTestObject('Object Repository/IFrames/Pay Bill/Submit(pay bill)'), Keys.chord(Keys.ENTER))
	}

	@And ("I take an screenshot of the not successful payment page")
	def takeScreenshotPaymentSuccess() {
		WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
		WebUI.takeFullPageScreenshot()
		WebUI.closeBrowser()
	}
}


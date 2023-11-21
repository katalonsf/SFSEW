import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Cookie
import java.util.Date
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.selenium.driver.CChromeDriver as CChromeDriver
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



public class STM2420 {


	@And("I click on the Search and search for FXXX MXXX")
	def findCsoUser() {
		WebUI.click(findTestObject('Home-Setup/Search'))
		WebUI.switchToWindowIndex(1)
		WebUI.setText(findTestObject('Home-Setup/Search-add-values'), 'FXXX MXXX')
		WebUI.sendKeys(findTestObject('Home-Setup/Search-add-values'), Keys.chord(Keys.ENTER))
		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForElementClickable(findTestObject('Home-Setup/FXXX MXXX'), 10)
		WebUI.click(findTestObject('Home-Setup/FXXX MXXX'))
		WebUI.waitForElementPresent(findTestObject('IFrames/setup-users'), 10)
		WebUI.switchToFrame(findTestObject('IFrames/setup-users'), 10)
	}

	@And("I click on the login button on setup user page for FXXX MXXX")
	def clickOnLogin() {
		WebUI.click(findTestObject('IFrames/login button'))
		WebUI.switchToDefaultContent()
		// Implementation to click on the login button for FXXX MXXX
	}

	@And ("I try fo find billing acount 12345")
	def clickOnSearchAll() {
		WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Service-Console/search catagory'))
		WebUI.click(findTestObject('Service-Console/Billing-Account-Search-Box'))
		WebUI.waitForElementPresent(findTestObject('Service-Console/Search box'), 10)
		WebUI.setText(findTestObject('Service-Console/Search box'), '12345')
		WebUI.sendKeys(findTestObject('Service-Console/Search box'), Keys.chord(Keys.ENTER))
		WebUI.waitForElementClickable(findTestObject('Service-Console/Billing-Account'), 10)
		List<WebElement> elementsWithText = DriverFactory.getWebDriver().findElements(By.xpath('//a[@title="12345"]'))
		if (elementsWithText.size() > 0) {
			(elementsWithText[0]).click()
		} else {
			WebUI.comment('Element with text \'12345\' not found.')
		}
		WebUI.delay(20, FailureHandling.STOP_ON_FAILURE)
	}

	// Specify the names of the cookies to delete

	@And ("I Delete the unnecessary cookies")

	def deleteCookies() {

		WebUI.callTestCase(findTestCase('Test Cases/DeleteSfCookies'), [:], FailureHandling.STOP_ON_FAILURE)
	}



	@And ("I reload the page")
	def reloadCurrentPage( ) {


		WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
		// Get the current URL
		def currentUrl = DriverFactory.getWebDriver().getCurrentUrl()

		// Reload the page
		WebUI.navigateToUrl(currentUrl)
	}

	@And ("I click on CCPaument button for FXXX MXXX")
	def clickOnCcPayment() {

		WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Billing-Account-Num/Button-List/CCPayment'))
		WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
		WebUI.switchToFrame(findTestObject('IFrames/Pay Bill/Frame'), 10)
		WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

	}


	@And ("I click on Credit Card Type and select Visa for AXXX X CXXX")
	def definePaymentDetails() {

		WebUI.selectOptionByValue(findTestObject('IFrames/Pay Bill/Credit Card Type'), 'Visa', true, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@And ("I enter credit card number for AXXX X CXXX")
	def enterCredit() {

		WebUI.setText(findTestObject('Object Repository/IFrames/Pay Bill/Credit Card num 1'), '1111')

		WebUI.setText(findTestObject('Object Repository/IFrames/Pay Bill/Credit Card num 2'), '2222')

		WebUI.setText(findTestObject('Object Repository/IFrames/Pay Bill/Credit Card num 3'), '3333')

		WebUI.setText(findTestObject('Object Repository/IFrames/Pay Bill/Credit Card num 4'), '4444')
	}

	@And ("I set the expiry date")
	def setExpiry() {
		WebUI.click(findTestObject('IFrames/Pay Bill/Expiry Date Month'))
		WebUI.selectOptionByValue(findTestObject('IFrames/Pay Bill/Expiry Date Month'), '03', true, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('IFrames/Pay Bill/Expiry Date Year'))
		WebUI.selectOptionByValue(findTestObject('IFrames/Pay Bill/Expiry Date Year'), '2020', true, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@And ("I set the customer name")
	def setcusname() {
		WebUI.setText(findTestObject('Object Repository/IFrames/Pay Bill/Name on card'), 'AXXX X CXXX')

	}

	@And ("I set the CVV")
	def setCVV() {
		WebUI.setText(findTestObject('Object Repository/IFrames/Pay Bill/CVN'), '111')
	}


	@And ("I set the Amount")
	def setAmount() {

		WebUI.setText(findTestObject('Object Repository/IFrames/Pay Bill/Amount'), ('150'))
	}

	@And ("I enter on Submit to submit the payment form")
	def clickSubmit() {
		WebUI.sendKeys(findTestObject('Object Repository/IFrames/Pay Bill/Submit(pay bill)'), Keys.chord(Keys.ENTER))
	}

	@And ("I take an screenshot of the successful payment page")
	def takeScreenshotPaymentSuccess() {
		WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()

	}
}

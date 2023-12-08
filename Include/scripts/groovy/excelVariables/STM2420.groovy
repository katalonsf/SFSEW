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




public class STM2420 {


	@And("I click on the Search and search")
	def clickFindingCsoUser() {
		WebUI.switchToWindowIndex(1)
		WebUI.click(findTestObject('Home-Setup/Search'))
		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
	}

	//******* Using ExcelReader Keyword CSO User *******
	@And("search for CsoUser")
	def findCsoUser() {
		//**Calling form ExcelOperations.Groovy**//
		// Call the ExcelReaderUtils
		SwitchUserCFO.performExcelOperation()
		
		// Add assertions or other test steps as needed

		WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
		WebUI.sendKeys(findTestObject('Home-Setup/Search-add-values'), Keys.chord(Keys.ENTER))
		WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForElementClickable(findTestObject('Home-Setup/F-M'), 3)
		WebUI.click(findTestObject('Home-Setup/F-M'))
		WebUI.waitForElementPresent(findTestObject('IFrames/setup-users'), 3)
		WebUI.switchToFrame(findTestObject('IFrames/setup-users'), 3)
	}

	@And ("I click on the login button on setup user page for CFO user")
	def clickOnLogin() {
		WebUI.click(findTestObject('IFrames/login button'))
		WebUI.switchToDefaultContent()
		// Implementation to click on the login button for CFO user
	}

	@And ("I try fo find billing acount #######")
	def clickOnSearchAll() {
		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Service-Console/search catagory'))
		WebUI.click(findTestObject('Service-Console/Billing-Account-Search-Box'))
		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Service-Console/Billing-Account'))

		//**Calling form ExcelOperations.Groovy**//
		// Call the ExcelReaderUtils
		BillingAccountCFO.performExcelOperation()


		//WebUI.setText(findTestObject('Service-Console/Search-box')
		WebUI.sendKeys(findTestObject('Service-Console/Search-box'), Keys.chord(Keys.ENTER))
		WebUI.waitForElementClickable(findTestObject('Object Repository/Service-Console/Billing-Account'), 5)


		List<WebElement> elementsWithText = DriverFactory.getWebDriver().findElements(By.xpath("//a[contains(@class, 'slds-truncate outputLookupLink slds-truncate outputLookupLink-a0890000007a0l6AAA')]"))
		if (elementsWithText.size() > 0) {
			(elementsWithText[0]).click()
		}
		else {
			WebUI.comment('Element with this billing number not found.')
		}
		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

		// Implementation to search Billing Account ### and open the Billing account page
	}

	//*** Delete cookies ***//
	
	@And ("I Delete the unnecessary cookies to load CCPayment button")
	def clearSitData( ) {

		ClearSiteDataKeyword.clearSiteData()

	}
	@And ("I reload the page to click on CCPayment button")
	def reloadCurrentPage( ) {

		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		// Get the current URL
		def currentUrl = DriverFactory.getWebDriver().getCurrentUrl()

		// Reload the page
		WebUI.navigateToUrl(currentUrl)
	}

	@And ("I click on CCPaument button for logged in CFO user")
	def clickOnCcPayment() {
		//WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
		//WebUI.navigateToUrl('https://southeastwater--full2.sandbox.lightning.force.com/lightning/r/Billing_Account__c/a0890000007a0l6AAA/view')
		WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Billing-Account-Num/Button-List/CCPayment'))
		WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
		WebUI.switchToFrame(findTestObject('IFrames/Pay Bill/Frame'), 10)
		WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

	}


	@And ("I click on Credit Card Type and select Visa for the customer")
	def definePaymentDetails() {


		//WebUI.waitForElementClickable(('IFrames/Pay Bill/Credit Card Type'), 10)

		WebUI.selectOptionByValue(findTestObject('IFrames/Pay Bill/Credit Card Type'), 'Visa', true, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@And ("I enter credit card number for the customer")
	def enterCredit() {
		CreditCardNumber1.performExcelOperation()
		CreditCardNumber2.performExcelOperation()
		CreditCardNumber3.performExcelOperation()
		CreditCardNumber4.performExcelOperation()

	}

	@And ("I set the expiry date")
	def setExpiry() {
		WebUI.click(findTestObject('IFrames/Pay Bill/Expiry Date Month'))
		WebUI.selectOptionByValue(findTestObject('IFrames/Pay Bill/Expiry Date Month'), '03', true, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('IFrames/Pay Bill/Expiry Date Year'))
		WebUI.selectOptionByValue(findTestObject('IFrames/Pay Bill/Expiry Date Year'), '2027', true, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@And ("I set the customer name")
	def setcutomername() {

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

	@And ("I set the CVV")
	def setCVV() {

		CVV.performExcelOperation()
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
		WebUI.click(findTestObject('Object Repository/LogOutSession/View Profile'))
		//WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/LogOutSession/Log Out'))
		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/LogOutSession/View Profile'))
		//WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/LogOutSession/Log Out'))
		//WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()

	}
}

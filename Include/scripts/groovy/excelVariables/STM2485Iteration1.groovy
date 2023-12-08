package excelVariables

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.selenium.driver.CChromeDriver as CChromeDriver
import org.openqa.selenium.ElementNotInteractableException as ElementNotInteractableException
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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

import org.openqa.selenium.chrome.ChromeOptions
import groovy.lang.GroovyShell
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import clearSiteData.ClearSiteDataKeyword
import org.openqa.selenium.interactions.Actions
import java.awt.datatransfer.StringSelection
import java.awt.Toolkit
import java.awt.datatransfer.Clipboard




class STM2485Iteration1 {

	@Given("I open a browser and after I max window I navigate to SF homepage")
	def navigateToSFHomepage(){
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://southeastwater--full2.sandbox.lightning.force.com/lightning/page/home')
		// Implementation to open a browser and navigate to SF homepage
	}

	@When("I enter my credentials and login to the page")
	def clickOnUsername() {
		WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Page_Login  Salesforce/Input-Username'))
		WebUI.setText(findTestObject('Page_Login  Salesforce/input-username-Text'), 'hamid.samavat@kjr.com.au')
		WebUI.click(findTestObject('Page_Login  Salesforce/input-username-next'))
		WebUI.click(findTestObject('Page_Login  Salesforce/input_Password_pw'))
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_pw'), '1SfOns6koWoi404fwi/OCQ==')
		WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_Login'))
		WebUI.delay(15)
		WebUI.click(findTestObject('Page_Login  Salesforce/Yes button'))
		// Implementation to enter credentials 
	}

	@Then("I click on the Gear icon and open the setup page")
	def clickOnGearIcon() {
		WebUI.click(findTestObject('home page/Gear icon'))
		WebUI.click(findTestObject('home page/Setup'))
		// Implementation to click on the Gear icon and then open setup page 
	}

	@And("I click on the Search and search for SCO user")
	def clickOnSearch() {
		WebUI.switchToWindowIndex(1)
		WebUI.click(findTestObject('Home-Setup/Search'))
		
		//**Calling form ExcelOperations.Groovy**//
		// Call the ExcelReaderUtils
		SwitchUserCSO.performExcelOperation()
		
		WebUI.sendKeys(findTestObject('Home-Setup/Search-add-values'), Keys.chord(Keys.ENTER))
		WebUI.waitForElementClickable(findTestObject('Home-Setup/D-T'), 5)
		WebUI.click(findTestObject('Home-Setup/D-T'))
		WebUI.waitForElementPresent(findTestObject('IFrames/setup-users'), 5)
		WebUI.switchToFrame(findTestObject('IFrames/setup-users'), 5)
		// Implementation to login as SCO user
	}

	@And("I click on the login button on setup user page for SCO user")
	def clickOnButton() {
		WebUI.click(findTestObject('IFrames/login button'))
		WebUI.switchToDefaultContent()
		// Implementation to click on the login button 
	}

	@And("I search for Billing Account# XXXX")
	def clickOnSearchBillingAccount() {
		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Service-Console/search catagory'))
		WebUI.click(findTestObject('Service-Console/Billing-Account-Search-Box'))
		WebUI.waitForElementPresent(findTestObject('Service-Console/Search-box'), 5)
		
		//**Calling form ExcelOperations.Groovy**//
		// Call the ExcelReaderUtils
		BillingAccountCSO.performExcelOperation()
		
		WebUI.sendKeys(findTestObject('Service-Console/Search-box'), Keys.chord(Keys.ENTER))
		WebUI.waitForElementClickable(findTestObject('Service-Console/Billing-Account'), 5)
		List<WebElement> elementsWithText = DriverFactory.getWebDriver().findElements(By.xpath("(//a[contains(@class, 'slds-truncate outputLookupLink slds-truncate outputLookupLink')])[1]"))
		if (elementsWithText.size() > 0) {                                                                              
			(elementsWithText[0]).click()
		} else {
			WebUI.comment('Element with this billing number not found.')
			KeywordUtil.markFailed('Billing number not found.')
		}

		// Implementation to search Billing Account# 188051 and open the Billing account page 
	}

	//*** Delete cookies ***//
	
	@And ("I Delete the unnecessary cookies to load concession button")
	def clearSitData( ) {

		ClearSiteDataKeyword.clearSiteData()
	}
		
	@And ("I reload the page to click on concession button")
	def reloadCurrentPage( ) {

		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		// Get the current URL
		def currentUrl = DriverFactory.getWebDriver().getCurrentUrl()

		// Reload the page
		WebUI.navigateToUrl(currentUrl)
	}
	
	@And("I choose Concession")
	def clickToSeeAllItemsInList() {
		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Billing-Account-Num/Button-List/Concession'))
		WebUI.switchToFrame(findTestObject('IFrames/Concession/Concession-Managment'), 5)
		// Implementation to click on an element to see all the items in the list 
	}

	@And("I remove the concession for customer from Billing account")
	def clickOnNextButton() {
		WebUI.check(findTestObject('IFrames/Concession/Yes-Radio-Button'))
		WebUI.click(findTestObject('IFrames/Concession/Next-Button'))
		WebUI.check(findTestObject('IFrames/Concession/Yes-Remove-Radio-Button'))
		WebUI.click(findTestObject('IFrames/Concession/Next-Button'))
		WebUI.click(findTestObject('IFrames/Concession/Next-Button'))
		WebUI.delay(5)
		// Implementation to click on the Next-Button
	}

	@And ("I add a new concession in billing account for customer")
	def checkOnDW() {
		WebUI.check(findTestObject('IFrames/Concession/D-W'))
		WebUI.click(findTestObject('IFrames/Concession/Concession-Type'))
		WebUI.click(findTestObject('IFrames/Concession/Account-Holder'))
		WebUI.click(findTestObject('IFrames/Concession/Next-Button'))
		// Implementation to add new concession for the customer (AT=Account Holder) 
	}

	@And("I config the options in Concession Management page")
	def checkPrivacyStatement() {
		WebUI.check(findTestObject('IFrames/Concession/Privacy-Statement-CheckBox'))
		
		//**Calling form ExcelOperations.Groovy**//
		// Call the ExcelReaderUtils
		ConcessionCardNumber.performExcelOperation()
		
		WebUI.click(findTestObject('IFrames/Concession/Concession-Card-Type'))
		WebUI.click(findTestObject('IFrames/Concession/Pensioner-Concession-Card'))
		WebUI.click(findTestObject('IFrames/Concession/Next-Button'))
		// Implementation to continue the new concession steps 
	}

	@And("I click on Yes to add the concession")
	def checkRadioButton() {
		WebUI.check(findTestObject('IFrames/Concession/Yes-Add-Concession-Radio-Button'))
		WebUI.click(findTestObject('IFrames/Concession/Next-Button'))
		// Implementation to check the specified radio button 
	}

	@And("I verify that the phrase Successfuly Added present and take a full screenshot")
	def verifyPhraseIsPresent() {
		WebUI.verifyElementPresent(findTestObject('IFrames/Concession/Successfuly-Added'), 0)
		WebUI.takeFullPageScreenshot()
		WebUI.delay(10)
		WebUI.click(findTestObject('IFrames/Concession/Next-Button'))
		// Implementation to verify the presence of the specified phrase 
	}

	@And("I click on the Finish Button")
	def clickOnFinishButton() {
		WebUI.click(findTestObject('IFrames/Concession/Finish'))
		// Implementation to click on the Finish-Button 
	}

	@And("I take a full screenshot and close the browser")
	def closeBrowser() {
		WebUI.takeFullPageScreenshot()
		WebUI.closeBrowser()
		// Implementation to close the browser 
	}
}
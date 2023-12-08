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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import clearSiteData.ClearSiteDataKeyword
import org.openqa.selenium.interactions.Actions
import java.awt.datatransfer.StringSelection
import java.awt.Toolkit
import java.awt.datatransfer.Clipboard

public class STM2485Iteration5 {

	@And("I search for Billing Account# XXXXXX")
	def clickOnSearchBillingAccountNegative() {
		WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Service-Console/search catagory'))
		WebUI.click(findTestObject('Service-Console/Billing-Account-Search-Box'))
		WebUI.waitForElementPresent(findTestObject('Service-Console/Search-box'), 10)
		
		//**Calling form ExcelOperations.Groovy**//
		// Call the ExcelReaderUtils
		BillingAccountCSONegative.performExcelOperation()
		
		WebUI.sendKeys(findTestObject('Service-Console/Search-box'), Keys.chord(Keys.ENTER))
		WebUI.waitForElementClickable(findTestObject('Service-Console/Billing-Account'), 10)

		// Find all elements with the text 
		List<WebElement> elementsWithText = DriverFactory.getWebDriver().findElements(By.xpath("(//a[contains(@class, 'slds-truncate outputLookupLink slds-truncate outputLookupLink')])[1]"))

		// Check if any elements with the specified text were found
		if (elementsWithText.size() > 0) {
			// Click on the first element with the text "188051" (you can change this logic if you have multiple matching elements)
			(elementsWithText[0]).click()
		} else {
			WebUI.comment('Billing number not found.')
		}


	}
	
	@And ("I Delete the unnecessary cookies to load concession button negative scenario")
	def clearSitData( ) {

		ClearSiteDataKeyword.clearSiteData()
	}
		
	@And ("I reload the page to click on concession button negative scenario")
	def reloadCurrentPage( ) {

		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		// Get the current URL
		def currentUrl = DriverFactory.getWebDriver().getCurrentUrl()

		// Reload the page
		WebUI.navigateToUrl(currentUrl)
	}

	@And("I choose Concession negative scenario")
	def clickToDropdownList() {
		WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Billing-Account-Num/Button-List/Concession'))
		WebUI.switchToFrame(findTestObject('IFrames/Concession/Concession-Managment'), 5)

		// Implementation to click on an element to see all the items in the list 
	}

	@And("I create a new concession for J-F-C")
	def clickOnNextButton() {
		WebUI.delay(10)
		WebUI.check(findTestObject('IFrames/Concession/J-F-C'))
		WebUI.click(findTestObject('IFrames/Concession/Concession-Type'))
		WebUI.click(findTestObject('IFrames/Concession/Account-Holder'))
		WebUI.click(findTestObject('IFrames/Concession/Next-Button'))
		WebUI.delay(10)
		// Implementation to click on the Next-Button 
	}

	@And ("I continue steps to create the new billing acount for the customer negative")
	def checkOnJF() {
		WebUI.check(findTestObject('IFrames/Concession/Privacy-Statement-CheckBox'))
		
		//**Calling form ExcelOperations.Groovy**//
		// Call the ExcelReaderUtils
		ConcessionCardNumberNegative.performExcelOperation()
				
		WebUI.click(findTestObject('IFrames/Concession/Concession-Card-Type'))
		WebUI.click(findTestObject('IFrames/Concession/Health-Care-Card'))
		WebUI.click(findTestObject('IFrames/Concession/Next-Button'))
		WebUI.delay(10)
		// Implementation to add new concession for the Customer (AT=Account Holder) 
	}

	@And("I click on Yes,add concession radio button to procced the progress")
	def checkPrivacyStatement() {
		WebUI.check(findTestObject('IFrames/Concession/Yes-Add-Concession-Radio-Button'))
		WebUI.click(findTestObject('IFrames/Concession/Next-Button'))
		WebUI.delay(10)
		// Implementation to continue the new concession steps 
	}

	@And("I capture the text which is the concession was not successfully added")
	def checkRadioButton() {
		WebUI.verifyElementPresent(findTestObject('IFrames/Concession/Not-Successfully-Added'), 0)
		def NotSuccessfullyAdded = WebUI.getText(findTestObject('IFrames/Concession/Not-Successfully-Added'))
		System.out.println(NotSuccessfullyAdded + '****')
		WebUI.takeFullPageScreenshot()
		WebUI.closeBrowser()
		// Implementation to check the specified radio button 
	}

}


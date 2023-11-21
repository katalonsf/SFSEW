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

public class STM2485Iteration5 {

	@And("I search for Billing Account# 12345")
	def clickOnSearchAll() {
		WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Service-Console/search catagory'))
		WebUI.click(findTestObject('Service-Console/Billing-Account-Search-Box'))
		WebUI.waitForElementPresent(findTestObject('Service-Console/Search box'), 10)
		WebUI.setText(findTestObject('Service-Console/Search box'), '12345')
		WebUI.sendKeys(findTestObject('Service-Console/Search box'), Keys.chord(Keys.ENTER))
		WebUI.waitForElementClickable(findTestObject('Service-Console/Billing-Account'), 10)

		// Find all elements with the text "12345"
		
		List<WebElement> elementsWithText = DriverFactory.getWebDriver().findElements(By.xpath('//a[@title="12345"]'))

	
		if (elementsWithText.size() > 0) {
			// Click on the first element with the text "12345" (you can change this logic if you have multiple matching elements)
			(elementsWithText[0]).click()
		} else {
			WebUI.comment('Element with text \'12345\' not found.')
		}


	}

	@And("I choose Concession from Dropdwn-List- for negative scenario")
	def clickToDropdownList() {
		WebUI.click(findTestObject('Billing-Account-Num/Button-List/Button-List-Dropdwn'))
		WebUI.click(findTestObject('Billing-Account-Num/Button-List/Concession'))
		WebUI.switchToFrame(findTestObject('IFrames/Concession/Concession-Managment'), 10)

		// Implementation to click on an element to see all the items in the list
	}

	@And("I create a new concession for JXXX-HXXX-FXXX-CXXX")
	def clickOnNextButton() {
		WebUI.delay(10)
		WebUI.check(findTestObject('IFrames/Concession/JXXX-HXXX-FXXX-CXXX'))
		WebUI.click(findTestObject('IFrames/Concession/Concession-Type'))
		WebUI.click(findTestObject('IFrames/Concession/Account-Holder'))
		WebUI.click(findTestObject('IFrames/Concession/Next-Button'))
		WebUI.delay(10)
		// Implementation to click on the Next-Button 
	}

	@And ("I continue steps to create the new billing acount for JXXX-HXXX-FXXX-CXXX")
	def checkOnDavidWrenn() {
		WebUI.check(findTestObject('IFrames/Concession/Privacy-Statement-CheckBox'))
		WebUI.setText(findTestObject('IFrames/Concession/Concession-Card-Num'), '123456')
		WebUI.click(findTestObject('IFrames/Concession/Concession-Card-Type'))
		WebUI.click(findTestObject('IFrames/Concession/Health-Care-Card'))
		WebUI.click(findTestObject('IFrames/Concession/Next-Button'))
		WebUI.delay(10)
		// Implementation to add new concession for DXXX WXXX (AT=Account Holder) 
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


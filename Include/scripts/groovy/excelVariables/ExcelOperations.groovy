package excelVariables

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
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
import internal.GlobalVariable
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.setText
import org.openqa.selenium.Cookie
import java.util.Date
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.selenium.driver.CChromeDriver as CChromeDriver
import org.openqa.selenium.ElementNotInteractableException as ElementNotInteractableException
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
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

import com.kms.katalon.core.testdata.reader.ExcelFactory
import java.io.FileInputStream
import java.util.List
import java.util.Map
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

//////////////////////////////////////////SwitchUserCFO//////////////////////////////////////

public class SwitchUserCFO {

	@Keyword
	static void performExcelOperation() {
		def filePath = "C:\\Hamid\\katalon.xlsx"
		def sheetName = 'SF'
		def encryptedPassword = 'tzH6RvlfSTg='
		def testObject = 'Object Repository/Home-Setup/Search-add-values'

		List<Map<String, String>> excelData = ExcelReaderUtils.readEncryptedExcelData(filePath, sheetName, encryptedPassword)


		if (!excelData.isEmpty()) {
			def variableText = excelData[0]['switchUser']
			KeywordUtil.logInfo("Variable Text from A2: ${variableText}")
			TestObject searchAddValuesObject = findTestObject(testObject)
			WebUI.setText(searchAddValuesObject, variableText)
		} else {
			println('excelData is empty')
		}
	}
}

//////////////////////////////////////////BillingAccountCFO//////////////////////////////////////

public class BillingAccountCFO {

	@Keyword
	static void performExcelOperation() {
		def filePath = "C:\\Hamid\\katalon.xlsx"
		def sheetName = 'SF'
		def encryptedPassword = 'tzH6RvlfSTg='
		def testObject = 'Object Repository/Service-Console/Billing-Account'

		List<Map<String, String>> excelData = ExcelReaderUtils.readEncryptedExcelData(filePath, sheetName, encryptedPassword)


		if (!excelData.isEmpty()) {
			def variableText = excelData[0]['BillingAccount']
			KeywordUtil.logInfo("Variable Text from B2: ${variableText}")
			TestObject searchAddValuesObject = findTestObject(testObject)
			WebUI.setText(searchAddValuesObject, variableText)
		} else {
			println('excelData is empty')
		}
	}
}

//////////////////////////////////////////CreditCardNumber1//////////////////////////////////////

public class CreditCardNumber1 {

	@Keyword
	static void performExcelOperation() {
		def filePath = "C:\\Hamid\\katalon.xlsx"
		def sheetName = 'SF'
		def encryptedPassword = 'tzH6RvlfSTg='
		def testObject = 'Object Repository/IFrames/Pay Bill/CreditCardnum1'

		List<Map<String, String>> excelData = ExcelReaderUtils.readEncryptedExcelData(filePath, sheetName, encryptedPassword)


		if (!excelData.isEmpty()) {
			def variableText = excelData[0]['CreditCardNumber1']
			KeywordUtil.logInfo("Variable Text from E2: ${variableText}")
			TestObject searchAddValuesObject = findTestObject(testObject)
			WebUI.setText(searchAddValuesObject, variableText)
		} else {
			println('excelData is empty')
		}
	}
}

//////////////////////////////////////////CreditCardNumber2//////////////////////////////////////

public class CreditCardNumber2 {

	@Keyword
	static void performExcelOperation() {
		def filePath = "C:\\Hamid\\katalon.xlsx"
		def sheetName = 'SF'
		def encryptedPassword = 'tzH6RvlfSTg='
		def testObject = 'Object Repository/IFrames/Pay Bill/CreditCardnum2'

		List<Map<String, String>> excelData = ExcelReaderUtils.readEncryptedExcelData(filePath, sheetName, encryptedPassword)


		if (!excelData.isEmpty()) {
			def variableText = excelData[0]['CreditCardNumber2']
			KeywordUtil.logInfo("Variable Text from F2: ${variableText}")
			TestObject searchAddValuesObject = findTestObject(testObject)
			WebUI.setText(searchAddValuesObject, variableText)
		} else {
			println('excelData is empty')
		}
	}
}

//////////////////////////////////////////CreditCardNumber3//////////////////////////////////////

public class CreditCardNumber3 {

	@Keyword
	static void performExcelOperation() {
		def filePath = "C:\\Hamid\\katalon.xlsx"
		def sheetName = 'SF'
		def encryptedPassword = 'tzH6RvlfSTg='
		def testObject = 'Object Repository/IFrames/Pay Bill/CreditCardnum3'

		List<Map<String, String>> excelData = ExcelReaderUtils.readEncryptedExcelData(filePath, sheetName, encryptedPassword)


		if (!excelData.isEmpty()) {
			def variableText = excelData[0]['CreditCardNumber3']
			KeywordUtil.logInfo("Variable Text from G2: ${variableText}")
			TestObject searchAddValuesObject = findTestObject(testObject)
			WebUI.setText(searchAddValuesObject, variableText)
		} else {
			println('excelData is empty')
		}
	}
}

//////////////////////////////////////////CreditCardNumber4//////////////////////////////////////

public class CreditCardNumber4 {

	@Keyword
	static void performExcelOperation() {
		def filePath = "C:\\Hamid\\katalon.xlsx"
		def sheetName = 'SF'
		def encryptedPassword = 'tzH6RvlfSTg='
		def testObject = 'Object Repository/IFrames/Pay Bill/CreditCardnum4'

		List<Map<String, String>> excelData = ExcelReaderUtils.readEncryptedExcelData(filePath, sheetName, encryptedPassword)


		if (!excelData.isEmpty()) {
			def variableText = excelData[0]['CreditCardNumber4']
			KeywordUtil.logInfo("Variable Text from H2: ${variableText}")
			TestObject searchAddValuesObject = findTestObject(testObject)
			WebUI.setText(searchAddValuesObject, variableText)
		} else {
			println('excelData is empty')
		}
	}
}

//////////////////////////////////////////CVV//////////////////////////////////////

public class CVV {

	@Keyword
	static void performExcelOperation() {
		def filePath = "C:\\Hamid\\katalon.xlsx"
		def sheetName = 'SF'
		def encryptedPassword = 'tzH6RvlfSTg='
		def testObject = 'Object Repository/IFrames/Pay Bill/CVN'

		List<Map<String, String>> excelData = ExcelReaderUtils.readEncryptedExcelData(filePath, sheetName, encryptedPassword)


		if (!excelData.isEmpty()) {
			def variableText = excelData[0]['CVV']
			KeywordUtil.logInfo("Variable Text from K2: ${variableText}")
			TestObject searchAddValuesObject = findTestObject(testObject)
			WebUI.setText(searchAddValuesObject, variableText)
		} else {
			println('excelData is empty')
		}
	}
}

//////////////////////////////////////////SwitchUserCSO//////////////////////////////////////

public class SwitchUserCSO {

	@Keyword
	static void performExcelOperation() {
		def filePath = "C:\\Hamid\\katalon.xlsx"
		def sheetName = 'SF'
		def encryptedPassword = 'tzH6RvlfSTg='
		def testObject = 'Object Repository/Home-Setup/Search-add-values'

		List<Map<String, String>> excelData = ExcelReaderUtils.readEncryptedExcelData(filePath, sheetName, encryptedPassword)


		if (!excelData.isEmpty()) {
			def variableText = excelData[1]['switchUser']
			KeywordUtil.logInfo("Variable Text from A3: ${variableText}")
			TestObject searchAddValuesObject = findTestObject(testObject)
			WebUI.setText(searchAddValuesObject, variableText)
		} else {
			println('excelData is empty')
		}
	}
}

//////////////////////////////////////////BillingAccountCSO//////////////////////////////////////

public class BillingAccountCSO {

	@Keyword
	static void performExcelOperation() {
		def filePath = "C:\\Hamid\\katalon.xlsx"
		def sheetName = 'SF'
		def encryptedPassword = 'tzH6RvlfSTg='
		def testObject = 'Object Repository/Service-Console/Billing-Account'

		List<Map<String, String>> excelData = ExcelReaderUtils.readEncryptedExcelData(filePath, sheetName, encryptedPassword)


		if (!excelData.isEmpty()) {
			def variableText = excelData[1]['BillingAccount']
			KeywordUtil.logInfo("Variable Text from B3: ${variableText}")
			TestObject searchAddValuesObject = findTestObject(testObject)
			WebUI.setText(searchAddValuesObject, variableText)
		} else {
			println('excelData is empty')
		}
	}
}

//////////////////////////////////////////ConcessionCardNumber//////////////////////////////////////

public class ConcessionCardNumber {

	@Keyword
	static void performExcelOperation() {
		def filePath = "C:\\Hamid\\katalon.xlsx"
		def sheetName = 'SF'
		def encryptedPassword = 'tzH6RvlfSTg='
		def testObject = 'Object Repository/IFrames/Concession/Concession-Card-Num'

		List<Map<String, String>> excelData = ExcelReaderUtils.readEncryptedExcelData(filePath, sheetName, encryptedPassword)


		if (!excelData.isEmpty()) {
			def variableText = excelData[1]['ConcessionCardNumber']
			KeywordUtil.logInfo("Variable Text from K3: ${variableText}")
			TestObject searchAddValuesObject = findTestObject(testObject)
			WebUI.setText(searchAddValuesObject, variableText)
		} else {
			println('excelData is empty')
		}
	}
}

//////////////////////////////////////////BillingAccountCSONegative//////////////////////////////////////

public class BillingAccountCSONegative {

	@Keyword
	static void performExcelOperation() {
		def filePath = "C:\\Hamid\\katalon.xlsx"
		def sheetName = 'SF'
		def encryptedPassword = 'tzH6RvlfSTg='
		def testObject = 'Service-Console/Search-box'

		List<Map<String, String>> excelData = ExcelReaderUtils.readEncryptedExcelData(filePath, sheetName, encryptedPassword)


		if (!excelData.isEmpty()) {
			def variableText = excelData[2]['BillingAccount']
			KeywordUtil.logInfo("Variable Text from B4: ${variableText}")
			TestObject searchAddValuesObject = findTestObject(testObject)
			WebUI.setText(searchAddValuesObject, variableText)
		} else {
			println('excelData is empty')
		}
	}
}

//////////////////////////////////////////ConcessionCardNumberNegative//////////////////////////////////////

public class ConcessionCardNumberNegative {

	@Keyword
	static void performExcelOperation() {
		def filePath = "C:\\Hamid\\katalon.xlsx"
		def sheetName = 'SF'
		def encryptedPassword = 'tzH6RvlfSTg='
		def testObject = 'Object Repository/IFrames/Concession/Concession-Card-Num'

		List<Map<String, String>> excelData = ExcelReaderUtils.readEncryptedExcelData(filePath, sheetName, encryptedPassword)


		if (!excelData.isEmpty()) {
			def variableText = excelData[2]['ConcessionCardNumber']
			KeywordUtil.logInfo("Variable Text from K4: ${variableText}")
			TestObject searchAddValuesObject = findTestObject(testObject)
			WebUI.setText(searchAddValuesObject, variableText)
		} else {
			println('excelData is empty')
		}
	}
}
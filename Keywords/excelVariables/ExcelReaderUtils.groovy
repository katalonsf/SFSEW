package excelVariables

import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory

import java.io.FileInputStream
import java.util.List
import java.util.Map
import com.kms.katalon.util.CryptoUtil

public class ExcelReaderUtils {

	static List<Map<String, String>> readEncryptedExcelData(String filePath, String sheetName, String encryptedPassword) {
		List<Map<String, String>> excelData = []

		try {
			FileInputStream fis = new FileInputStream(filePath)
			Workbook workbook = WorkbookFactory.create(fis, decryptPassword(encryptedPassword))

			def sheet = workbook.getSheet(sheetName)
			def headers = sheet.getRow(0).collect { it.toString() }

			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				def row = sheet.getRow(i)
				def rowData = [:]

				for (int j = 0; j < headers.size(); j++) {
					def cellValue = row.getCell(j, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL)
					rowData[headers[j]] = cellValue == null ? '' : cellValue.toString()
				}

				excelData.add(rowData)
			}

			fis.close()
		} catch (Exception e) {
			System.err.println("Error reading encrypted Excel data: ${e.getMessage()}")
		}

		return excelData
	}

	private static String decryptPassword(String encryptedPassword) {
		// Use CryptoUtil to decode the encrypted password
		return CryptoUtil.decode(CryptoUtil.getDefault(encryptedPassword))
	}
}

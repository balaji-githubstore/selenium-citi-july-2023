package com.citi.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	/**
	 * Convert given sheet into two dimensional array
	 * @param filePath
	 * @param sheetname
	 * @return
	 * @throws IOException
	 */
	public static String[][] getSheetToTwoDimensionalArray(String filePath, String sheetname) throws IOException {
		FileInputStream file = new FileInputStream(filePath); // new FileNotException()
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet(sheetname);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] data = new String[rowCount - 1][cellCount];
		DataFormatter format = new DataFormatter();
		for (int r = 1; r < rowCount; r++) {
			for (int c = 0; c < cellCount; c++) {
				data[r - 1][c] = format.formatCellValue(sheet.getRow(r).getCell(c));
			}
		}

		book.close();
		file.close();

		return data;
	}

}

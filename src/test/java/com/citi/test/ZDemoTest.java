package com.citi.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*
 * This is demo file to converst sheet into two dimensional array
 */
public class ZDemoTest {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file=new FileInputStream("test_data/openemr_data.xlsx"); //new FileNotException()

		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet= book.getSheet("validLoginTest");
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rowCount-1][cellCount];
		
		DataFormatter format=new DataFormatter();
		
		for(int r=1;r<rowCount;r++)
		{
			for(int c=0;c<cellCount;c++)
			{
//				String value=sheet.getRow(r).getCell(c).getStringCellValue();
//				System.out.println(value);
				data[r-1][c]=format.formatCellValue(sheet.getRow(r).getCell(c));
			}
		}
		
		book.close();
		file.close();
	}

}

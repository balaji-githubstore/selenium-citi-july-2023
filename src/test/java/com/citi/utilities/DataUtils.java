package com.citi.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	@DataProvider
	public String[][] validLoginData()
	{
		String[][] data=new String[2][3];
		//i --> number of test case
		//j--> number of parameters
		data[0][0]="admin";
		data[0][1]="pass";
		data[0][2]="OpenEMR";
		
		data[1][0]="accountant";
		data[1][1]="accountant";
		data[1][2]="OpenEMR";
		
		return data;
	}
	
	@DataProvider
	public String[][] commonDataProvider(Method method) throws IOException
	{
		//currentTestMethodName is the sheetname
		String currentTestMethodName=method.getName();
		String[][] data=ExcelUtils.getSheetToTwoDimensionalArray("test_data/openemr_data.xlsx", currentTestMethodName);
		return data;
	}
}







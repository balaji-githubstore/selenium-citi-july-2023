package com.citi.base;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;

public class AutomationWrapper {
	
	public WebDriver driver;
	
	
	//runs after each scenario
	@After
	public void closeBrowser()
	{
		driver.quit();
	}

}

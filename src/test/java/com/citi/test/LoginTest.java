package com.citi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.citi.base.AutomationWrapper;
import com.citi.utilities.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class)
	public void validLoginTest(String username,String password,String expectedTitle)
	{
		driver.findElement(By.id("authUser")).sendKeys(username);
		driver.findElement(By.cssSelector("#clearPass")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
	
	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class)
	public void invalidLoginTest(String username,String password,String expectedError)
	{
		driver.findElement(By.id("authUser")).sendKeys(username);
		driver.findElement(By.cssSelector("#clearPass")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
		String actualError=driver.findElement(By.xpath("//p[contains(text(),'Invalid')]")).getText();
		Assert.assertTrue(actualError.contains("Invalid username or password"));
		
	}
}

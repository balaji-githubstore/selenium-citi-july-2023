package com.citi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.citi.base.AutomationWrapper;

public class LoginUserInterfaceTest extends AutomationWrapper {

	@Test
	public void titleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OpenEMR Login");
	}

	@Test
	public void appDescriptionTest() {
		String actualDesc = driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
		Assert.assertEquals(actualDesc,
				"The most popular open-source Electronic Health Record and Medical Practice Management solution.");
	}

}

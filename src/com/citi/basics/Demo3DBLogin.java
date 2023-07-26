package com.citi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3DBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://collabedit.com/5bcus
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.db4free.net/phpMyAdmin/");
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
		driver.findElement(By.id("input_password")).sendKeys("admin123");
		driver.findElement(By.id("input_go")).click();
		
		String actualError=driver.findElement(By.id("pma_errors")).getText();
		System.out.println(actualError);
		
		driver.quit();
	}

}

package com.citi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.id("email")).sendKeys("demo123456@gmail.com");	
		
//		By loc= By.id("email");	
//		WebElement ele= driver.findElement(loc);
//		ele.sendKeys("demo123456@gmail.com");
		
//		WebElement ele= driver.findElement(By.id("email"));
//		ele.sendKeys("demo123456@gmail.com");
		
		driver.findElement(By.id("email")).sendKeys("demo123456@gmail.com");
		
		//enter password as test123
		driver.findElement(By.id("pass")).sendKeys("welcome@123");
		//Click on login
		driver.findElement(By.name("login")).click();
	}
}

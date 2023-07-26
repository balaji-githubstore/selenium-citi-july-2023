package com.citi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2Actions {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://nasscom.in/about-us");
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).perform();
		
		driver.findElement(By.xpath("//a[text()='Members Listing']")).click();
		
	}

}

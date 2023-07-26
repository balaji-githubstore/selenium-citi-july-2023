package com.citi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Mutliple tabs or windows
public class Demo2TabsAssignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("//a[@class='newclose']")).click();
		driver.findElement(By.xpath("//a[@class='newclose2']")).click();
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		//switch to second tab
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.xpath("//div[contains(text(),'Forgot User ID')]")).click();
		
		driver.quit();
		
//		5.  Choose Credit Card
//		6.  Enter credit card number as 4545 5656 8887 9998 
//		7.  Enter cvv number 
//		8.  Enter date as “14/04/2000”
//		9.  Click on Proceed 
//		10. Get the text and print it “Please accept Terms and Conditions”

	}
}

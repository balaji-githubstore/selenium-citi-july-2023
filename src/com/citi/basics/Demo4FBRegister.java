package com.citi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4FBRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.facebook.com/");  //wait for page load to complete
		
		//click on create new account
		driver.findElement(By.linkText("Create new account")).click(); //findElement takes only 0.5s to check presence of element
		
		//enter firstname as john
		driver.findElement(By.name("firstname")).sendKeys("john");
		
		//enter lastname as wick
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		//dob - Nov 21, 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMon=new Select(driver.findElement(By.id("month")));
		selectMon.selectByVisibleText("Nov");
//		selectMon.selectByValue("11");
//		selectMon.selectByIndex(10);
		
		Select selectYear=new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		selectYear.selectByVisibleText("2000");

		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		
	}

}

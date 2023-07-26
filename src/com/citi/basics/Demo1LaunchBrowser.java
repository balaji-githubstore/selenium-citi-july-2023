package com.citi.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
	
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		// get url and print
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);

		//getPageSource() and print it
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}

}

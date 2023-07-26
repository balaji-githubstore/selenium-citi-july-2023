package com.citi.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.citi.base.AutomationWrapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private AutomationWrapper wrapper;

	public LoginSteps(AutomationWrapper wrapper) {
		this.wrapper = wrapper;
	}

	@Given("I have browser with OpenEMR application")
	public void i_have_browser_with_open_emr_application() {
		wrapper.driver = new ChromeDriver();
		wrapper.driver.manage().window().maximize();
		this.wrapper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		this.wrapper.driver.get("https://demo.openemr.io/b/openemr");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		this.wrapper.driver.findElement(By.id("authUser")).sendKeys(username);

	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		this.wrapper.driver.findElement(By.cssSelector("#clearPass")).sendKeys(password);

	}

	@When("I click on login")
	public void i_click_on_login() {
		this.wrapper.driver.findElement(By.id("login-button")).click();
	}

	@Then("I should get access to portal with title as {string}")
	public void i_should_get_access_to_portal_with_title_as(String expectedTitle) {
		Assert.assertEquals(this.wrapper.driver.getTitle(), expectedTitle);
	}

	@Then("I should not get access to portal with error as {string}")
	public void i_should_not_get_access_to_portal_with_error_as(String expectedError) {
		String actualError = this.wrapper.driver.findElement(By.xpath("//p[contains(text(),'Invalid')]")).getText();
		Assert.assertTrue(actualError.contains("Invalid username or password"));
	}
}

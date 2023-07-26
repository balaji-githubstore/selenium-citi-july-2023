package com.citi.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.citi.base.AutomationWrapper;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientSteps {

	private AutomationWrapper wrapper;

	public PatientSteps(AutomationWrapper wrapper) {
		this.wrapper = wrapper;
	}
	
	@When("I click on patient menu")
	public void i_click_on_patient_menu() {
		this.wrapper.driver.findElement(By.xpath("//div[text()='Patient']")).click();
	}

	@When("I click on new-search menu")
	public void i_click_on_new_search_menu() {
		this.wrapper.driver.findElement(By.xpath("//div[text()='New/Search']")).click();
	}

	@When("I fill the patient records form")
	public void i_fill_the_patient_records_form(DataTable dataTable) {

		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		
		System.out.println(dataTable);
		
		List<Map<String, String>> list=dataTable.asMaps();
		
		System.out.println(list.get(0).get("firstname"));
		System.out.println(list.get(0).get("lastname"));
		System.out.println(list.get(0).get("dob"));
		System.out.println(list.get(0).get("gender"));

	}

	@When("I click on create new patient")
	public void i_click_on_create_new_patient() {

	}

	@When("I click on confirm create new patient")
	public void i_click_on_confirm_create_new_patient() {

	}

	@When("I store the alert text and handle it")
	public void i_store_the_alert_text_and_handle_it() {

	}

	@When("I click on close happy birthday popup if available")
	public void i_click_on_close_happy_birthday_popup_if_available() {

	}

	@Then("I should get the added patient name as {string}")
	public void i_should_get_the_added_patient_name_as(String string) {

	}

}

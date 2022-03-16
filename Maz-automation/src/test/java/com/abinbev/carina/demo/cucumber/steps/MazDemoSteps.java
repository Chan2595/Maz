package com.abinbev.carina.demo.cucumber.steps;

import com.abinbev.carina.demo.gui.pages.MazDemo;
import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MazDemoSteps extends CucumberRunner {
	MazDemo demo = new MazDemo(getDriver());

	@Given("^I log into MAZ application using valid user credentials$")
	public void login() {
		demo.login();
	}
	@Then("^Verify application opened with appropriate title$")
	public void openApplication() {
		
	}
	
	@Then("^click on collections tab$")
	public void navigateToCollections() {
		
	}
	
	@Then("^Click on worklist subtab$")
	public void navigateToWorkList() {
		
	}
	
	@Then("^From the list click on any one customer$")
	public void clickCustomers() {
		
	}
	
	@Then("^Verify customer details screen is displayed$")
	public void verifyCustDetails() {
		
	}
	
}

	
	/*
	 * @Then("^Fill all mandatory fields and click on save {String},{String},{String},{String}$"
	 * ) public void fillMandatoryField(String firstName,String emailId,String
	 * lastName,String mobileNumber) {
	 * 
	 * }
	 */
	


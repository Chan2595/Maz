package com.abinbev.carina.demo.cucumber.steps;

import com.abinbev.carina.demo.gui.pages.CreditPage;
import com.abinbev.carina.demo.gui.pages.LoginPage;
import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MazDemoSteps extends CucumberRunner {
	LoginPage demo = new LoginPage(getDriver());
	CreditPage credit =  new CreditPage(getDriver());
	
	@Given("^I log into MAZ application using valid user credentials$")
	public void login() {
		demo.login();
	}
	@Then("^click on CustomerData Tab under CREDIT Module$")
	public void clickCustomerData() throws InterruptedException {
		credit.clickCustomerData();
	}
	
	@Then("^click on Advance Search BUTTON and provide Existing customer value in Customer Number field and click on Search BUTTON \"([^\"]*)\"$")
	public void navigateToCollections(String CustomerNumber) throws InterruptedException {
		credit.searchCustomer(CustomerNumber);
	}
	
	 @And("^Double Click on the Search Customer and verify application displays customer detail screen \"([^\\\"]*)\"$")
	 public void enterCustomerDetail(String CustomerNumber) throws InterruptedException {
			credit.enterCustomerDetailsScreen(CustomerNumber);
		}
		
	 @Then("^Click on Characteristics TAB$")
	 public void clickCharacteristics() throws InterruptedException {
			credit.clickonCharacteristicsTAB();
		}
	 @And("^click on ADHOCCredit LIMIT WF SUB TAB and Mandatory fields to be filled are present$")
	 public void clickadhocCreditLimit() throws InterruptedException {
			credit.clickonadHocCreditTAB();
		}
}

	

	


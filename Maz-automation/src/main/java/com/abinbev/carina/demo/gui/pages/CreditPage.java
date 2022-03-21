package com.abinbev.carina.demo.gui.pages;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

import groovyjarjarantlr4.v4.codegen.model.Action;

public class CreditPage extends AbstractPage{

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	public CreditPage(WebDriver driver) {
		super(driver);
}
	Actions performAction = new Actions(getDriver());
	
	//Webelements
	@FindBy(xpath = "//span[contains(text(),'Customers Data')]")
	private ExtendedWebElement customerDataTab;
	
	@FindBy(xpath = "//span[contains(text(),'Worklist')]")
	private ExtendedWebElement worklistTab;
	
	@FindBy(xpath = "//span[contains(text(),'Advanced Search')]")
	private ExtendedWebElement AdvancedSearchTAB;
	
	@FindBy(xpath = "//input[@name='accountCustomerNumber']")
	private ExtendedWebElement customerNumberField;
	
	@FindBy(xpath = "//span[@id='button-1415-btnInnerEl']")
	private ExtendedWebElement searchBUtton;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/div/div/div[4]/div[3]/div[1]/div[2]/table/tbody/tr/td[3]/div")
	private ExtendedWebElement customerNumberColumn;
	
	@FindBy(xpath = "//span[contains(text(),'Characteristics')]")
	private ExtendedWebElement characteristicsTAB;
	
	@FindBy(xpath = "//span[contains(text(),'Ad-Hoc Credit Limit WF')]")
	private ExtendedWebElement adHocCreditLimitWFTAB;
	
	
	@FindBy(xpath = "//div[contains(text(),'Credit Limit to be Applied')]")
	private ExtendedWebElement crediLimittobeAppliedColumn;
	
	@FindBy(xpath = "(//a//span[contains(text(),'Save')])[9]")
	private ExtendedWebElement saveBtn;

	@FindBy(xpath = "(//a//span[contains(text(),'Save')])[10]")
	private ExtendedWebElement addNotessaveBtn;
	
	@FindBy(xpath = "(//div//table)[3]//tbody//tr[1]//td[11]//div")
	private ExtendedWebElement finalReviewStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Credit Review')]")
	private ExtendedWebElement creditReviewButton;
	
	
	/**
	 * @author Aravindan
	 * Method to click on Customer Data Tab
	 * @throws InterruptedException 
	 */
	
	public void clickCustomerData() throws InterruptedException {
		
		Thread.sleep(3000);
		customerDataTab.isElementPresent();
		
		customerDataTab.click();
		Thread.sleep(6000);
		LOGGER.info("CustomerTab is clicked:");
			
	}
	/**
	 * @author Aravindan
	 * Method to perform search operation
	 * @throws InterruptedException 
	 * @parameter - Customer Number 
	 */
	
	public void searchCustomer(String CustomerNumber) throws InterruptedException {
		AdvancedSearchTAB.isPresent();
		AdvancedSearchTAB.click();
		LOGGER.info("Entering Customer Number: "+CustomerNumber);
		customerNumberField.type(CustomerNumber);
		searchBUtton.click();
		Thread.sleep(3000);
			
	}
	/**
	 * @author Aravindan
	 * Method to enter into customer detail screen
	 * @throws InterruptedException 
	 * @parameter - Customer Number 
	 */
	
	public void enterCustomerDetailsScreen(String CustomerNumber) throws InterruptedException {
		LOGGER.info("double click on the customer");
		WebElement customerNumber = driver.findElement(rootBy.xpath("//div[contains(text(),'"+CustomerNumber+"')]"));
		performAction.doubleClick(customerNumber).perform();
		Thread.sleep(2000);
		
	}
	/**
	 * @author Aravindan
	 * Method to click on characteristic button
	 * @throws InterruptedException 
	 */
	
	public void clickonCharacteristicsTAB() throws InterruptedException {
		LOGGER.info("click on characteristics TAB");
		characteristicsTAB.click();
		Thread.sleep(2000);
		
	}
	/**
	 * @author Aravindan
	 * Method to click on adhoc credit button
	 * @throws InterruptedException 
	 */
	
	public void clickonadHocCreditTAB() throws InterruptedException {
		LOGGER.info("click on Ad HOC credit Limit TAB");
		adHocCreditLimitWFTAB.click();
		Thread.sleep(2000);
		
	}
}



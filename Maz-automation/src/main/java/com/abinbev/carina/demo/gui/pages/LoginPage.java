package com.abinbev.carina.demo.gui.pages;


import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.agent.core.logging.Log;

public class LoginPage extends AbstractPage{

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
		
	}
	
	
	@FindBy(xpath = "//div//input[@name='username']")
	private ExtendedWebElement usernameTb;

	@FindBy(xpath = "//div//input[@name='password']")
	private ExtendedWebElement pwdTb;
	
	@FindBy(xpath = "//span[@role='presentation']/following::span/span[text()='SUBMIT']")
	private ExtendedWebElement signInBtn;
	
	
	/**
	 * @author Aravindan
	 * Method to Login to HR Application
	 * Parameters -@UserName, @Password
	 */
	
	public void login() {
		openURL(R.CONFIG.get("url"));
		
		LOGGER.info("Logging into HighRadius Application");
		//getting the Credential values from Config File
		
		String uname=R.CONFIG.get("username");
		String pwd=R.CONFIG.get("password");
		
		LOGGER.info("User Name Entered: "+uname);
		LOGGER.info("Password Entered: "+pwd);
		
		usernameTb.type(uname);
		pwdTb.type(pwd);
		signInBtn.click();
		LOGGER.info("Logged into HR application successfully");
		
		
		
		
	}
}

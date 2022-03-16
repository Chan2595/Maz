package com.abinbev.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class MazDemo extends AbstractPage{

	public MazDemo(WebDriver driver) {
		super(driver);
		
		
	}
	@FindBy(xpath = "//div//input[@name='username']")
	private ExtendedWebElement usernameTb;

	@FindBy(xpath = "//div//input[@name='password']")
	private ExtendedWebElement pwdTb;
	
	@FindBy(xpath = "//span[@role='presentation']/following::span/span[text()='SUBMIT']")
	private ExtendedWebElement signInBtn;
	
	public void login() {
		openURL(R.CONFIG.get("url"));
		String uname=R.CONFIG.get("username");
		String pwd=R.CONFIG.get("password");
		System.out.println(uname);
		usernameTb.type(uname);
		pwdTb.type(pwd);
		signInBtn.click();
		System.out.println("Logged in successfully");
		
		
	}
}

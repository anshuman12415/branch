package com.inetBankingV2.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver idriver;

	public LoginPage(WebDriver rdriver) {
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement txtUseName;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="/html/body/div/div/form/div[4]/button")
	@CacheLookup
	WebElement btnLogin ;
	
	public void setusername(String uname) {
		txtUseName.sendKeys(uname);
	}
	
	public void setpaswrd(String passwrd) {
		txtpassword.sendKeys(passwrd);
	}
	
	public void clicksubmit() {
		btnLogin.click();
	}

	
	
}

package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Pagefactory
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']\")")
	WebElement logInButton;
	
	@FindBy(xpath="//input[@placeholder='E-mail address']")
	WebElement loginUserName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement  loginPassword;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[@class='btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")
	WebElement signUpbtn;
	
	@FindBy(xpath="//font[contains(text(),'crm')]")
	WebElement crmlogo;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		}
	
	public String valaidatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean  validateCRMImage() {
		return crmlogo.isDisplayed();
		
	}
	
	public HomePage Login(String usernme, String password) {
		logInButton.click();
		loginUserName.sendKeys(usernme);
		loginPassword.sendKeys(password);
		loginBtn.click();
		return new HomePage();
	}
	
	
	
	
}

package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
@FindBy(xpath="//span[contains(text(),'srinivas naini')]")
WebElement loginUserName;

@FindBy(xpath="//span[contains(text(),'Contacts')]")
WebElement contactsLink;

@FindBy(xpath="//span[contains(text(),'Deals')]")
WebElement dealsLink;

public HomePage() {
	PageFactory.initElements(driver, this);
	}
public void validateLoginUserName(String registredUserName) {
	String loginUserFullName=loginUserName.getText();
	if(loginUserFullName.equals(registredUserName)) {
		System.out.println("Login user name is displayed correctly");
	}
	
	}


public String validateHomePageTitle() {
	return driver.getTitle();
	
}

public ContactsPage clickContactsPage() {
	contactsLink.click();
	return new ContactsPage();
	
	
}

public  DealsPage clickDealsPage() {
	dealsLink.click();
	return new DealsPage();
}



	

}

package com.crm.qa.pages;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.crm.qa.base.TestBase;

	public class ContactsPage extends TestBase {
		
		@FindBy(xpath="//i[@class='edit icon']")
		WebElement AddNewContactBtn;
		
	    @FindBy(xpath="//input[@name='first_name']")
	    WebElement AddContactFirstName;
	    
	    @FindBy(xpath="//input[@name='last_name']")
	    WebElement AddContactLastName;
	    
	   @FindBy(xpath="//i[@class='save icon']")
	   WebElement saveContactDetailsBtn;
	   
	   @FindBy(xpath="//span[contains(text(),'Contacts')]")
	   WebElement contactsPageLink;
	    
	    public ContactsPage() {
	    	PageFactory.initElements(driver, this);
	     }
	    
	    public void addNewcContact(String firstName,String lastName) {
	    	AddNewContactBtn.click();
	    	AddContactFirstName.sendKeys(firstName);
	    	AddContactLastName.sendKeys(lastName);
	    	saveContactDetailsBtn.click();
	    }
	    
	    public void verifyAddedContact(String firstName,String lastName) {
	    	contactsPageLink.click();
	   
	  }

	}




package com.crm.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	ContactsPageTest(){
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		contactsPage=homePage.clickContactsPage();
	}
	
	@Test
	public void verifyAddContactsTest() {
		contactsPage.addNewcContact("srinivas", "naini");
		}
	
	
	@AfterTest
	public void teardown() {
		//driver.quit();
		
	}
	
	
	

}

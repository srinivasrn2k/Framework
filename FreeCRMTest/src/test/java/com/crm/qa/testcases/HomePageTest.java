package com.crm.qa.testcases;

import org.testng.annotations.*;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	DealsPage dealsPage;
	
	public HomePageTest(){
	super();
	
	}
	
	@BeforeMethod
	public void	setup() {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void verifyHomePageTitleTest() {
		String homePageTitle=homePage.validateHomePageTitle();
		if(homePageTitle.equals("Cogmento CRM")) {
		System.out.println("page title is correct");
		}
		
	}
		
	@Test
	private void verifyLoginUsernameTest() {
		homePage.validateLoginUserName(prop.getProperty("srinivas naini"));
		
		
		
		
	}
	

}

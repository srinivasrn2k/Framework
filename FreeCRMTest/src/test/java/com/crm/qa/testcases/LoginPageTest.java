package com.crm.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	
  LoginPage loginPage;
  HomePage homePage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		loginPage=new LoginPage();
		}
	
	@SuppressWarnings("deprecation")
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title=loginPage.valaidatePageTitle();
		if(title.equals("Free CRM #1 cloud software for any business large or small")) {
			System.out.println("page title is corect");
		}
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}
	@Test(priority=2)
	public void crmLogoImageTest() {
		boolean flag=loginPage.validateCRMImage();
		//Assert.assertTrue(flag);
		}
	@Test(priority=3)
	public void loginTest() {
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		   }
	@AfterTest
    public void teardown() {
	driver.quit();
}

}

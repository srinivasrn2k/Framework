package com.crm.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.crm.qa.util.TestUtil;

public class TestBase {
	
    protected static WebDriver driver;
	protected static Properties prop;
	public ExtentReports report;
    public ExtentTest logger;
    
    
	@BeforeSuite
	public void setupSuite() {
		
	ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"\\TestExecutionReport\\MyExtentReports.html"));
	report=new ExtentReports();
	report.attachReporter(extent);
	}
	
	
	public TestBase(){
	try {
			
			File ORdataFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			System.out.println(ORdataFile);
			FileInputStream fis=new FileInputStream(ORdataFile);
			prop=new Properties();
			prop.load(fis);
			System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");

		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			}
		}
	
        
	     public static void initialization() {
	    	 String browserName=prop.getProperty("browser");
	    	 if(browserName.equals("chrome"))
	    	 {
	    		 System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
	    	         driver= new ChromeDriver();
	    	  }else if(browserName.equals("firefox")) {
	    		  System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
	    	         driver= new FirefoxDriver();  
	    	  }
	    	 driver.manage().window().maximize();
	    	 driver.manage().deleteAllCookies();
	    	 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	    	
	     }
	     
	   
	     
	     
	 }

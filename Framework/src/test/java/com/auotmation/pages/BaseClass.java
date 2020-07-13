package com.auotmation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.automation.utilities.BrowserFactory;
import com.automation.utilities.ConfigDataProvider;
import com.automation.utilities.Helper;

public class BaseClass {
	
	public static WebDriver driver;
	

	
	@BeforeClass
	public void beforeClass() throws IOException
	{
		ConfigDataProvider config=new ConfigDataProvider();
		driver=BrowserFactory.launchWebDriver(driver, config.getBrowser(), config.getStaginUrl());
		System.out.println("driver is :" +driver);
	}
	
	@AfterClass
	public void afterClass()
	{
		BrowserFactory.closeDriver(driver);
	}
	
	@AfterMethod
	public void getScreenshot(ITestResult tr) throws IOException
	{
		
		
		if(tr.getStatus()==ITestResult.FAILURE)
		{
			Helper.Screenshot(driver);
		}
	}
	

}

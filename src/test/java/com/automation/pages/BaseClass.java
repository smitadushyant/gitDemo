package com.automation.pages;

import org.testng.annotations.Test;

import com.automation.utility.BrowserFactory;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BaseClass {
  /*@Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
  */
	public WebDriver driver;
	 
	   @BeforeClass
	   public void beforeClass()
	   {  
	   driver = BrowserFactory.startApplication(driver, "Chrome", "https://opensource-demo.orangehrmlive.com/");
	   Reporter.log("Welcome to Home page");  
	   }

	   @AfterClass
	   public void afterClass() 
	   {
	   BrowserFactory.quitBrowser(driver);
	   }


}

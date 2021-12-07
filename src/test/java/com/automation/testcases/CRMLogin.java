package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.pages.BaseClass;
import com.automation.pages.LoginPageObject;

import com.automation.pages.BaseClass;

public class CRMLogin extends BaseClass {
	@Test
	 public void f()
	 {
	   Reporter.log("Welcome to CRM Login Test Case");
	 }
	  
	   @Test
	 public void loginapp() throws InterruptedException
	 {
	  //To get the page title
	   Reporter.log("Page url : " +driver.getTitle());
	   
	   Thread.sleep(5000);
	   //Abstraction is showing the essential features and hiding the background details
	   
	   //To create instance of the Login Page Objects class   
	   LoginPageObject loginPO = PageFactory.initElements(driver, LoginPageObject.class);   
	   loginPO.loginvalidation("Admin", "admin123");
	   
	   Thread.sleep(5000);
	   
	  } 

}

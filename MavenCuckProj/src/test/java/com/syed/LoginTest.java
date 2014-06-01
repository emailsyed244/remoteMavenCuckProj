package com.syed;
import org.junit.Assert;

import com.util.ConstantClass;
import com.util.ConstantClass.LoginValues;
import com.util.WebConnector;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest {
	WebConnector selenium;
	ConstantClass pages=new ConstantClass();
	@Before 
	public void setup(){
		 selenium=new WebConnector();
		 
		System.out.println("Before Login");
	}
	@After
	public void tearDown(){
		System.out.println("After Login");
	}
	@Given("^I goto ([^\"]*) on ([^\"]*)$")
	public void I_goto_loginPage_on_browser(String url, String browser) throws Throwable {
	    System.out.println("I goto loginPage on browser");
	    //selenium.openBrowser(pages.getLoginValues(browser));
	    selenium.openBrowser(browser);
	    
	    selenium.navigate(pages.getLoginValues(url));
	    while(!selenium.isElementPresent(pages.getLoginValues("USERXPATH"))){
	     Thread.sleep(3000);
	    }
	    
	}

	@When("^I enter ([^\"]*) as ([^\"]*)$")
	public void I_enter_userLogin(String obj,String value) throws Throwable {
		 System.out.println("I enter "+obj+" as "+value);	
		// selenium.type(pages.getLoginValues(obj), pages.getLoginValues(value));
		 selenium.type(pages.getLoginValues(obj), value);
	}

	@And("^I click ([^\"]*)$")
	public void I_click_loginButton(String obj) throws Throwable {
		System.out.println("I click "+obj);	
		selenium.click(pages.getLoginValues(obj));
	}

	@Then("^([^\"]*) should be present$")
	public void HomeLink_should_be_present(String obj) throws Throwable {
     try{	
		System.out.println("Login should be "+obj);
    	if(selenium.isElementPresent(pages.getLandPageValues(obj))){
    		System.out.println("Test Login is successfull...!!");
    	}else{
    		Assert.assertTrue("User is not logged in",false);
    	}    	
    	selenium.quitDriver();
     }catch(Exception e){
    	 System.out.println("HOmeLink is failing....!");
     }finally{
    	 selenium.quitDriver();
     }	
     
	}
	
	
}


package com.syed;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MenuTest {
	
	@Given("^I am logged in$")
	public void I_am_logged_in() throws Throwable {
		 System.out.println("I am Logged in.......!");	}

	@Then("^Main \"([^\"]*)\" should be \"([^\"]*)\"$")
	public void MenuLinks_should_be_present(String obj,String result) throws Throwable {
		 System.out.println(obj+"should be "+result);	
	     System.out.println("Adding 1st line for git");
	     System.out.println("Adding 2nd line from keple----addition for branch 2");
	     System.out.println("Adding line from Juno...for conflict...!");
	}

}

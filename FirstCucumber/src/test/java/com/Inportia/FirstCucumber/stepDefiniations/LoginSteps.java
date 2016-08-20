package com.Inportia.FirstCucumber.stepDefiniations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class LoginSteps 
{
	@Given("^go to login page$")
	public void go_to_login_page() throws Throwable {
		
		System.out.println("Home page");
	   
	   
	}

	@Given("^eneter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void eneter_and(String arg1, String arg2) throws Throwable {
		System.out.println("useer name "+arg1+"password"+arg2);
	   
	}

	@Given("^verify if login is successfull$")
	public void verify_if_login_is_successfull() throws Throwable {
		System.out.println("login successfully");
	   
	}

}

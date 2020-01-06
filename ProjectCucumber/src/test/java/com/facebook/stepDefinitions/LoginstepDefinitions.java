package com.facebook.stepDefinitions;

import com.facebook.pageObject.Loginpageobject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginstepDefinitions extends Loginpageobject {
	Loginpageobject lpo = new Loginpageobject();

	@Given("^I am a user of facebook application$")
	public void i_am_a_user_of_facebook_application() throws Throwable {
		lpo.openURL();
	    
	}

	@When("^I enter valid username$")
	public void i_enter_valid_username() throws Throwable {
	   lpo.enterUsername();
	}

	@When("^I enter valid password$")
	public void i_enter_valid_password() throws Throwable {
	    lpo.enterPassword();
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		lpo.clickLoginButton();
	    
	}

	@Then("^User is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {
		lpo.verifyLogin();
	}


}

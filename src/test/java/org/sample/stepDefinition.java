package org.sample;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	@Given("User have to enter FB Login page")
	public void user_have_to_enter_FB_Login_page() {
		System.out.println("Open fb pages");
	}

	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
	       System.out.println("Entering email id and password");
	}

	@When("user have to click login button")
	public void user_have_to_click_login_button() {
		System.out.println("Clicking login button");
	}

	@Then("User have to be in invalid credential page.")
	public void user_have_to_be_in_invalid_credential_page() {
		System.out.println("Invalid page");
	}

}
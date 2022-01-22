package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepImplementations {

	@Given("^I load the \"(.+)\" sample$")

	public void loadURL(String url) {

		System.out.println("url " + url);

	}

	@Then("^I enter \"(.+)\" into the username field$")

	public void enterUsername(String username) {

		System.out.println("username " + username);
	}

	@Then("^I enter \"(.+)\" into the password field$")
	public void enterPassword(String pswd) {

		System.out.println("pswd " + pswd);

	}
	
	@Then("^I click the login button$")
	
	public void clickButton() {
		
		System.out.println("click");
	}

}

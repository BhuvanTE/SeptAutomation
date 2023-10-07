package StepDefinitions;

import driverActions.actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loignSteps {
	
	@Given("launch saas application")
	public void test()
	{
		actions.action();
	}
	
	@Then("^welcome text$")
	public void welcome() {
		System.out.println("Welcome message");
	}
	@And("verify")
	public void verify() {
		System.out.println("Verified successfully");
	}
}

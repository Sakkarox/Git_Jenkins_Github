package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	
	
	@Given("user navigates to the website {string}")
	public void user_navigates_to_the_website(String string) {
		
		System.out.println(new Throwable().getStackTrace()[0].getMethodName() + " method is called");
	
	}

	@When("there user logs in through Login Window by using Username as {string} and Password as {string}")
	public void there_user_logs_in_through_Login_Window_by_using_Username_as_and_Password_as(String string, String string2) {
		
		System.out.println(new Throwable().getStackTrace()[0].getMethodName() + " method is called");
		
	}

	@Then("login must be successful.")
	public void login_must_be_successful() {
	
		System.out.println(new Throwable().getStackTrace()[0].getMethodName() + " method is called");
		
	}

	
	
	
}

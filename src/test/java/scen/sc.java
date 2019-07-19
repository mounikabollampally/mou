package scen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sc {
	@Given("User enters the url")
	public void user_enters_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("enter url");
		
		
	}

	@When("enters {string} and {string}")
	public void enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println(string); 
		System.out.println(string2);
	}

	@Then("Home page is appeared")
	public void home_page_is_appeared() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("home page appears");
	}


}

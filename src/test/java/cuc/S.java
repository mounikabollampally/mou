package cuc;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class S {
	

@When("i enter user name")
public void i_enter_user_name() {
    // Write code here that turns the phrase above into concrete actions
}

@When("password")
public void password() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("the home page appeares")
public void the_home_page_appeares() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("i click on logout option")
public void i_click_on_logout_option() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("the login screen appeares")
public void the_login_screen_appeares() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();

}


@When("I go to All {string}")
public void i_go_to_All_Categories(String y) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
System.out.println(y);
}

@When("I navigate to {string}")
public void i_navigate_to_Electronics(String x) {
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
    System.out.println(x);

}

@When("Click on {int}")
public void click_on_HeadPhones(int v) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
    System.out.println(v);

}

@Then("the payment page appeares")
public void the_payment_page_appeares() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
}
}
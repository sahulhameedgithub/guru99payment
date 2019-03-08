package StepDefinition;

import Repositry.CardNumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CardNumberSteps {
	
	@Given("The user should click on card generate and should navigate to that page")
	public void the_user_should_click_on_card_generate_and_should_navigate_to_that_page() {
	    Hook.driver.get("http://demo.guru99.com/payment-gateway/cardnumber.php");
	
	}

	@When("The user should read the card detail content")
	public void the_user_should_read_the_card_detail_content() {
	Common c= new Common();
	c.split();
	c.splitCvv();
	c.splitExp();
       
	}

	@Then("save the card details")
	public void save_the_card_details() {
	    System.out.println("card details saved");
	}
	

}

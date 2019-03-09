package StepDefinition;

import Repositry.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {

	@Given("The user should be in payment gateway index")
	public void the_user_should_be_in_payment_gateway_index() {
	    
	 Hook.driver.get("http://demo.guru99.com/payment-gateway/index.php");
	}

	@When("the user should click buy now button")
	public void the_user_should_click_buy_now_button() {
		Homepage h=new Homepage();
		   Common c =new  Common();
		  c.click(h.getBuy_Now());  
	}

	@Then("the user shoudl navigate to payment process")
	public void the_user_shoudl_navigate_to_payment_process() {
	    
	}

}

package StepDefinition;

import Repositry.PaymentProcessPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentProcessSteps {
	@Given("The user should be in payment processing page")
	public void the_user_should_be_in_payment_processing_page() {
	    Hook.driver.get("http://demo.guru99.com/payment-gateway/process_purchasetoy.php");
	}

	@When("The user should wite the card detail")
	public void the_user_should_wite_the_card_detail() {
Common c = new Common();
c.cardDetails();
	}

	@Then("click on pay option")
	public void click_on_pay_option() {
	    PaymentProcessPage pg = new PaymentProcessPage();
	    pg.getsubmit();
	}

}

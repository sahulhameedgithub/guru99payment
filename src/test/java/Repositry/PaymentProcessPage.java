package Repositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.Hook;

public class PaymentProcessPage {
	
	public PaymentProcessPage() {
	PageFactory.initElements(Hook.driver, this);
	}
	@FindBy(id="card_nmuber")
	private WebElement Card_Nmuber;

	@FindBy(id="cvv_code")
	private WebElement CVV;
	
	@FindBy(id="month")
	private WebElement Expiry;

	@FindBy(id="year")
	private WebElement ExpYear;

	@FindBy(name ="submit")
	private WebElement submit;
	
	public WebElement getCard_Nmuber() {
		return Card_Nmuber;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getExpiry() {
		return Expiry;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	
	public WebElement getsubmit() {
		return submit;
	}
	
}

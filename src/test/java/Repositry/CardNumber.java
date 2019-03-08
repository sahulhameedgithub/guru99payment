package Repositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardNumber {

	@FindBy(xpath ="(//a[text()= 'Generate Card Number'])[1]")
	private WebElement Generate_card;
	
	@FindBy(xpath="(//div[@class='inner']//h4)[1]")
	private WebElement Card_Number;


	@FindBy(xpath="(//div[@class='inner']//h4)[2]")
	private WebElement CVV;
	
	@FindBy(xpath="(//div[@class='inner']//h4)[3]")
	private WebElement Exp;
	
	public WebElement getGenerate_card() {
		return Generate_card;
	}

	public WebElement getCard_Number() {
		return Card_Number;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getExp() {
		return Exp;
	}

	
}

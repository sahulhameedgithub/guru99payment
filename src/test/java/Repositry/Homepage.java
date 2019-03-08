package Repositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

	@FindBy(name="quantity")
	private WebElement Select_quantty;

	public WebElement getSelect_quantty() {
		return Select_quantty;
	}
	
	public WebElement getBuy_Now() {
		return Buy_Now;
	}

	@FindBy(xpath="//input[@class='button special']")
	private WebElement Buy_Now;
}

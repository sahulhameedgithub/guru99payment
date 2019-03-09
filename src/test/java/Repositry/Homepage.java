package Repositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.Hook;

public class Homepage {
	
	public Homepage() {
		PageFactory.initElements(Hook.driver, this);
		}

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

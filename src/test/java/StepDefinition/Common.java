package StepDefinition;

import org.openqa.selenium.WebElement;

import Repositry.CardNumber;
import Repositry.Homepage;
import Repositry.PaymentProcessPage;

public class Common {
	String expdate = null;
	String expyear = null;
	String cvv = null;
	String data = null;
	

	public void selectItem(String data) {
	// TODO Auto-generated method stub
Homepage ho = new Homepage();
WebElement select_quantty = ho.getSelect_quantty();
select_quantty.sendKeys(data);
	}
	public void click(WebElement element) {
		// TODO Auto-generated method stub
element.click();
	}
	
	public void split() {
		
		CardNumber cd=new CardNumber();
		String number = cd.getCard_Number().getText();
		String[] split2 = number.split(" ");
		for (int i = 1; i < split2.length; i++) {
			 data = split2[i];
			/*System.out.println(split2[i]);*/	
		}
		System.out.println(data);
	}
	public void splitCvv() {
		
		CardNumber cd=new CardNumber();
		String number = cd.getCVV().getText();
		String[] split2 = number.split(" ");
		for (int i = 1; i < split2.length; i++) {
			 cvv = split2[i];
			/*System.out.println(split2[i]);*/	
		}
		System.out.println(cvv);
	}
	
	public void splitExp() {
		
		CardNumber cd=new CardNumber();
		String number = cd.getExp().getText();
		String[] split2 = number.split(" ");
		
		for (int i = 1; i < split2.length; i++) {
			 expdate = split2[i];
			/*System.out.println(split2[i]);*/	
		}
		System.out.println(expdate);
			}
	public void cardDetails() {
		PaymentProcessPage pg= new PaymentProcessPage();
		pg.getCard_Nmuber().sendKeys("");
		pg.getCVV().sendKeys(cvv);
		pg.getExpiry().sendKeys("06");
		pg.getExpiry().sendKeys("2026");
	}
}

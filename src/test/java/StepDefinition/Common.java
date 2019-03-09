package StepDefinition;

import org.openqa.selenium.WebElement;

import Repositry.CardNumber;
import Repositry.Homepage;
import Repositry.PaymentProcessPage;

public class Common {
static	String expdate = null;
static	String expyear = null;
static	String cvv = null;
static	String data = null;
static String expda = null;
	

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
		String[] splitdate = expdate.split("/");
		for (int i = 0; i <splitdate.length; i++) {
			 expda = splitdate[i];	
			break;
		}
		System.out.println(expda);
		for (int i = 1; i <splitdate.length; i++) {
			expyear = split2[i];
				
		}
		
		System.out.println(expyear);
			}
	
	
	public void cardDetails() {
		PaymentProcessPage pg= new PaymentProcessPage();
		pg.getCard_Nmuber().sendKeys(data);
		pg.getCVV().sendKeys(cvv);
		pg.getExpiry().sendKeys(expda);
		pg.getExpiry().sendKeys(expyear);
	}
/*public void selectMonth(String expda) {
	PaymentProcessPage pg= new PaymentProcessPage();
	WebElement eleme = Hook.driver.findElement(By.id("month"));
	Select s = new Select(eleme);
	s.selectByValue(expda);
}

public void selectyear(String expyear) {
	PaymentProcessPage pg= new PaymentProcessPage();
	WebElement eleme = Hook.driver.findElement(By.id("year"));
	Select s = new Select(eleme);
	s.selectByValue(expyear);
}
*/
}

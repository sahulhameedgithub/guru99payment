package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	public static WebDriver driver;
	@Before
	public static void openBrowser() {
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver", "\\Users\\Admin\\oxygen\\eclipse-workspace\\Guru99Site\\LIB\\chromedriver.exe");
	 driver=new ChromeDriver();
	}

	@After
	public static void quit() {
	/*	driver.close();
		driver.quit();
		System.out.println("After Method");*/
	}

}

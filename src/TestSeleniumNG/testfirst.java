package TestSeleniumNG;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class testfirst {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		// Load browser
		System.setProperty("webdriver.chrome.driver", "C://Users//fabio//Desktop//chromedriver.exe");
		driver = new ChromeDriver();

		// Maximize browser
		//driver.manage().window().maximize();
	}

	@Test
	public void ridango() throws Exception {
		// Open Application
		driver.get("https://www.ss.lv/");
		Thread.sleep(2000);
	}
	
	@Test
	public void ridango2() throws Exception {
		// Open Application
		driver.get("http://narva.dev.ridango.com/");
		Thread.sleep(2000); 
	}
	

	@AfterTest
	public void afterTest() {
		driver.close();
	}	
	
}


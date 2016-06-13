package TestSeleniumNG;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class testsecond {

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
	public void ridango() {
		// Open Application
		driver.get("https://jenkins.io/doc/");
	}
	
	@Test
	public void ridango2() {
		// Open Application
		driver.get("http://tartu.test.ridango.com/");
	}
	

	@AfterTest
	public void afterTest() {
		driver.close();
	}	
	
}


package testautomation.WeeksExercises;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Exercise1 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		// The annotated method will be run before the first test method in the current
		// class is invoked.

		driver = new ChromeDriver(); // Creating New Instance Of Chrome Driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// This syntax will force webdriver to wait for
		// 10 second if element not found on page.
		driver.manage().window().maximize();// Maximize browser
		driver.get("https://itera-qa.azurewebsites.net/home/automation"); // Command To Open URL In Browser
	}

	@Test
	public void textarea() {

		/**
		 * fill in the code to complete the test method
		 */

	}

	@AfterClass
	public void afterClass() {
		driver.close();
		// The annotated method will be run after all the test methods in the current
		// class have been run.
	}

}

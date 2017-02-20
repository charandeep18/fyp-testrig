package sampleTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.runtime.PendingException;

public class Open {
	WebDriver driver = null;
	@Given("^user navigates to Website$")
	public void user_navigates_to_Website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.co.uk");
	}
	
}

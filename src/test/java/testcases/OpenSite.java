package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given;

public class OpenSite {
	WebDriver driver = null;
	@Given("^User has navigated to SAP website$")
	public void goToSiteLogin() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("http://localhost:8080/demoUI5AppNew/webapp/index.html");
}
}

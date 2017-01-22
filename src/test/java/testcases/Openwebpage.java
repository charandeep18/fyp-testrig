package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class Openwebpage {
WebDriver driver = null;
@Given("^user navigates to Website$")
public void goToSite() {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\chara\\Desktop\\geckodriver.exe");
driver = new FirefoxDriver();
driver.navigate().to("http://127.0.0.1:56039/Homepage.html");
}
}
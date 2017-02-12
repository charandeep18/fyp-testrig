package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;

public class Login {
	WebDriver driver = null;
	@Given("^User has navigated to the website to login$")
	public void goToSiteLogin() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("http://127.0.0.1:58714/Homepage.html");
}
	@And("^Finds the link to the login page$")
	public void findLogin(){
	driver.findElement(By.id("login"));
	}
	
	@Then("^Clicks on the login link")
	public void clickLoginButton(){
	driver.findElement(By.id("logn")).click();	
	}
	
	
	@Then("^Enters Username details$")
	public void enterUsername(){
	driver.findElement(By.id("login-username")).sendKeys("User1");
	}
	
	
	@And("^Enters Password details$")
	public void enterPassword(){
	driver.findElement(By.id("login-password")).sendKeys("Password");	
	}
	
	@Then("^Clicks Login$")
	public void clickLogin(){
	driver.findElement(By.id("btn-login")).click();		
	}
}

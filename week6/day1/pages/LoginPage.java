package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	ChromeDriver driver;
	
	@Given("Set the Environment")
	public void setEnvironment() {
	    driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
	}

	@Given("Enter the username as demosalesmanager")
	public void enterUsername() {
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}

	@Given("Enter the password as crmsfa")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on the login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify the login is successful")
	public void verifyLogin() {
	    System.out.println(driver.getTitle());
	}
	
}

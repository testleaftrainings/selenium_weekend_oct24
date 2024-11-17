package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod{
//	ChromeDriver driver;
	
	@Given("Set the Environment")
	public void setEnvironment2() {
	    driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
	}

	
	@Given("Enter the username as demo123")
	public void enterUsername2() {
	    driver.findElement(By.id("username")).sendKeys("demo123");
	}
	
	@Given("Enter the username as {string}")
	public void enterUsername(String username) {
	    driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@Given("Enter the password as crmsfa")
	public void enterPassword2() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on the login button")
	public void clickLoginButton2() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify the login is successful")
	public void verifyLogin2() {
	    System.out.println(driver.getTitle());
	}
	
}

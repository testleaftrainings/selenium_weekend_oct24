package stepDef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class LoginPage2 extends ProjectSpecificMethod{
//	ChromeDriver driver;
	
	

	@Given("Enter the username as demosalesmanager")
	public void enterUsername() {
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}

	
	
	
	
}

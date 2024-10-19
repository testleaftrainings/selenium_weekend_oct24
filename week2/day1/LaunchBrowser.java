package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//ClassName objectname = new ClassName();
		
		//shortcut to import -- ctrl + shift + o --> import all the statements and remove the unused import statements
		
		//To Launch the browser
		ChromeDriver driver = new ChromeDriver();
//		EdgeDriver ed = new EdgeDriver();
//		FirefoxDriver fd = new FirefoxDriver();
		
		/**
		 * InvalidArgumentException - In get() the url provided is invalid, provide the proper url Eg: https://www.google.com/
		 * */
		
		//To load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		// Locate the Element username , ctrl+2, l
		WebElement usernameField = driver.findElement(By.id("username"));
		// enter the username
		usernameField.sendKeys("democsr");
		
		//Locate the password element
		WebElement passwordField = driver.findElement(By.name("PASSWORD"));
		//enter the password
		passwordField.sendKeys("crmsfa");
		
		//Locate the Login button element 
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		//Click on the login button
		loginButton.click();
		
		//Locate the CRM/SFA link and click
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		// To get the title 
		String title = driver.getTitle();
		//Print the title
		System.out.println(title);
		
		
		//To close the browser
		driver.close();
		
	}

}

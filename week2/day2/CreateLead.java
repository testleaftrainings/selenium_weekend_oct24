package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {

		// To Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// To load the url
		driver.get("http://leaftaps.com/opentaps/");

		// To maximize the window
		driver.manage().window().maximize();

		// Locate the Element username , ctrl+2, l
		WebElement usernameField = driver.findElement(By.id("username"));
		// enter the username
		usernameField.sendKeys("democsr");

		// Locate the password element
		WebElement passwordField = driver.findElement(By.name("PASSWORD"));
		// enter the password
		passwordField.sendKeys("crmsfa");

		// Locate the Login button element
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		// Click on the login button
		loginButton.click();

		// Locate the CRM/SFA link and click
		driver.findElement(By.linkText("CRM/SFA")).click();

		// To get the title
		String title = driver.getTitle();
		// Print the title
		System.out.println(title);

		//Locate the Leads tab and click
		driver.findElement(By.linkText("Leads")).click();
		
		//Locate the Create Lead from shortcut menu and click
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Locate the Company name filed and enter TestLeaf
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Locate the first name field and enter your name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
		
		//Locate the last name filed and enter your last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
		
		
		//Locate Source Dropdown and Select Partner
			//Step1: Locate the Dropdown Element
		WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
			//Step2: Create object for Select and pass WebElement reference inside the constructor
		Select sourceDD = new Select(sourceWE);
			//step3: Use select methods to select value
		sourceDD.selectByIndex(7);
		
		//Locate the Industry dropdown and select computer software
			//Step1: Locate the Dropdown Element
		WebElement industryWE = driver.findElement(By.id("createLeadForm_industryEnumId"));
			//Step2: Create object for Select and pass WebElement reference inside the constructor
		Select industryDD = new Select(industryWE);
			//step3: Use select methods to select value
		industryDD.selectByValue("IND_SOFTWARE");
		
		//Locate the ownership dropdown and select partnership
			//Step1: Locate the Dropdown Element
		WebElement ownershipWE = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			//Step2: Create object for Select and pass WebElement reference inside the constructor
		Select ownershipDD = new Select(ownershipWE);
			//step3: Use select methods to select value
		ownershipDD.selectByVisibleText("Partnership");
		
		
		//Locate the Create Lead button and click
		driver.findElement(By.className("smallSubmit")).click();
		
		//Locate the Lead Id and print it 
		String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(leadID);
	
		// To close the browser
		driver.close();

	}

}

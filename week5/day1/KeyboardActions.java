package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	
	public static void main(String[] args) {
		
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("TestLeaf"+Keys.ENTER);
		WebElement firstLink = driver.findElement(By.xpath("//h3[text()='Testleaf: Selenium Training | Online Software Testing Course']"));
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(firstLink).keyUp(Keys.CONTROL).perform();
		
		
		
	}
	
	
}

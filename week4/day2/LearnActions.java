package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement menElement = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions action = new Actions(driver);
		action.moveToElement(menElement).perform();
		WebElement rainJacketsElement = driver.findElement(By.xpath("//a[text()='Rain Jackets']"));
		action.click(rainJacketsElement).perform();
		WebElement contactUs = driver.findElement(By.xpath("(//a[text()='Contact Us'])[2]"));
		action.scrollToElement(contactUs).pause(5000).click(contactUs).perform();
		
	}
	
	
}

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LearnWebDriverMethods {

	
	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/input.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Gokul");
		
		
	}
	
}

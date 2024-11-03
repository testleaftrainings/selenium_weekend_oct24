package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following::span[text()='Show']")).click();
		System.out.println(alert.getText());
		alert.dismiss();
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span[text()='Show']")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Gokul");
		alert.accept();
		//Non modal alert (Sweet Alert)
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']/following::span[text()='Show']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
		
	}
	
	
}

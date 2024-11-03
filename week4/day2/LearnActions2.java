package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement dragAndDrop = driver.findElement(By.id("form:conpnl"));
		action.dragAndDropBy(dragAndDrop, 200, 0).pause(1000).dragAndDropBy(dragAndDrop, -100, 0).perform();
		
		WebElement dragElement = driver.findElement(By.id("form:drag_content"));
		WebElement dropElement = driver.findElement(By.id("form:drop"));
		action.dragAndDropBy(dragElement, -200, -150).pause(2000).dragAndDropBy(dragElement, -50, 20).pause(2000).dragAndDrop(dragElement, dropElement).perform();
		WebElement draggableText = driver.findElement(By.xpath("//h4[text()='Draggable']"));
		action.doubleClick(draggableText).perform();
	}
	
	
}

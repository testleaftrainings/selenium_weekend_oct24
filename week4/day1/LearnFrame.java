package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.className("route-bar-breadcrumb")).click();
		//switch to frame by using index, index starts from zero
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		//To come out from the frame / back to the web page --> defaultContent
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("TestLeaf");
		
		WebElement secondFrame = driver.findElement(By.xpath("//h5[text()=' How many frames in this page?']/following::iframe"));
		driver.switchTo().frame(secondFrame);
		String countFrameText = driver.findElement(By.id("Click")).getText();
		System.out.println("Text present in the second frame is "+countFrameText);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);//Parent frame /outer frame 
		driver.switchTo().frame("frame2"); //Child frame/inner frame 
		driver.findElement(By.id("Click")).click();
		driver.switchTo().parentFrame();//Switch to parent frame
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		System.out.println(elements.size());
		
	}
	
}

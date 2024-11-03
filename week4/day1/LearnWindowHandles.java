package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		String currentWindowAddress = driver.getWindowHandle();
		System.out.println(currentWindowAddress);//6D5C4812C10E0015B6090C7633F026C7, 18027EE49BA965EF15EF26450A089D35, E3360409D52ECC0AA170C257E45D7EEF
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		System.out.println(driver.getTitle());
		Set<String> windowHandles = driver.getWindowHandles();// step1: get the all the window handles
		for (String string : windowHandles) {
			System.out.println(string);
		}
		List<String> window = new ArrayList<String>(windowHandles);// step2: convert the set into list
		driver.switchTo().window(window.get(1));//step3: transfer the driver control 
		System.out.println(driver.getTitle());
		driver.switchTo().window(currentWindowAddress);
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> window2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(window2.get(3));
		System.out.println(driver.getTitle());
		
		driver.close();//Close only the current window handle
		driver.quit(); //Close all the opened window handles 
		
	}
	
	
}

package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailClassroom {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS",Keys.ENTER);
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		int rowCount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr")).size();
		System.out.println("Row count is "+rowCount);
		System.out.println("<---------Get All the train Names---------->");
		Set<String> uniqueTrainNames = new LinkedHashSet<String>();
		List<String> duplicateTrainNames = new ArrayList<String>();
		for (int i = 2; i <=rowCount; i++) {
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			if(!uniqueTrainNames.add(text)) {
				duplicateTrainNames.add(text);
			}
		}
		System.out.println(uniqueTrainNames);
		if(duplicateTrainNames.size()>0) {
			System.out.println("There is a duplicate Train");
		}
		System.out.println(duplicateTrainNames);
		
		
		
	}
	
	
	
	
	
}

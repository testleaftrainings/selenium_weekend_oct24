package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		/*List<WebElement> headerRow = driver.findElements(By.xpath("(//span[text()='Customer Analytics Table']/following::table)[1]/thead/tr/th"));
		int columnCount = headerRow.size();
		System.out.println("The column count is "+ columnCount);
		for (WebElement element : headerRow) {
			System.out.println(element.getText());
		}
		String secondRowCountryName = driver.findElement(By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]/tbody/tr[2]/td[2]")).getText();
		
		System.out.println("Second row county name is "+ secondRowCountryName);
		
		List<WebElement> allData = driver.findElements(By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]/tbody/tr"));
		int rowCount = allData.size();
		List<WebElement> allCountryNames = driver.findElements(By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]/tbody/tr/td[2]"));
		System.out.println("<------------All Country Names(Option-1) ------------->");
		for (WebElement element : allCountryNames) {
			System.out.println(element.getText());
		}
		
		System.out.println("<------------All Country Names(Option-2) ------------->");
		for (int i = 1; i <=rowCount; i++) {
			String text = driver.findElement(By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(text);
		}
		
		
		System.out.println("<-----------Get all the data----------->");
		//To get all the data 
			//Step1: get the rowCount and colCount
			//Step2: Iterate the row 
		for (int i = 1; i <=rowCount; i++) {
			//step3: Iterate the column
			for (int j = 1; j <=columnCount; j++) {
				//Step4: Locate the WebElement and Get the text
				String text = driver.findElement(By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text);
			}
			
		}
		*/
		
		driver.get("https://erail.in/trains-between-stations/new-delhi-NDLS/mumbai-central-BCT");
		int rowCount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr")).size();
		System.out.println("Row count is "+rowCount);
		System.out.println("<---------Get All the train Names---------->");
		for (int i = 2; i <15; i++) {
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(text);
		}
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS",Keys.ENTER);
		
	}
	
	
}

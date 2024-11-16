package week6.day1;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

	@Test(dataProvider = "fetchData" )
	public void runCreateLead(String cname, String fname, String lname, String phno) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
//		driver.close();
	}

	@DataProvider(indices = { 2, 0 }, name = "fetchData")
	public String[][] sendData() throws InvalidFormatException, IOException {
		/*
		 * // dataType[][] varibaleName = new Datatype[rowSize][colSize]; String[][]
		 * data = new String[2][4];
		 * 
		 * data[0][0] = "TestLeaf"; data[0][1] = "Gokul"; data[0][2] = "Sekar";
		 * data[0][3] = "99";
		 * 
		 * data[1][0] = "Qeagle"; data[1][1] = "Babu"; data[1][2] = "M"; data[1][3] =
		 * "98";
		 * 
		 * return data;
		 */
		
		String[][] excelData = DataLibrary.readExcelData();
		return excelData;

	}

}

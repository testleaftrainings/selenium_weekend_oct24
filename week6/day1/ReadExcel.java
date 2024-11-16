package week6.day1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		//step1: Set the excel file path
		File filePath = new File("./testData/Login.xlsx");
		
		//step2: Open the workbook
		XSSFWorkbook workBook = new XSSFWorkbook(filePath);
		
		//step3: Get the sheet from workbook
		XSSFSheet sheetByIndex = workBook.getSheetAt(0);
		XSSFSheet sheetByName = workBook.getSheet("Sheet1");
		
		//step4: Get the row count
		int rowCount = sheetByIndex.getLastRowNum();
		System.out.println(rowCount);
		System.out.println(sheetByName.getLastRowNum());
		
		//step5: Get the row
		XSSFRow firstRow = sheetByIndex.getRow(0);
		
		//step6: Get the column count
		int columnCount = firstRow.getLastCellNum();
		System.out.println(columnCount);
		/*
		//step7: Get the cell by using index from the row
		XSSFCell firstRowSecondCell = firstRow.getCell(1);
		
		//step8: Get value from the cell
		String firstRowSecondCellValue = firstRowSecondCell.getStringCellValue();
		System.out.println(firstRowSecondCellValue);
		
		String secondRowSecondCellValue = sheetByName.getRow(1).getCell(1).getStringCellValue();
		System.out.println(secondRowSecondCellValue);
		
		String stringCellValue = sheetByIndex.getRow(1).getCell(3).getStringCellValue();
		System.out.println(stringCellValue);
		*/
		//Read All testData
		
		System.out.println("<----------------------All Test Data--------------------------->");
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j <columnCount; j++) {
				String stringCellValue2 = sheetByIndex.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue2);
			}
		}
		
		workBook.close();
		
	}

}

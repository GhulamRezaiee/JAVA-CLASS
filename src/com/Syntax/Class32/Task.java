package com.Syntax.Class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
	public static void main(String[] args) throws IOException {
		//create file path
		String filePath = "D:\\Program Project\\eclipse-workspace\\JAVA CLASS\\TestData\\Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		//Retrieve workbook
		Workbook book = new XSSFWorkbook(fis);
		//Retrieve sheet2
		Sheet sheet = book.getSheet("Sheet2");
		
		//get number of rows and columns
		int rows = sheet.getPhysicalNumberOfRows();
		
		int columns = sheet.getRow(0).getLastCellNum();
		
		//get cell information
		
		for (int r=0; r<rows; r++) {
			for (int c=0; c<columns; c++) {
				String cellValue = sheet.getRow(r).getCell(c).toString();
				System.out.format("%20s",cellValue,"");
			}
			System.out.println();
		}
	}
}

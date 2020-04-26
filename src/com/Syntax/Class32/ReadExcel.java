package com.Syntax.Class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		String filePath = "D:\\Program Project\\eclipse-workspace\\JAVA CLASS\\TestData\\Test.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		
		//get an object of workbook type
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		// need to find numbers of rows and columns
		
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getLastCellNum();
		
		//get data from all rows and all columns
		for (int r = 0; r < row; r++) { // iterates over rows
			for (int c = 0; c < column; c++) {//iterates over columns
				String cellVal = sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+" ");
			}
			System.out.println();
		}
		
		
		
	}
}


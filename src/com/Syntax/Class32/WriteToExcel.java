package com.Syntax.Class32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir")+"\\TestData\\Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet1 = book.getSheet("Sheet1");
		
		//create cell at first row and 6 column
		sheet1.getRow(0).createCell(5).setCellValue("Country");
		
		//create row 4 in excel file
		sheet1.createRow(3);
		
		//create cell in column one in row 4th
		sheet1.getRow(3).createCell(0).setCellValue("Hitcham");
		
		//create sheet in workbook
		Sheet customSheet = book.createSheet("Test");
		
		FileOutputStream fos = new FileOutputStream(filePath);
		book.write(fos);
		
		
		
		
	}

}

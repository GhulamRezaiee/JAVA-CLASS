package com.Syntax.Class32;

import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcelToMap {
	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir")+ "\\TestData\\Test.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		
		//get an object of workbook type
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		// need to find numbers of rows and columns
		
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getLastCellNum();
		
		List<Map<String,String>> listMap = new ArrayList<>();
		
		//get data from all rows and all columns and add them to the map and list
		for (int r = 1; r < row; r++) { // iterates over rows
			Map<String,String> map = new LinkedHashMap<>();
			for (int c = 0; c < column; c++) {//iterates over columns
				map.put(sheet.getRow(0).getCell(c).toString(),sheet.getRow(r).getCell(c).toString());
			}
			listMap.add(map);
		}
		
		System.out.println(listMap);
	}
}

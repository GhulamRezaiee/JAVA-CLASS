package com.Syntax.Class31;
//Shortcut for import for windows ctrl+shift+O // for mac command+shift+o
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {
	public static void main(String[] args) throws IOException {
		//to read a property file:
		//1. we need to have a file
		//2. we need to create an string to show file location
		String filePath = "D:\\Program Project\\eclipse-workspace\\JAVA CLASS\\configs\\Examples.properties";
		//3. bring object of FileIputStream
		FileInputStream fileInput = new FileInputStream(filePath);
		//to handle data from .properties file we need Property Class
		Properties prop = new Properties();
		prop.load(fileInput);
		String name = prop.getProperty("name");
		System.out.println(name);
		String city = prop.getProperty("city");
		System.out.println(city);
		
		//getting all keys from property file
		System.out.println("----------------------");
		Set<Object> keys = prop.keySet();
		for(Object key:keys) {
			System.out.println(key);
		}
	}
}

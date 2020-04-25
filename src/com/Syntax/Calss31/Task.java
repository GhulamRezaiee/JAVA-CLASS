package com.Syntax.Calss31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//Create a file to store {browser, url, username, password} 
//read file and extract browser and url
public class Task {
	public static void main(String[] args) throws IOException {
		//additional information for system info
		String username = System.getProperty("user.name");
		System.out.println(username);
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		System.out.println("----------------------------------------");
		
		String userDirectory = System.getProperty("user.dir");
		String filePath = userDirectory+"\\configs\\Task.properties";
		
		FileOutputStream fos = new FileOutputStream(filePath);
		
		Properties prop = new Properties();
		prop.setProperty("browser", "Chrome");
		prop.setProperty("url", "https://mail.google.com");
		prop.setProperty("username", "Admin");
		prop.setProperty("password","Pass123");
		
		prop.store(fos, "create a file");
		
		FileInputStream fis = new FileInputStream(filePath);
		
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		
		System.out.format("Open %s in the %s browser.",url,browser);
	}

}

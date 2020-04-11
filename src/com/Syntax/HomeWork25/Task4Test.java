package com.Syntax.HomeWork25;

public class Task4Test {
	public static void main(String[] args) {
		RemoteWebDriver [] browsers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
		
		for (RemoteWebDriver browser : browsers) {
			browser.open();
			System.out.println(browser.getTitle());
			browser.getScreenShot();
			browser.close();
			browser.navigate();
			System.out.println("--------------------");
		}
		
	}

}

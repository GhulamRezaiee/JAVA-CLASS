package com.Syntax.HomeWork25;

interface WebDriver {
	void open();
	void close();
	String getTitle();
}

interface TakeScreenShot {
	void getScreenShot();
}


interface RemoteWebDriver extends WebDriver,TakeScreenShot {
	void navigate();
}


class ChromeDriver implements RemoteWebDriver{
	@Override
	public String getTitle() {
		String getTitle="Chrome";
		return getTitle;
	}
	@Override
	public void open() {
		System.out.println("We can open browser in "+ this.getTitle());
	}
	
	@Override
	public void close() {
		
		System.out.println("We can close browser in "+ this.getTitle());		
	}
	
	@Override
	public void getScreenShot() {
		System.out.println(this.getTitle()+ " can take screenshot");
	}
	@Override
	public void navigate() {
		System.out.println(this.getTitle()+ " can navigate");
	}
	
}

class FirefoxDriver implements RemoteWebDriver{
	@Override
	public String getTitle() {
		String getTitle="Firefox";
		return getTitle;
	}
	@Override
	public void open() {
		System.out.println("We can open browser in "+ this.getTitle());
	}
	
	@Override
	public void close() {
		
		System.out.println("We can close browser in "+ this.getTitle());		
	}
	
	@Override
	public void getScreenShot() {
		System.out.println(this.getTitle()+ " can take screenshot");
	}
	@Override
	public void navigate() {
		System.out.println(this.getTitle()+ " can navigate");
	}
	
}

class SafariDriver implements RemoteWebDriver{
	@Override
	public String getTitle() {
		String getTitle="Safari";
		return getTitle;
	}
	@Override
	public void open() {
		System.out.println("We can open browser in "+ this.getTitle());
	}
	
	@Override
	public void close() {
		
		System.out.println("We can close browser in "+ this.getTitle());		
	}
	
	@Override
	public void getScreenShot() {
		System.out.println(this.getTitle()+ " can take screenshot");
	}
	@Override
	public void navigate() {
		System.out.println(this.getTitle()+ " can navigate");
	}
	
}

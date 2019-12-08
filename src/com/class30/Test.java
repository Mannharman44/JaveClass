package com.class30;

public class Test {

	public static void main(String[] args) {
		WebDriver obj=new ChromeDriver();
		obj.closeBrowser();
		obj.openBrowser();
		obj.maximizeWindow();
		obj.findElement();
		obj.takesScreen();
		
		WebDriver obj1=new FirefoxDriver();
		obj1.closeBrowser();
		obj1.openBrowser();
		obj1.maximizeWindow();
		obj1.findElement();
		obj1.takesScreen();

	}

}

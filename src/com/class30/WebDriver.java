package com.class30;
interface TakesScreenshot{
	
	String FILE_EXTENSION= " .png";
	void takesScreen();
	
	static void takeSelfie() {
		System.out.println("I am static method ");
	}
	default void takePictures() {
		System.out.println("i am default method of interface ");
	}
	
	
}
public interface WebDriver extends TakesScreenshot {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	
	
}
abstract class Browser{
	String name;
public abstract void refresh();
	
}
class ChromeDriver extends Browser implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Open Chrome Driver");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Chrome Driver");		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize Chrome Driver");
	}

	@Override
	public void findElement() {
		System.out.println("Find Element in Chrome Driver");
	}	
	
	public void refresh() {
		System.out.println("Refresh chrome Browser");
		
	}
	
	public void takesScreen() {
		System.out.println("Takes screen shots in chrome driver");
	}
}
class FirefoxDriver extends Browser implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Open Firefox Driver");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Firefox Driver");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize Firefox Driver");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find Element in Firefox Driver");
		
	}
	public void refresh() {
		System.out.println("Refresh Firefox Browser");
		
	}
	public void takesScreen() {
		System.out.println("Takes screen shots in Firefox driver");
	}
}
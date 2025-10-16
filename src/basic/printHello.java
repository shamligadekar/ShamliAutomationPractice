package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printHello {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub
		System.out.println("123");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		}
		 */
	
	System.out.println("Launch Browser");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	System.out.println("Navigate to http://automationbykrishna.com/");
	driver.navigate().to("http://automationbykrishna.com/");
	String expectedTitle="Login Signup Demo";
	String actualTitle=driver.getTitle();
	if(expectedTitle.equals(actualTitle)) {
		System.out.println("Title Vrification Test Pass");
	}else {
		System.out.println("Title verification Test Fail");
	}
	
	System.out.println("Navigate back and verify Title");
	driver.navigate().back();
	
	if("Google".equals(driver.getTitle())){
		System.out.println("Title verification Test PASS");
	}else {
		System.out.println("Title verification Test Fail");
	}
	
	System.out.println("Navigate forward and verify Title");
	driver.navigate().forward();
	if("Login Signup Demo".equals(driver.getTitle())){
		System.out.println("Title verification Test PASS");
	}else {
		System.out.println("Title verification Test Fail");
	}
	
	
	System.out.println("Refresh the page and verify Title");
	driver.navigate().refresh();
	if("Login Signup Demo".equals(driver.getTitle())){
		System.out.println("Title verification Test PASS");
	}else {
		System.out.println("Title verification Test Fail");
	}
	

}

}

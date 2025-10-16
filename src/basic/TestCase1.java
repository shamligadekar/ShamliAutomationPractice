/*
 * TestCase - 1 : 

1) Launch browser
2) load google.com and verify title
3) navigate to automationbykrishna and verify title
4) navigate back and verify title  [google title]
5) navigate forward and verify title [automationbykrishna title]
6) refresh the page and verify title [automationbykrishna title]
 */

package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		
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

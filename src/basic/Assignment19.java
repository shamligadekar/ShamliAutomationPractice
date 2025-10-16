/*
 * Assignment - 19 : 1st Sep'2024

url : http://automationbykrishna.com/index.html

Step 1 : Launch Browser
Step 2 : Load given url
Step 3 : Click on DemoTable link
Step 4 : Print first table using 2 for loops.
 */


package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment19 {
	
	WebDriver driver;
	
	void printTable() {
		driver= ControlAction.start("http://automationbykrishna.com/");
		WebElement demoTableLinkElement=ControlAction.getElement("LINKTEXT", "Demo Tables", false, driver);
		demoTableLinkElement.click();	
		 
		WebElement table1=ControlAction.getElement("XPATH", "//table[@id='table1']", true, driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='table1']")));
		
		int totalCols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th")).size();
		int totalRows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		
		for(int rowIndex=1;rowIndex<=totalRows;rowIndex++) {
			for(int colIndex=1;colIndex<=totalCols;colIndex++) {
				String text=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+rowIndex+"]/td["+colIndex+"]")).getText();
				System.out.print(text +" ");
			}
			System.out.println();
		}
	}
	
	void printTableSmartly() {
		String text=driver.findElement(By.xpath("//table[@id='table1']/tbody")).getText();
		System.out.println(text);
	}

	public static void main(String[] args) {
		Assignment19 as19=new Assignment19();
		as19.printTable();
		as19.printTableSmartly();
	}
}

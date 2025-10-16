/*
 * Assignment - 14 : 31st Aug
Q1. How many tables are there on the page.
Q2. How many employees are there in the first table.
Q3. How many columns are there in the first table.
Q4. Print all the available header from the first table
 */


package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment14 {

	public static void main(String[] args) {
		WebDriver driver= ControlAction.start("http://automationbykrishna.com");
		driver.findElement(By.xpath("//a[text()='Demo Tables']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='table1']")));
		
		System.out.println("Print how many tables are present on the page : ");
		List<WebElement> tablelist= driver.findElements(By.xpath("//table"));
		System.out.println(tablelist.size());

		System.out.println("Print how many Employees are there in first table : ");
		List<WebElement> empList= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		int empCount=empList.size();
		System.out.println(empCount);
	
		System.out.println("Print number of columns in the first table : ");
		int colsize= driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th")).size();
		System.out.println(colsize);
		
		System.out.println("Print all the available headers from the first table : ");
		for(int colIndex=1;colIndex<=colsize;colIndex++) {
			String text=driver.findElement(By.xpath("//table[@id='table1']//thead/tr/th["+colIndex+"]")).getText();
			System.out.println(text+" ");
		}
		
		System.out.println("Print all the usernames from the first table : ");
		for(int index=1;index<=empCount;index++) {
			String username=driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+index+"]/td[4]")).getText();
			System.out.println(username);
		}
		
		
		List<WebElement> listOfHeaders=driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th"));
		int targetIndex=0;
		for(int index=0;index<listOfHeaders.size();index++) {
			WebElement e=listOfHeaders.get(index);
			if(e.getText().equals("Username")) {
				targetIndex=index+1;
				break;
			}
		}
		System.out.println("Username column is at "+targetIndex+" index");
		
		System.out.println("Print the lastname of employee Abhishek. Considering rows are dynamic and cols are fixed.");
		String lastName=driver.findElement(By.xpath("//table[@id='table1']//td[text()='Abhishek']/following-sibling::td[1]")).getText();
		System.out.println("Last Name of Abhishek is " +lastName);
		
			
	}
	
	
}

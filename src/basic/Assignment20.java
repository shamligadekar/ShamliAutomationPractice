package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment20 {

	void verifyUserName() {
		WebDriver driver=ControlAction.start("http://automationbykrishna.com/");
		WebElement demoTableLinkElement=ControlAction.getElement("LINKTEXT", "Demo Tables", false, driver);
		demoTableLinkElement.click();	
		 
		WebElement table1=ControlAction.getElement("XPATH", "//table[@id='table1']", true, driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='table1']")));
		System.out.println("Hello");
		
		int totalCols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th")).size();
		int totalRows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		
		System.out.println(totalCols);
		System.out.println(totalRows);
		
		for(int index=1;index<=totalRows;index++) {
			String firstName=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+index+"]/td[2]")).getText();
			String lastName=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+index+"]/td[3]")).getText();
			String expectedUserName=(firstName.charAt(0) + lastName).toLowerCase();
			System.out.println(expectedUserName);
		}
	}
	
	public static void main(String[] args) {
		Assignment20 as20=new Assignment20();
		as20.verifyUserName();
		

	}

}

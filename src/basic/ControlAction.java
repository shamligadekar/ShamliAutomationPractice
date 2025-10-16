package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlAction {
	
	public static WebDriver start(String url) {
		System.out.println("Step-1 : Launch Browser");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Step-2 : Load url");
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static WebElement getElement(String locatorType,String locatorValue,boolean isWaitRequired,WebDriver driver) {
		WebElement e= null;
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		switch(locatorType.toUpperCase()) {
			case "XPATH":
				if(isWaitRequired) {
					e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
				}else {
					e=driver.findElement(By.xpath(locatorValue));
				}
			break;	
			
			case "ID":
				if(isWaitRequired) {
					e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
				}else {
					e=driver.findElement(By.id(locatorValue));
				}
			break;	
			
			case "NAME":
				if(isWaitRequired) {
					e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorValue)));
				}else {
					e=driver.findElement(By.name(locatorValue));
				}
			break;	
			
			case "LINKTEXT":
				if(isWaitRequired) {
					e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locatorValue)));
				}else {
					e=driver.findElement(By.linkText(locatorValue));
				}
			break;	
		}
		   return e;  
	}

}
 
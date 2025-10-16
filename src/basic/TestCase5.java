/*
 * Assignment - 5 : 25th Aug   
url : http://automationbykrishna.com

Step 1 : Launch Browser
Step 2 : Load given url
Step 3 : Click on Registration link
Step 4 : Fill up registration form.
Step 5 : Click on submit button.

Manually verify Pop up messae should be Success

 */


package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase5 {

	public static void main(String[] args) {
		WebDriver driver=ControlAction.start("http://automationbykrishna.com/");
	     
		try {
		Thread.sleep(3000);}
		catch(Exception e) {
			System.out.println("Handled");
		}
		System.out.println("Enter Registration Details");
		
		WebElement fullNameElement=driver.findElement(By.id("fullName"));
		//fullNameElement.click();
		fullNameElement.sendKeys("Shamli Sanjay Gadekar");
		
		WebElement addressElement=driver.findElement(By.xpath("//input[@id='address']"));
		addressElement.sendKeys("Shukrawar Peth Pune");
		
		WebElement userEmailElement=driver.findElement(By.xpath("//input[@id='useremail']"));
		userEmailElement.sendKeys("shamligadekar123@gmail.com");
		
		WebElement userCityElement=driver.findElement(By.xpath("//input[@id='usercity']"));
		userCityElement.sendKeys("Pune"); 
		
		WebElement companyElement=driver.findElement(By.xpath("//input[@id='organization']"));
		companyElement.sendKeys("Atos"); 
		
		
		
		WebElement genderElement=driver.findElement(By.xpath("//div//input[@id='radio-02']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", genderElement);
		genderElement.click();
		
		WebElement userNameElement=driver.findElement(By.xpath("//input[@id='usernameReg']"));
		userNameElement.sendKeys("sgadekar");
		
		WebElement passwordElement=driver.findElement(By.xpath("//input[@id='passwordReg']"));
		passwordElement.sendKeys("Shamli@123");
		
		WebElement rePasswordElement=driver.findElement(By.xpath("//input[@id='repasswordReg']"));
		rePasswordElement.sendKeys("Shamli@123");
		
		WebElement agreeCheckBoxElement=driver.findElement(By.xpath("//input[@id='signupAgreement']"));
		agreeCheckBoxElement.click();
		
		WebElement submitBtnElement=driver.findElement(By.xpath("//button [@id='btnsubmitsignUp']"));
		submitBtnElement.click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();

	}

}

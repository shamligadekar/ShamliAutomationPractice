/*
 * Assignment - 6 : 26th Aug
url : https://automationbykrishna.com

Step 1 : Launch Browser
Step 2 : Load given url
Step 3 : Click on Registration link
Step 4 : verify login functionality for below combination.
i)verify with No pwd/char
ii)less than 8 char
iii)exact 8 char
iv) for 9char
 */

package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase6 {

	public static void main(String[] args) {
		WebDriver driver=ControlAction.start("http://automationbykrishna.com/");
		System.out.println("Step 3 : Click on Registraton Link");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//WebElement registrationElement=driver.findElement(By.xpath());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='registration2']"))).click();
		
		//registrationElement.click();
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		System.out.println("Step-4 : Verify login with no password");
		
		WebElement userid=driver.findElement(By.xpath("//input[@id='unameSignin']"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@id='unameSignin']"))));
		userid.sendKeys("sgadekar");
		
		WebElement pswd=driver.findElement(By.xpath("//input[@id='pwdSignin']"));
		pswd.sendKeys("");
		
		WebElement sbmitbtn=driver.findElement(By.xpath(" //button[@id='btnsubmitdetails']"));
		sbmitbtn.click();
		
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		if(alertText.equals("Failed! please enter password")) {
			System.out.println("Test PASS");
		}
		alert.accept();
		driver.close(); 
	}

}

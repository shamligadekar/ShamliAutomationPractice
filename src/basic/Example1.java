package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ControlActions;

public class Example1 {
	
	@Test(dataProvider="loginDataProvider")
	
	public void doLogin(String uname, String pwd, String expectedMessage) {
		WebDriver driver=ControlActions.start("http://automationbykrishna.com/");
		driver.findElement(By.linkText("Registration")).click();
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='unameSignin']"))).sendKeys(uname);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pwdSignin']"))).sendKeys(pwd);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnsubmitdetails']"))).click();
		
	
		
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		alert.accept();
		Assert.assertEquals(text, expectedMessage);
		
		driver.findElement(By.xpath("//input[@id='unameSignin']")).clear();
		driver.findElement(By.xpath("//input[@id='pwdSignin']")).clear();
		
		
		
	}
	
	@DataProvider
	public Object[][] loginDataProvider(){
		Object[][] data=new Object[2][3];
		data[0][0]="mkanani";
		data[0][1]="mkanani@1234";
		data[0][2]="Success!";
		
		data[1][0]="kkanani";
		data[1][1]="kkanani@1234";
		data[1][2]="Success!";
		
		return data;
	}

}

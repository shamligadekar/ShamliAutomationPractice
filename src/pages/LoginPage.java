package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.ControlActions;

public class LoginPage extends ControlActions {
	
	String emailXpath="//input[@id='user-name']";
	String passwordXpath="//input[@id='password']";
	String loginXpath="//input[@id='login-button']";
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	
	public boolean isUserNameFieldDisplayed() {
		WebElement emailFieldLocator=driver.findElement(By.xpath(emailXpath));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailXpath)));
		return emailFieldLocator.isDisplayed();
	}
	
	public boolean isPasswordFieldDisplayed() {
		WebElement passwordFieldLocator=driver.findElement(By.xpath(passwordXpath));
		return passwordFieldLocator.isDisplayed();
	}

	public boolean isLoginButtonDisplayed() {
		WebElement loginBtnLocator=driver.findElement(By.xpath(loginXpath));
		return loginBtnLocator.isDisplayed();
	}
	
	
	public void enterUserName(String userName) {
		WebElement emailFieldLocator=driver.findElement(By.xpath(emailXpath));
		emailFieldLocator.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		WebElement passwordFieldLocator=driver.findElement(By.xpath(passwordXpath));
		passwordFieldLocator.sendKeys(password);
	
	}
	
	public void clickOnLoginBtn() {
		WebElement loginFieldLocator=driver.findElement(By.xpath(loginXpath));
		loginFieldLocator.click();
	}
}

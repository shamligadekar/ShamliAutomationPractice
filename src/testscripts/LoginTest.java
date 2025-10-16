package testscripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.ControlActions;
import pages.LoginPage;

public class LoginTest extends ControlActions {
	
	
	@BeforeMethod
	public void setup() {
		ControlActions.start("https://www.saucedemo.com/v1/index.html");
	}
	
	@Test
	public void testLoginFunctionality() {
		System.out.println("VERIFY : Login page is visible [username ,password and login buttons are displayed])");
		LoginPage loginPage=new LoginPage();
		boolean userNameFieldFlag=loginPage.isUserNameFieldDisplayed();
		System.out.println(userNameFieldFlag);
		boolean passwordFieldFlag=loginPage.isPasswordFieldDisplayed();
		boolean loginButtonFlag=loginPage.isLoginButtonDisplayed();
		
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(userNameFieldFlag, "User NAme Field was not displayed");
		softassert.assertTrue(passwordFieldFlag, "password field was not displayed");
		softassert.assertTrue(loginButtonFlag, "Login Button was not displayed");
		softassert.assertAll();
		System.out.println("All 3 elements are displayed on the login page");
		
		System.out.println("Enter valid userName");
		loginPage.enterUserName("standard_user");
		
		System.out.println("Enter Password");
		loginPage.enterPassword("secret_sauce");
		
		System.out.println("Click on Login Button");
		loginPage.clickOnLoginBtn();
	}
	
	
}

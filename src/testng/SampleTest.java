package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import basic.ControlAction;

public class SampleTest {

	@Test
	public void firstTest() {
		WebDriver driver= ControlAction.start("http://automationbykrishna.com/index.html");
		String actualText=driver.findElement(By.xpath("//p[text()='Enter your credentials below']")).getText();
		String expectedText="Enter your credentials below";
		Assert.assertEquals(actualText,expectedText);
		
		
	}
}

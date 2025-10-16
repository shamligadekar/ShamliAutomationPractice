package fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.ControlActions;

public class FileUploadest {
	
	@Test
	
	public void verifyFileUpload() throws InterruptedException, AWTException {
		WebDriver driver=ControlActions.start("https://demo.automationtesting.in/Register.html");
		System.out.println("STEP 2 : Click on Choose File");
		
		StringSelection selection = new StringSelection("C:\\Users\\Administrator\\Desktop\\Shamli Naukari Resume\\Shamli_Gadekar_AutomationTesting.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Thread.sleep(3000);
		WebElement e= driver.findElement(By.xpath("//input[@id='imagesrc']"));
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].click()", e);
		
		System.out.println("Select the file to be uploaded");
		Robot robot=new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
	}

	
	
	
}

package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlActions {

	protected static WebDriver driver;
		
	public static WebDriver start(String url) {
		System.out.println("STEP_1 : Launch Browser");
		driver=new ChromeDriver();
		System.out.println("STEP-2 : Load url");
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
		
		
	}
}

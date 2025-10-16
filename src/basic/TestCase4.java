/*
 * Assignment - 4 : 25th Aug

URL : https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette

Step 1 : Launch Browser
Step 2 : Hit above url.
Step 3 : Print total available optinos in dropdown
Step 4 : Select options at index3,5 and 10.
Step 5: Verify how many options are selected. [1]
Step 6 : Print all selected options. []

 */

package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase4 {
	
	public static void main(String[] args) {
		WebDriver driver=ControlAction.start("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		WebElement dropdownElement=driver.findElement(By.xpath("//div[@rel-title='Select Country']/p/select"));
		System.out.println("Step-3 : Print Total available options in dropdown"); 
		Select countrySelect=new Select(dropdownElement);	
		
		int totalOptions=countrySelect.getOptions().size();
		System.out.println("Total Options of dropdown are : "+totalOptions);
		
		System.out.println(countrySelect.isMultiple());
		System.out.println("Select index 3, 5 and 10 from dropdown");
		countrySelect.selectByIndex(3);
		countrySelect.selectByIndex(5);
		countrySelect.selectByIndex(10);
		
		System.out.println("Total Selected options are :");
		List <WebElement> selectedOptions=countrySelect.getAllSelectedOptions();
		System.out.println(selectedOptions.size());
		
		System.out.println("Below are the selected options");
		for(WebElement e :selectedOptions ) {
			System.out.println(e.getText());
		}
				
	}

}

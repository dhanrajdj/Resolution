package seliniumUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilites {

	
	static WebDriver driver;
	
	public static void click(WebElement element,String stringName ){
		
		element.click();
		System.out.println("click on "+ stringName);
	}
	
	public static void enter(WebElement ele, String stringdhan, String elementName){
		
		ele.sendKeys(elementName);
		System.out.println("Enter at "+ stringdhan);
		
	}
	
	
	public static void explicitWait(WebElement element){
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
		
	}
	
}

	
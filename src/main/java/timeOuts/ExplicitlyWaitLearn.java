package timeOuts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumBasics.BrowserInvoke;
import seleniumBasics.SeleniumHelpers;

public class ExplicitlyWaitLearn {

	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com/";
	
	
	public static void main(String[] args) throws Exception {

		driver=BrowserInvoke.openBrowser(driver, url);
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='A/B Testing']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		SeleniumHelpers.clickElement(driver, ele);
		
			
		driver.quit();

	}

}

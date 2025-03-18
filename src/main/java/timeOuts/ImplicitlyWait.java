package timeOuts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumBasics.BrowserInvoke;

public class ImplicitlyWait {
	
	

	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com/drag_and_drop";
	public static void main(String[] args) throws Exception {

		driver=BrowserInvoke.openBrowser(driver, url);
		
		
		
		
		driver.findElement(By.xpath("//abc")).click();
		
		
		
		driver.quit();
	}

}

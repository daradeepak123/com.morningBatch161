package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumBasics.BrowserInvoke;

public class FindAllHyperLinks {
	
	
	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com/";
	
	
	public static void main(String[] args) throws Exception {

		driver=BrowserInvoke.openBrowser(driver, url);
		
		String data=driver.findElement(By.xpath("//a[text()='A/B Testing']")).getText();
		System.out.println(data);
		
		
		List<WebElement> links=driver.findElements(By.xpath("//a[contains(text(),'A')]"));
		System.out.println(links.size());
		for(WebElement ele:links )
		{
			System.out.println(ele.getText());
		}
		
	
		
		driver.quit();
		
	}

}

package webElements;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumBasics.BrowserInvoke;

public class OpenLinksNewTab {
	
	
	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com/";
	
	
	public static void main(String[] args) throws Exception {

		driver=BrowserInvoke.openBrowser(driver, url);
		
		String data=driver.findElement(By.xpath("//a[text()='A/B Testing']")).getText();
		System.out.println(data);
		String parent=driver.getWindowHandle();
		
		String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		for(WebElement ele:links )
		{
			ele.sendKeys(clicklnk);
			//System.out.println(ele.getText());
		}
		
		
		Set<String> win=driver.getWindowHandles();
		for(String s:win)
		{
			if(!s.equals(parent))
			{
				driver.switchTo().window(s);
				
				System.out.println(driver.getCurrentUrl());
				driver.close();
				
			}
		}
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}

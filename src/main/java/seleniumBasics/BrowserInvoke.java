package seleniumBasics;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import dataDriven.PropertyFileData;

public class BrowserInvoke {
	
	
	public static WebDriver openBrowser(WebDriver driver,String url) throws Exception
	{
		
		
		String browser=PropertyFileData.retriveProperty("/src/main/java/data/config.properties", "browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
		driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")){
			driver=new InternetExplorerDriver();
			}
			
		else if(browser.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
			}
			
		else {
			driver=new FirefoxDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		return driver;
		
	}
	
	
	
	

}

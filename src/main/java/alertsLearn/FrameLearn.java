package alertsLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumBasics.BrowserInvoke;

public class FrameLearn {
	static WebDriver driver;
	static String data;
	static String url="https://demoqa.com/frames";
	
	
	public static void main(String[] args) throws Exception {

		driver=BrowserInvoke.openBrowser(driver, url);

		driver.switchTo().frame("frame1");
		
		String s=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		
		System.out.println(s);
		
		driver.quit();
		
	}

}

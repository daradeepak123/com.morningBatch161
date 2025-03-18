package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxLearn {


	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com/checkboxes";
	public static void main(String[] args) throws Exception {

		driver=BrowserInvoke.openBrowser(driver, url);
		WebElement chkbox1=driver.findElement(By.xpath("(//input)[1]"));
		WebElement chkbox2=driver.findElement(By.xpath("(//input)[2]"));
		
		if(!chkbox1.isSelected())
		{
			chkbox1.click();
		}
		
		if(!chkbox2.isSelected())
		{
			chkbox2.click();
		}

		
		
		
		
		Thread.sleep(5000);

		driver.quit();	

	}

}

package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com/dropdown";
	public static void main(String[] args) throws Exception {

		driver=BrowserInvoke.openBrowser(driver, url);
		
		WebElement eleeOption=driver.findElement(By.xpath("//option[text()='Please select an option']"));
		
		System.out.println(eleeOption.isEnabled());
		
		
		
		
		WebElement ele=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select sel=new Select(ele);
		
		sel.selectByVisibleText("Option 1");
		
		Thread.sleep(3000);
		
		sel.selectByValue("2");
		Thread.sleep(3000);
		
		sel.selectByIndex(1);
		Thread.sleep(3000);
		driver.quit();

	}

}

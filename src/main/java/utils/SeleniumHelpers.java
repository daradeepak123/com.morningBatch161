package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelpers {
	
	public static boolean isElementDisplayedANdEnabled(WebElement ele)
	{
		boolean b=ele.isDisplayed();
		b&=ele.isEnabled();
		return b;
	}
	
	public static String getTextFromElement(WebElement ele)
	{
		if(isElementDisplayedANdEnabled(ele))
		{
			System.out.println(ele.getText());
		}
		else
		{
			System.out.println("element not displayed or visible");
		}
		
		return ele.getText();
		
	}
	
	
	public static void sendDataTextBox(WebElement ele,String data)
	{
		if(isElementDisplayedANdEnabled(ele))
		{
			ele.clear();
			ele.sendKeys(data);
		}
		else
		{
			System.out.println("not able to find element");
		}
		
	}
	
	
	public static void clickElement(WebDriver driver,WebElement ele)
	{
		if(isElementDisplayedANdEnabled(ele))
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
		}
		else
		{
			System.out.println("not able to find element");
		}
		
	}
	
	
	
	

}

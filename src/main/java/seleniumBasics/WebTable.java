package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable {
	
	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com/tables";
	public static void main(String[] args) throws Exception {

		driver=BrowserInvoke.openBrowser(driver, url);
		
		
		int row=driver.findElements(By.xpath("//table[@id='table1']/tbody//tr")).size();
		
		int col=driver.findElements(By.xpath("//table[@id='table1']/tbody//tr[1]/td")).size();
		
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				WebElement tData=driver.findElement(By.xpath("//table[@id='table1']/tbody//tr["+i+"]/td["+j+"]"));
				System.out.print(tData.getText()+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		driver.quit();
		
		

	}

}

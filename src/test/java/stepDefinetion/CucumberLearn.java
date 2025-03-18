package stepDefinetion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import seleniumBasics.BrowserInvoke;

public class CucumberLearn {
	WebDriver driver;
	
	@Given("user opens chrome browser")
	public void user_opens_chrome_browser() throws Exception {
		driver=BrowserInvoke.openBrowser(driver, "https://mvnrepository.com/artifact/io.cucumber/cucumber-java");
	}

	@When("Load url")
	public void load_url() {
	   driver.get("https://mvnrepository.com/artifact/io.cucumber/cucumber-java");
	}

	@When("validate title")
	public void login_into_application() {
	   String title=driver.getTitle();
	   System.out.println(title);
	}

	@When("close browser")
	public void validate_login_is_succesful() {
	  driver.close();
	}


}

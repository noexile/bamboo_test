package cucumber.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class CucumberJava {
	WebDriver driver = null;
    final TestAppender appender = new TestAppender();
	final Logger logger = Logger.getRootLogger();
	
	@Before
	private void init() {
		logger.addAppender(appender);
	}
	
	
	@Given("^I have open the browser$")
	public void openBrowser() throws MalformedURLException {
//		FirefoxDriverManager.getInstance().setup();
//		DesiredCapabilities cap = DesiredCapabilities.firefox();
		
		ChromeDriverManager.getInstance().setup();
		DesiredCapabilities cap = DesiredCapabilities.chrome();

//		cap.setPlatform(Platform.ANY);
//		URL url=new URL("http://192.168.2.168:4444/wd/hub");
		
		URL url=new URL("http://localhost:4444/wd/hub");
		
		driver = new RemoteWebDriver(url, cap);
		
		logger.info("Gosho was here");
	}

	@When("^I open Google website$")
	public void goToGoogle() {
		driver.get("https://www.google.bg");
		logger.warn("Spas was here");
	}
	
	@Then("^Login button should exits$")
	public void loginButton() {
		if (driver.findElement(By.name("btnK")).isEnabled()) {
			System.out.println("Test 1 Pass");
		} else {
			System.out.println("Test 1 Fail");
		}
		logger.error("Harry was here");
		driver.quit();
	}
}

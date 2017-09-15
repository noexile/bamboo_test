package cucumber.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class CucumberJava {
	WebDriver driver = null;

	@Given("^I have open the browser$")
	public void openBrowser() throws MalformedURLException {
//		FirefoxDriverManager.getInstance().setup();
		ChromeDriverManager.getInstance().setup();

//		System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver//geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver.exe");
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
//		DesiredCapabilities cap = DesiredCapabilities.firefox();

//		cap.setPlatform(Platform.ANY);
		
//		URL url=new URL("http://192.168.2.168:4444/wd/hub");
		URL url=new URL("http://localhost:4444/wd/hub");
		
		driver = new RemoteWebDriver(url, cap);
	}

	@When("^I open Google website$")
	public void goToGoogle() {
		driver.get("https://www.google.bg");
	}
	
	@Then("^Login button should exits$")
	public void loginButton() {
		if (driver.findElement(By.name("btnK")).isEnabled()) {
			System.out.println("Test 1 Pass");
		} else {
			System.out.println("Test 1 Fail");
		}
		driver.quit();
	}
}

package Demo_Jenkins;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Selenium_Docker {

	@Test
	public void gridChrome() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		System.out.println("running in docker container chrome");
		cap.setBrowserName("chrome");
		cap.setCapability("version", "");
		cap.setPlatform(Platform.LINUX);
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.99.100:4446/wd/hub"), cap);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test
	public void gridFirefox() throws MalformedURLException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhishek\\Downloads\\geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		System.out.println("running in docker container firefox");
		cap.setBrowserName("firefox");
		cap.setCapability("version", "");
		cap.setPlatform(Platform.LINUX);
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.99.100:4446/wd/hub"), cap);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}

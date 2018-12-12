package Demo_Jenkins;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumReadPropFile {

	static WebDriver driver;

	@Test
	public void readProp() throws FileNotFoundException, IOException {
		Properties config = new Properties();
		FileInputStream configFile = new FileInputStream(
				"C:\\Users\\Abhishek\\eclipse-workspace\\Jenkins_Selenium\\Resources\\config.properties");
		config.load(configFile);

		String browser = config.getProperty("browserName");
		String url = config.getProperty("url");

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhishek\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.quit();

	}
}

package Demo_Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class SeleniumHtmlUnitBrowserConcept {

	@Test
	public void headlessBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		// WebDriver chromedriver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		driver.navigate().to("https://www.freecrm.com/index.html");
		String title = driver.getTitle();
		System.out.println("The title of browser is " + title);
		
	}
}

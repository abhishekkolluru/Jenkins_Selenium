package Demo_Jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumJavaScriptExecutor {

	@Test
	public void javaScriptExecutor() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.manage().window().maximize();

		chromedriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		chromedriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		chromedriver.navigate().to("https://www.freecrm.com/index.html");
		chromedriver.findElement(By.name("username")).sendKeys("abhishekkolluru");
		chromedriver.findElement(By.name("password")).sendKeys("Test@123");

		WebElement loginButton = chromedriver
				.findElement(By.xpath("//input[@type='submit' and @class='btn btn-small']"));
		JavascriptExecutor js = ((JavascriptExecutor) chromedriver);
		js.executeScript("arguments[0].click()", loginButton);

		chromedriver.switchTo().frame("mainpanel");
		chromedriver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		chromedriver.quit();

	}
}

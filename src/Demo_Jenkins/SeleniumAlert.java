package Demo_Jenkins;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumAlert {
	@Test
	public void alertMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.manage().window().maximize();
		String url = "https://www.rediff.com";
		chromedriver.navigate().to(url);
		chromedriver.findElement(By.partialLinkText("Sign in")).click();
		chromedriver.findElement(By.xpath("//input[@name='proceed']")).click();
		Alert alert = chromedriver.switchTo().alert();
		String message = alert.getText();
		System.out.println(message);
		alert.accept();
		WebDriverWait wait = new WebDriverWait(chromedriver, 5);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		element.sendKeys("abhishek");
		chromedriver.findElement(By.xpath("//input[@name='proceed']")).click();
		alert.accept();
		chromedriver.quit();
	}
}

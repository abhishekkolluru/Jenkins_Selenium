package Demo_Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class DemoJenkinsJob {

	@Test
	public void Jenkins() throws Exception {

		System.out.println("Hello world");
		System.out.println("Welcome to the jenkins and selenium integration from github repository");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.usaa.com");
		driver.findElement(By.xpath("//span[contains(text(),'Products')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Auto Insurance')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Get a Free')]")).click();
		System.out.println("Thank you");
		Thread.sleep(6000);
		driver.quit();
	}
	@Test
	public void Jenkins_1() throws Exception {
		System.out.println("Test2");
		System.out.println("Hello world");
		System.out.println("Welcome to the jenkins and selenium integration from github repository");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.usaa.com");
		driver.findElement(By.xpath("//span[contains(text(),'Products')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Auto Insurance')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Get a Free')]")).click();
		System.out.println("Thank you");
		Thread.sleep(5000);
		driver.quit();
	}
}
	

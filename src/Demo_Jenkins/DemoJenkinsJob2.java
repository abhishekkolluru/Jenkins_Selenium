package Demo_Jenkins;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class DemoJenkinsJob2 {
	
	@Test
	public void testJenkins() throws Exception {
		
		System.out.println("Welcome to the jenkins");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jenkins");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(6000);
		driver.quit();
	}
	@Test
	public void Jenkins() throws Exception {
		/*System.out.println("Hello world");
		System.out.println("Welcome to the jenkins and selenium integration from github repository");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("https://www.usaa.com");
		cdriver.findElement(By.xpath("//span[contains(text(),'Products')]")).click();
		cdriver.findElement(By.xpath("//a[contains(text(),'Auto Insurance')]")).click();
		cdriver.findElement(By.xpath("//a[contains(text(),'Get a Free')]")).click();
		System.out.println("Thank you");
		Thread.sleep(6000);
		cdriver.quit();*/
		System.out.println("Welcome to the jenkins");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhishek\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jenkins");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(6000);
		driver.quit();
	}
	@Test
	public void JenkinsEdge() throws Exception {
		/*System.out.println("Hello world");
		System.out.println("Welcome to the jenkins and selenium integration from github repository");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("https://www.usaa.com");
		cdriver.findElement(By.xpath("//span[contains(text(),'Products')]")).click();
		cdriver.findElement(By.xpath("//a[contains(text(),'Auto Insurance')]")).click();
		cdriver.findElement(By.xpath("//a[contains(text(),'Get a Free')]")).click();
		System.out.println("Thank you");
		Thread.sleep(6000);
		cdriver.quit();*/
		System.out.println("Welcome to the jenkins");
		System.setProperty("webdriver.edge.driver","C:\\Users\\Abhishek\\Downloads\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jenkins");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(6000);
		driver.quit();
	}

}

package Demo_Jenkins;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DemoJenkinsJob2 {
	
	@Test
	public void testJenkins() throws Exception {
		
		System.out.println("Welcome to the jenkins");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com")
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("auto insurance");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(6000);
		driver.quit();
	}

}

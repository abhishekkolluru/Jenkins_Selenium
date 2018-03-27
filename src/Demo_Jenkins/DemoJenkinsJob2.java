package Demo_Jenkins;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DemoJenkinsJob2 {
	
	@Test
	public void testJenkins(){
		
		System.out.println("Welcome to the jenkins");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.google.com");
		driver.close();
	}

}

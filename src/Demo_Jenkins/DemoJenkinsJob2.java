package Demo_Jenkins;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoJenkinsJob2 {
	String filename = System.getProperty("user.dir") + "/test-output/HtmlTestResults.html";
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;

	@BeforeTest
	public void startReport() {
		htmlReporter = new ExtentHtmlReporter(filename);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setReportName("Automation Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
	}

	@Test
	public void testJenkins() throws Exception {
		System.out.println("Welcome to the jenkins");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jenkins");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(2000);
		logger = extent.createTest("testJenkins");
		Assert.assertTrue(true);
		logger.log(Status.PASS, "Test Case Passed is testJenkins");
		driver.quit();
	}

	/*
	 * @Test public void testJenkins2() throws Exception {
	 * System.out.println("Welcome to the jenkins");
	 * System.setProperty("webdriver.gecko.driver",
	 * "C:\\Users\\Abhishek\\Downloads\\geckodriver.exe"); WebDriver driver = new
	 * FirefoxDriver(); driver.manage().window().maximize();
	 * driver.get("http:www.google.com");
	 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jenkins");
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	 * Thread.sleep(6000); logger = extent.startTest("testJenkins2");
	 * Assert.assertTrue(true); logger.log(LogStatus.PASS,
	 * "Test Case Passed is testJenkins2"); driver.quit(); }
	 */

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, "Test Case Failed is " + result.getName());
			logger.log(Status.FAIL, "Test Case Failed is " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP, "Test Case Skipped is " + result.getName());
		}
	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}

}

package Demo_Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoJenkinsJob extends DemoJenkinsJob2{

	/*String filename = System.getProperty("user.dir") + "/test-output/HtmlTestResults1.html";
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;

	@BeforeTest
	public void startReport() {
		htmlReporter = new ExtentHtmlReporter(filename);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setDocumentTitle("Final Report");
		htmlReporter.config().setReportName("Automation Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
	}
*/
	@Test
	public void Jenkins() throws Exception {

		System.out.println("Hello world");
		System.out.println("Welcome to the jenkins and selenium integration from github repository");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhishek\\Downloads\\geckodriver.exe");
		WebDriver firefoxdriver = new FirefoxDriver();
		firefoxdriver.manage().window().maximize();
		firefoxdriver.manage().window().maximize();
		firefoxdriver.get("https://www.usaa.com");
		firefoxdriver.findElement(By.xpath("//span[contains(text(),'Products')]")).click();
		firefoxdriver.findElement(By.xpath("//a[contains(text(),'Auto Insurance')]")).click();
		firefoxdriver.findElement(By.xpath("//a[contains(text(),'Get a Free')]")).click();
		System.out.println("Thank you");
		Thread.sleep(6000);
		logger = extent.createTest("Jenkins");
		Assert.assertTrue(true);
		logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is testJenkins2", ExtentColor.BLUE));
		firefoxdriver.quit();

		/*
		 * System.out.println("Welcome to the jenkins");
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\Abhishek\\Downloads\\geckodriver.exe"); WebDriver driver = new
		 * FirefoxDriver(); driver.manage().window().maximize();
		 * driver.get("http:www.google.com");
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jenkins");
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		 * Thread.sleep(6000); driver.quit();
		 */
	}

	@Test
	public void Jenkins1() throws Exception {

		System.out.println("Hello world");
		System.out.println("Welcome to the jenkins and selenium integration from github repository");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.manage().window().maximize();
		chromedriver.get("https://www.usaa.com");
		chromedriver.findElement(By.xpath("//span[contains(text(),'Products')]")).click();
		chromedriver.findElement(By.xpath("//a[contains(text(),'Auto Insurance')]")).click();
		chromedriver.findElement(By.xpath("//a[contains(text(),'Get a Free')]")).click();
		System.out.println("Thank you");
		Thread.sleep(6000);
		logger = extent.createTest("Jenkins1");
		Assert.assertTrue(true);
		logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is testJenkins2", ExtentColor.BLUE));
		chromedriver.quit();

		/*
		 * System.out.println("Welcome to the jenkins");
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe"); WebDriver driver = new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http:www.google.com");
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jenkins");
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		 * Thread.sleep(6000); driver.quit();
		 */
	}

	@Test
	public void JenkinsEdge() throws Exception {

		/*
		 * System.out.println("Hello world"); System.out.
		 * println("Welcome to the jenkins and selenium integration from github repository"
		 * ); System.setProperty("webdriver.edge.driver",
		 * "C:\\Users\\Abhishek\\Downloads\\MicrosoftWebDriver.exe"); WebDriver
		 * edgedriver = new EdgeDriver(); edgedriver.manage().window().maximize();
		 * edgedriver.get("https://www.usaa.com");
		 * edgedriver.findElement(By.xpath("//span[contains(text(),'Products')]")).click
		 * ();
		 * edgedriver.findElement(By.xpath("//a[contains(text(),'Auto Insurance')]")).
		 * click();
		 * edgedriver.findElement(By.xpath("//a[contains(text(),'Get a Free')]")).click(
		 * ); System.out.println("Thank you"); Thread.sleep(6000); logger =
		 * extent.createTest("JenkinsEdge"); Assert.assertTrue(true);
		 * logger.log(Status.PASS,
		 * MarkupHelper.createLabel("Test Case Passed is testJenkins2",
		 * ExtentColor.BLUE)); edgedriver.quit();
		 */

		/*
		 * System.out.println("Welcome to the jenkins");
		 * System.setProperty("webdriver.edge.driver",
		 * "C:\\Users\\Abhishek\\Downloads\\MicrosoftWebDriver.exe"); WebDriver driver =
		 * new EdgeDriver(); driver.manage().window().maximize();
		 * driver.get("http:www.google.com");
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jenkins");
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		 * Thread.sleep(6000); driver.quit();
		 */
	}

	/*@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		}
	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}*/

}

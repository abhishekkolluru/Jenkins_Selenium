package Demo_Jenkins;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumReadDataXMLFile {

	@Test
	public void XMLReader() throws DocumentException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Reading XML File
		File inputFile = new File(System.getProperty("user.dir") + "\\Resources" + "\\config.xml");
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(inputFile);
		String url = document.selectSingleNode("//webpage/url").getText();
		String SearchTextBox = document.selectSingleNode("//webpage/searchbox").getText();
		String searchText = document.selectSingleNode("//webpage/searchtext").getText();
		String clickSearchButton = document.selectSingleNode("//webpage/searchbutton").getText();

		driver.get(url);
		driver.findElement(By.xpath(SearchTextBox)).sendKeys(searchText);
		Thread.sleep(2000);
		driver.findElement(By.xpath(clickSearchButton)).click();
		driver.quit();
		
	}
}

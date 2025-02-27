package org.xyz.bases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.xyz.test.pages.AddCustomers;
import org.xyz.test.pages.XyZBankManagerPage;
import org.xyz.test.pages.XyZHomePage;

public class XyZBase {
	public Properties properties;
	public FileInputStream fileInputStream;
	public WebDriver driver;
	public XyZHomePage homePage;
	public XyZBankManagerPage bankManagerPage;
	public AddCustomers addCustomers;
	@BeforeTest
	public WebDriver getDetails() throws IOException {
		properties = new Properties();
		fileInputStream = new FileInputStream("C:\\Users\\kakar\\git\\repository4\\XYZBank\\src\\test\\java\\properties\\bank.properties");
		properties.load(fileInputStream);
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("browser"));
		if (properties.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(properties.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.manage().window().maximize();
		}
		else if(properties.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(properties.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.manage().window().maximize();
		}
		else {
			driver = new EdgeDriver();
			driver.get(properties.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.manage().window().maximize();
		}
		homePage = new XyZHomePage(driver);
		bankManagerPage = new XyZBankManagerPage(driver);
		addCustomers = new AddCustomers(driver);
		return driver;
	}
	
}

package com.banking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.banking.utilities.ReadConfig;

public class BaseClass {

	ReadConfig rd = new ReadConfig();

	public String baseURl = rd.getApplicationURL();
	public String username = rd.getUsername();
	public String password = rd.getPassword();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)

	{

		logger = logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (br.equals("firefox"))

		{

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get(baseURl);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown()

	{
		driver.quit();

	}

}

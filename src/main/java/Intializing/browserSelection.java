package Intializing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserSelection {

	Properties prop = new Properties();
	public WebDriver driver;

	public WebDriver intializeBrowser() throws IOException {

		FileInputStream fis = new FileInputStream(
				"/home/parinder/eclipse-workspace/Testing_Projects/LiveAutomationProject_Guru99_Bank/src/test/java/IntegrationPlanning_Guru99_Bank/DataDriven_IntegrationPlanning.properties");
		prop.load(fis);
		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
			driver = new FirefoxDriver();

		} else if (BrowserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/home/parinder/Downloads/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();

		} else if (BrowserName.equals("IE")) {

			System.out.println("Not Installed");
			System.exit(0);
		} else if (BrowserName.equals(null) || (BrowserName.isEmpty())) {
			System.out.println("Please Write Browser name (chrome / firefox / IE) in Data driven file.");
			System.exit(0);
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;

	}

}

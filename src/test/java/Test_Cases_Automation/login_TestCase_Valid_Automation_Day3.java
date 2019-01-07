package Test_Cases_Automation;

import org.testng.annotations.Test;
import Object_Repository_Guru99_Bank.login_Page;
import junit.framework.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class login_TestCase_Valid_Automation_Day3 {
	public WebDriver driver;
	Properties prop = new Properties();

	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FileInputStream fis = new FileInputStream(
				"/home/parinder/eclipse-workspace/Testing_Projects/LiveAutomationProject_Guru99_Bank/src/test/java/Test_Cases_Automation/DataDriven.properties");
		prop.load(fis);
		driver = new FirefoxDriver();
		driver.get(prop.getProperty("host"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	/*
	 * Test Script 03 ************** This method will perform following Test Steps
	 * 
	 * 1) Go to http://www.demo.guru99.com/V4/ 
	 * 2) Enter valid UserId 
	 * 3) Enter valid Password
	 * 4) Click Login 
	 * 5) Verify the Output
	 */

	@Test
	public void loginInValidUvalidP() {
		login_Page Lobj = new login_Page(driver);
		Lobj.usrid().sendKeys(prop.getProperty("userInvalid"));
		Lobj.pass().sendKeys(prop.getProperty("passValid"));
		Lobj.loginButton().click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

	@Test(dependsOnMethods = { "loginInValidUvalidP" })
	public void loginValidUInvalidP() {
		login_Page Lobj = new login_Page(driver);
		Lobj.usrid().sendKeys(prop.getProperty("userValid"));
		Lobj.pass().sendKeys(prop.getProperty("passInvalid"));
		Lobj.loginButton().click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

	@Test(dependsOnMethods = { "loginValidUInvalidP" })
	public void loginInValidUP() {
		login_Page Lobj = new login_Page(driver);
		Lobj.usrid().sendKeys(prop.getProperty("userInvalid"));
		Lobj.pass().sendKeys(prop.getProperty("passInvalid"));
		Lobj.loginButton().click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

	@Test(dependsOnMethods = { "loginInValidUP" })
	public void loginValidUP() {
		login_Page Lobj = new login_Page(driver);
		Lobj.usrid().sendKeys(prop.getProperty("userValid"));
		Lobj.pass().sendKeys(prop.getProperty("passValid"));
		Lobj.loginButton().click();
		String currenttitle = driver.getTitle();
		String Actualtitle = "Guru99 Bank Manager HomePage";
		Assert.assertEquals(currenttitle, Actualtitle);
	}
}

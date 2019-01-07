package Test_Case_New_Account;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Object_Repository_Guru99_Bank.New_Account;
import Test_Case_Login.login_TestCase_Valid_Day1;


public class customer_id {

	public WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		this.driver = new FirefoxDriver();
		this.driver.get("http://www.demo.guru99.com/V4/");
	}

	@Test
	public void custIDblank() {
		login_TestCase_Valid_Day1 lobj = new login_TestCase_Valid_Day1(driver);
		lobj.login();

		New_Account Aobj = new New_Account(driver);
		Aobj.LinkNewAccount().click();
		Aobj.CustomerID().sendKeys("");
		Aobj.CustomerID().sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.id("message14")).getText());
		Aobj.resetClick().click();

	}

	@Test(dependsOnMethods = { "custIDblank" })
	public void custIDspecialChar() {
		
		New_Account Aobj = new New_Account(driver);
		Aobj.LinkNewAccount().click();
		Aobj.CustomerID().sendKeys("$");
		Aobj.CustomerID().sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.id("message14")).getText());
		Aobj.resetClick().click();

	}

	@Test(dependsOnMethods = { "custIDspecialChar" })
	public void custIDfirstSpace() {

		New_Account Aobj = new New_Account(driver);
		Aobj.LinkNewAccount().click();
		Aobj.CustomerID().sendKeys(" ");
		Aobj.CustomerID().sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.id("message14")).getText());
		Aobj.resetClick().click();

	}

	@Test(dependsOnMethods = { "custIDfirstSpace" })
	public void custIDCharactersOnly() {

		New_Account Aobj = new New_Account(driver);
		Aobj.LinkNewAccount().click();
		Aobj.CustomerID().sendKeys("abcd");
		Aobj.CustomerID().sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.id("message14")).getText());
		Aobj.resetClick().click();

	}

	@Test(dependsOnMethods = { "custIDCharactersOnly" })
	public void custIDSpaceBetween() {
		
		New_Account Aobj = new New_Account(driver);
		Aobj.LinkNewAccount().click();
		Aobj.CustomerID().sendKeys("123 56");
		Aobj.CustomerID().sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.id("message14")).getText());
		Aobj.resetClick().click();

	}

	@Test(dependsOnMethods = { "custIDSpaceBetween" })
	public void custIDValid() {

		New_Account Aobj = new New_Account(driver);
		Aobj.LinkNewAccount().click();
		Aobj.CustomerID().sendKeys("123456");

	}

}

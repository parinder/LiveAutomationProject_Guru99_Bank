package Test_Case_Edit_Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object_Repository_Guru99_Bank.Edit_Customer;
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

		Edit_Customer eobj = new Edit_Customer(driver);
		eobj.EditCustomerLink().click();
		eobj.CustomerID().sendKeys("");
		eobj.CustomerID().sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.id("message14")).getText());
		eobj.reset().click();

	}

	@Test(dependsOnMethods = { "custIDblank" })
	public void custIDspecialChar() {

		Edit_Customer eobj = new Edit_Customer(driver);
		eobj.EditCustomerLink().click();
		eobj.CustomerID().sendKeys("$");
		eobj.CustomerID().sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.id("message14")).getText());
		eobj.reset().click();

	}

	@Test(dependsOnMethods = { "custIDspecialChar" })
	public void custIDfirstSpace() {

		Edit_Customer eobj = new Edit_Customer(driver);
		eobj.EditCustomerLink().click();
		eobj.CustomerID().sendKeys(" ");
		eobj.CustomerID().sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.id("message14")).getText());
		eobj.reset().click();

	}

	@Test(dependsOnMethods = { "custIDfirstSpace" })
	public void custIDCharactersOnly() {

		Edit_Customer eobj = new Edit_Customer(driver);
		eobj.EditCustomerLink().click();
		eobj.CustomerID().sendKeys("abcd");
		eobj.CustomerID().sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.id("message14")).getText());
		eobj.reset().click();

	}

	@Test(dependsOnMethods = { "custIDCharactersOnly" })
	public void custIDSpaceBetween() {

		Edit_Customer eobj = new Edit_Customer(driver);
		eobj.EditCustomerLink().click();
		eobj.CustomerID().sendKeys("123 45");
		eobj.CustomerID().sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.id("message14")).getText());
		eobj.reset().click();

	}

	@Test(dependsOnMethods = { "custIDSpaceBetween" })
	public void custIDValid() {

		Edit_Customer eobj = new Edit_Customer(driver);
		eobj.EditCustomerLink().click();
		eobj.CustomerID().sendKeys("12345");

	}

}

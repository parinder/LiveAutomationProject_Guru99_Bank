package Test_Case_New_Account;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Object_Repository_Guru99_Bank.New_Account;
import Test_Case_Login.login_TestCase_Valid_Day1;


public class Intial_deposit {

	public WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		this.driver = new FirefoxDriver();
		this.driver.get("http://www.demo.guru99.com/V4/");
	}

	@Test
	public void Intialdepblank() {
		login_TestCase_Valid_Day1 lobj = new login_TestCase_Valid_Day1(driver);
		lobj.login();
		
		New_Account Aobj = new New_Account(driver);
		Aobj.LinkNewAccount().click();
		Aobj.IntialDeposit().sendKeys("");
		Aobj.IntialDeposit().sendKeys(Keys.TAB);
		Aobj.resetClick().click();
		
	}

	@Test(dependsOnMethods = { "Intialdepblank" })
	public void IntialdepspecialChar() {

		New_Account Aobj = new New_Account(driver);
		Aobj.LinkNewAccount().click();
		Aobj.IntialDeposit().sendKeys("$");
		Aobj.IntialDeposit().sendKeys(Keys.TAB);
		Aobj.resetClick().click();

	}

	@Test(dependsOnMethods = { "IntialdepspecialChar" })
	public void IntialdepfirstSpace() {

		New_Account Aobj = new New_Account(driver);
		Aobj.LinkNewAccount().click();
		Aobj.IntialDeposit().sendKeys(" ");
		Aobj.IntialDeposit().sendKeys(Keys.TAB);
		Aobj.resetClick().click();

	}

	@Test(dependsOnMethods = { "IntialdepfirstSpace" })
	public void IntialdepCharactersOnly() {

		New_Account Aobj = new New_Account(driver);
		Aobj.LinkNewAccount().click();
		Aobj.IntialDeposit().sendKeys("abcd");
		Aobj.IntialDeposit().sendKeys(Keys.TAB);
		Aobj.resetClick().click();

	}

	@Test(dependsOnMethods = { "IntialdepCharactersOnly" })
	public void IntialdepSpaceBetween() {

		New_Account Aobj = new New_Account(driver);
		Aobj.LinkNewAccount().click();
		Aobj.IntialDeposit().sendKeys("123 56");
		Aobj.IntialDeposit().sendKeys(Keys.TAB);
		Aobj.resetClick().click();

	}

	@Test(dependsOnMethods = { "IntialdepSpaceBetween" })
	public void IntialdepValid() {

		New_Account Aobj = new New_Account(driver);
		Aobj.LinkNewAccount().click();
		Aobj.IntialDeposit().sendKeys("123456");

	}

}

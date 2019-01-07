package Test_Case_Login;

import org.testng.annotations.Test;
import Object_Repository_Guru99_Bank.login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class login_TestCase_Valid_Day1 {
    public static WebDriver driver;


    public login_TestCase_Valid_Day1(WebDriver driver2) {
    	this.driver=driver2;
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://www.demo.guru99.com/V4/");
    }

    @Test
    public void login() {
        login_Page Lobj = new login_Page(driver);
        Lobj.usrid().sendKeys("mngr170066");
        Lobj.pass().sendKeys("adepatu");
        Lobj.loginButton().click();
    }
}
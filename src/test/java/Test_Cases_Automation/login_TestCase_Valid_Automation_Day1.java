package Test_Cases_Automation;

import org.testng.annotations.Test;
import Object_Repository_Guru99_Bank.login_Page;
import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class login_TestCase_Valid_Automation_Day1 {
    public WebDriver driver;

    

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://www.demo.guru99.com/V4/");
    }

    @Test
    public void login() {
        login_Page Lobj = new login_Page(driver);
        Lobj.usrid().sendKeys("mngr166402");
        Lobj.pass().sendKeys("ajabyzU");
        Lobj.loginButton().click();
        
    }
}
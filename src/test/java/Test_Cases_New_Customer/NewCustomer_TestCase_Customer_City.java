package Test_Cases_New_Customer;

import org.testng.annotations.Test;
import Object_Repository_Guru99_Bank.New_Customer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


public class NewCustomer_TestCase_Customer_City {
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
        this.driver = new FirefoxDriver();
        this.driver.get("http://www.demo.guru99.com/V4/");
    }

    @Test
    public void nameFieldValid() {
        Test_Case_Login.login_TestCase_Valid_Day1 loginobj = new Test_Case_Login.login_TestCase_Valid_Day1(driver);
        loginobj.login();
        New_Customer Cobj = new New_Customer(driver);
        Cobj.NewCustomerLink().click();
        Cobj.CustomerCity().sendKeys(new CharSequence[]{"Halifax"});
        Cobj.ResetKey().click();
    }

    @Test(dependsOnMethods={"nameFieldValid"})
    public void nameFieldInValid() {
        New_Customer Cobj = new New_Customer(this.driver);
        Cobj.CustomerCity().sendKeys(new CharSequence[]{"Halifax1234"});
        System.out.println(this.driver.findElement(By.id((String)"message4")).getText());
    }
}

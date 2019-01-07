package Test_Cases_New_Customer;

import org.testng.annotations.Test;
import Object_Repository_Guru99_Bank.New_Customer;
import Test_Case_Login.login_TestCase_Valid_Day1;

import java.io.PrintStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewCustomer_TestCase_Customer_Name {
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
        this.driver = new FirefoxDriver();
        this.driver.get("http://www.demo.guru99.com/V4/");
    }

    @Test
    public void nameFieldValid() {
        login_TestCase_Valid_Day1 loginobj = new login_TestCase_Valid_Day1(this.driver);
        loginobj.login();
        New_Customer Cobj = new New_Customer(this.driver);
        Cobj.NewCustomerLink().click();
        Cobj.CustomerName().sendKeys(new CharSequence[]{"Parinder"});
        Cobj.ResetKey().click();
    }

    @Test(dependsOnMethods={"nameFieldValid"})
    public void nameFieldInValid() {
        New_Customer Cobj = new New_Customer(this.driver);
        Cobj.CustomerName().sendKeys(new CharSequence[]{"Parinder1234"});
        System.out.println(this.driver.findElement(By.id((String)"message")).getText());
    }
}
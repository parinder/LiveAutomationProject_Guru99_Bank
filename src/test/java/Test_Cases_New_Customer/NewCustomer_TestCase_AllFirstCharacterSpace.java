package Test_Cases_New_Customer;

import org.testng.annotations.Test;
import Object_Repository_Guru99_Bank.New_Customer;
import Object_Repository_Guru99_Bank.login_Page;
import java.io.PrintStream;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewCustomer_TestCase_AllFirstCharacterSpace {
    WebDriver driver;

    @Test
    public void allblankTest() {
        System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://www.demo.guru99.com/V4/");
        login_Page Lobj = new login_Page((WebDriver)driver);
        Lobj.usrid().sendKeys(new CharSequence[]{"mngr166402"});
        Lobj.pass().sendKeys(new CharSequence[]{"ajabyzU"});
        Lobj.loginButton().click();
        New_Customer Cobj = new New_Customer((WebDriver)driver);
        Cobj.NewCustomerLink().click();
        Cobj.CustomerName().sendKeys(new CharSequence[]{" "});
        Cobj.DateOfBirth().sendKeys(new CharSequence[]{Keys.TAB});
        Cobj.Address().sendKeys(new CharSequence[]{" "});
        Cobj.CustomerCity().sendKeys(new CharSequence[]{" "});
        Cobj.CustomerState().sendKeys(new CharSequence[]{" "});
        Cobj.CustomerPIN().sendKeys(new CharSequence[]{" "});
        Cobj.Contact().sendKeys(new CharSequence[]{" "});
        Cobj.Email().sendKeys(new CharSequence[]{" "});
        Cobj.SubmitKey().click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
}
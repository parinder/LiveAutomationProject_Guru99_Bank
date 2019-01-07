package Test_Cases_New_Customer;

import org.testng.annotations.Test;
import Object_Repository_Guru99_Bank.New_Customer;
import Object_Repository_Guru99_Bank.login_Page;
import java.io.PrintStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewCustomer_TestCase_AllValid {
    WebDriver driver;

    @Test
    public void allvalid() {
        System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://www.demo.guru99.com/V4/");
        login_Page Lobj = new login_Page((WebDriver)driver);
        Lobj.usrid().sendKeys(new CharSequence[]{"mngr166402"});
        Lobj.pass().sendKeys(new CharSequence[]{"ajabyzU"});
        Lobj.loginButton().click();
        New_Customer Cobj = new New_Customer((WebDriver)driver);
        Cobj.NewCustomerLink().click();
        Cobj.CustomerName().sendKeys(new CharSequence[]{"Parinder"});
        Cobj.Gender().click();
        Cobj.DateOfBirth().click();
        Cobj.DateOfBirth().sendKeys(new CharSequence[]{"1994-09-18"});
        Cobj.Address().sendKeys(new CharSequence[]{"0000 Nova Drive"});
        Cobj.CustomerCity().sendKeys(new CharSequence[]{"Halifax"});
        Cobj.CustomerState().sendKeys(new CharSequence[]{"Nova Scotia"});
        Cobj.CustomerPIN().sendKeys(new CharSequence[]{"184143"});
        Cobj.Contact().sendKeys(new CharSequence[]{"9029892305"});
        Cobj.Email().sendKeys(new CharSequence[]{"parindersingh@outlook.com"});
        Cobj.PassKey().sendKeys(new CharSequence[]{"password"});
        Cobj.SubmitKey().click();
        String CustomerID = driver.findElement(By.xpath((String)"/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]")).getText();
        System.out.println(CustomerID);
    }
}

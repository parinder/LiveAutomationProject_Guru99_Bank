package Object_Repository_Guru99_Bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Customer {
    public WebDriver driver;
   
    public New_Customer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements((WebDriver)driver, (Object)this);
    }
    @FindBy(linkText="New Customer")
    WebElement Customer_New;
    @FindBy(name="name")
    WebElement CustName;
    @FindBy(xpath="//input[@value='m']")
    WebElement sex;
    @FindBy(id="dob")
    WebElement DOB;
    @FindBy(name="addr")
    WebElement CustAddress;
    @FindBy(name="city")
    WebElement CustCity;
    @FindBy(name="state")
    WebElement CustState;
    @FindBy(name="pinno")
    WebElement CustPin;
    @FindBy(name="telephoneno")
    WebElement CustMobile;
    @FindBy(name="emailid")
    WebElement CustEmail;
    @FindBy(name="password")
    WebElement CustPassword;
    @FindBy(name="sub")
    WebElement SubmitButton;
    @FindBy(xpath="//input[@type='reset']")
    WebElement ResetButton;


    public WebElement NewCustomerLink() {
        return this.Customer_New;
    }

    public WebElement CustomerName() {
        return this.CustName;
    }

    public WebElement Gender() {
        return this.sex;
    }

    public WebElement DateOfBirth() {
        return this.DOB;
    }

    public WebElement Address() {
        return this.CustAddress;
    }

    public WebElement CustomerCity() {
        return this.CustCity;
    }

    public WebElement CustomerState() {
        return this.CustState;
    }

    public WebElement CustomerPIN() {
        return this.CustPin;
    }

    public WebElement Contact() {
        return this.CustMobile;
    }

    public WebElement Email() {
        return this.CustEmail;
    }

    public WebElement PassKey() {
        return this.CustPassword;
    }

    public WebElement SubmitKey() {
        return this.SubmitButton;
    }

    public WebElement ResetKey() {
        return this.ResetButton;
    }
}
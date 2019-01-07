package Object_Repository_Guru99_Bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_Customer {
	public WebDriver driver;

	public Delete_Customer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements((WebDriver) driver, (Object) this);
	}

	@FindBy(linkText = "Delete Customer")
	WebElement Customer_Delete;

	@FindBy(name = "cusid")
	WebElement CustId;

	@FindBy(name = "AccSubmit")
	WebElement SubmitClick;

	@FindBy(name = "res")
	WebElement restetClick;

	public WebElement DeleteCustomerLink() {
		return this.Customer_Delete;
	}

	public WebElement CustomerID() {
		return this.CustId;
	}

	public WebElement submit() {
		return this.SubmitClick;
	}

	public WebElement reset() {
		return this.restetClick;
	}

}
package Object_Repository_Guru99_Bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_Customer {
	public WebDriver driver;

	public Edit_Customer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Edit Customer")
	WebElement Customer_Edit;

	@FindBy(name = "cusid")
	WebElement CustId;

	@FindBy(name = "AccSubmit")
	WebElement SubmitClick;

	@FindBy(name = "res")
	WebElement restetClick;

	public WebElement EditCustomerLink() {
		return this.Customer_Edit;
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
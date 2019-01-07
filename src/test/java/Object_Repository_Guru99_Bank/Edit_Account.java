package Object_Repository_Guru99_Bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_Account {
	public WebDriver driver;

	public Edit_Account(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements((WebDriver) driver, (Object) this);
	}

	@FindBy(linkText = "Edit Account")
	WebElement Account_Edit;

	@FindBy(name = "accountno")
	WebElement AccountNum;

	@FindBy(name = "AccSubmit")
	WebElement SubmitClick;

	@FindBy(name = "res")
	WebElement restetClick;

	public WebElement EditAccountLink() {
		return this.Account_Edit;
	}

	public WebElement AccountNumber() {
		return this.AccountNum;
	}

	public WebElement submit() {
		return this.SubmitClick;
	}

	public WebElement reset() {
		return this.restetClick;
	}

}
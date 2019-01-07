package Object_Repository_Guru99_Bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mini_Statement {
	public WebDriver driver;

	public Mini_Statement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements((WebDriver) driver, (Object) this);
	}

	@FindBy(linkText = "Mini Statement")
	WebElement statement;

	@FindBy(name = "accountno")
	WebElement AccountNum;

	@FindBy(name = "AccSubmit")
	WebElement SubmitClick;

	@FindBy(name = "res")
	WebElement restetClick;

	public WebElement MiniStatementLink() {
		return this.statement;
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
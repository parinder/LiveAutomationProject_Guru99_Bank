package Object_Repository_Guru99_Bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customized_Statement {
	public WebDriver driver;

	public Customized_Statement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements((WebDriver) driver, (Object) this);
	}

	@FindBy(linkText = "Customised Statement")
	WebElement customStatement;

	@FindBy(name = "accountno")
	WebElement AccountNum;

	@FindBy(name = "fdate")
	WebElement fromDate;

	@FindBy(name = "tdate")
	WebElement toDate;

	@FindBy(name = "amountlowerlimit")
	WebElement minTransaction;

	@FindBy(name = "numtransaction")
	WebElement NumTrans;

	@FindBy(name = "AccSubmit")
	WebElement SubmitClick;

	@FindBy(name = "res")
	WebElement restetClick;

	public WebElement customizedStatementLink() {
		return this.customStatement;
	}

	public WebElement AccountNumber() {
		return this.AccountNum;
	}

	public WebElement dateFrom() {
		return this.fromDate;
	}

	public WebElement dateTo() {
		return this.toDate;
	}

	public WebElement minimumTransactionValue() {
		return this.minTransaction;
	}

	public WebElement NumberofTransaction() {
		return this.NumTrans;
	}

	public WebElement submit() {
		return this.SubmitClick;
	}

	public WebElement reset() {
		return this.restetClick;
	}

}
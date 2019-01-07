package Object_Repository_Guru99_Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class New_Account {
	public WebDriver driver;

	public New_Account(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements((WebDriver) driver, (Object) this);
	}

	@FindBy(linkText = "New Account")
	WebElement linkNewAcc;

	@FindBy(name = "cusid")
	WebElement CustId;

	@FindBy(name = "selaccount")
	WebElement Select;

	@FindBy(name = "inideposit")
	WebElement IntDeposit;
	
	@FindBy(xpath="//input[@type='reset']")
    WebElement ResetButton;
	
	@FindBy(name="sub")
    WebElement SubmitButton;

	public WebElement LinkNewAccount() {
		return this.linkNewAcc;
	}

	public WebElement CustomerID() {
		return this.CustId;
	}

	public WebElement select_list() {
		Select type = new Select(driver.findElement(By.name("selaccount")));
		return (WebElement) type.getOptions().get(0);
	}

	public WebElement IntialDeposit() {
		return this.IntDeposit;
	}
	
	public WebElement resetClick() {
		return this.ResetButton;
	}
	
	public WebElement subClick() {
		return this.SubmitButton;
	}
}
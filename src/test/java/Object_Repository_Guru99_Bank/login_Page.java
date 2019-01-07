package Object_Repository_Guru99_Bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Page {
	public WebDriver driver;

	public login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "uid")
	WebElement userID;
	@FindBy(name = "password")
	WebElement passWORD;
	@FindBy(name = "btnLogin")
	WebElement Login;

	public WebElement usrid() {
		return userID;
	}

	public WebElement pass() {
		return passWORD;
	}

	public WebElement loginButton() {
		return Login;
	}
}
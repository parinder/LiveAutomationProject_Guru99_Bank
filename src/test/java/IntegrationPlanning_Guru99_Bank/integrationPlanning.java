package IntegrationPlanning_Guru99_Bank;

import org.testng.annotations.Test;

import Intializing.browserSelection;

import org.testng.AssertJUnit;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import Object_Repository_Guru99_Bank.Customized_Statement;
import Object_Repository_Guru99_Bank.Delete_Account;
import Object_Repository_Guru99_Bank.Delete_Customer;
import Object_Repository_Guru99_Bank.Edit_Account;
import Object_Repository_Guru99_Bank.Edit_Customer;
import Object_Repository_Guru99_Bank.Mini_Statement;
import Object_Repository_Guru99_Bank.New_Account;
import Object_Repository_Guru99_Bank.New_Customer;
import Test_Case_Login.login_TestCase_Valid_Day1;

public class integrationPlanning extends browserSelection {
	

	@Test(priority = 0)
	public void setup() throws IOException {
		
		driver= intializeBrowser();
		driver.get("http://www.demo.guru99.com/V4/index.php");

	}

/*
	@Test(priority = 1)
	public String createNewCustomer() {

		login_TestCase_Valid_Day1 lobj = new login_TestCase_Valid_Day1(driver);
		lobj.login();
		String actualLoginMsg = driver.findElement(By.xpath("//tbody/tr[3]/td[1]")).getText();
		System.out.println(actualLoginMsg);
		AssertJUnit.assertEquals(prop.getProperty("WelcomeMsg"), actualLoginMsg);

		New_Customer nobj = new New_Customer(driver);
		nobj.NewCustomerLink().click();
		nobj.CustomerName().sendKeys(prop.getProperty("Name"));
		nobj.Gender().click();
		nobj.DateOfBirth().click();
		nobj.DateOfBirth().sendKeys(prop.getProperty("DOB"));
		nobj.Address().sendKeys(prop.getProperty("Address"));
		nobj.CustomerCity().sendKeys(prop.getProperty("City"));
		nobj.CustomerState().sendKeys(prop.getProperty("State"));
		nobj.CustomerPIN().sendKeys(prop.getProperty("PIN"));
		nobj.Contact().sendKeys(prop.getProperty("Telephone"));
		nobj.Email().sendKeys(prop.getProperty("Email"));
		nobj.PassKey().sendKeys(prop.getProperty("Password"));
		nobj.SubmitKey().click();
		String CustomerID = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]"))
				.getText();
		System.out.println("CustomerID is:" + CustomerID);
		driver.findElement(By.linkText("Home")).click();
		return CustomerID;
	}

	@Test(priority = 2)
	public void customerNotAddedTwice() {
		New_Customer nobj = new New_Customer(driver);
		nobj.NewCustomerLink().click();
		nobj.CustomerName().sendKeys(prop.getProperty("Name"));
		nobj.Gender().click();
		nobj.DateOfBirth().click();
		nobj.DateOfBirth().sendKeys(prop.getProperty("DOB"));
		nobj.Address().sendKeys(prop.getProperty("Address"));
		nobj.CustomerCity().sendKeys(prop.getProperty("City"));
		nobj.CustomerState().sendKeys(prop.getProperty("State"));
		nobj.CustomerPIN().sendKeys(prop.getProperty("PIN"));
		nobj.Contact().sendKeys(prop.getProperty("Telephone"));
		nobj.Email().sendKeys(prop.getProperty("Email"));
		nobj.PassKey().sendKeys(prop.getProperty("Password"));
		nobj.SubmitKey().click();
		String ExistingMsg = driver.switchTo().alert().getText();
		System.out.println(ExistingMsg);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

	}

	@Test(priority = 3)
	public void customerEdit() {

		Edit_Customer eobj = new Edit_Customer(driver);
		eobj.EditCustomerLink().click();
		eobj.CustomerID().sendKeys(createNewCustomer());
		eobj.submit().click();
		New_Customer neobj = new New_Customer(driver);
		neobj.Email().sendKeys(prop.getProperty("Updated_Email"));
		neobj.SubmitKey().click();
		String updateMsg = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p"))
				.getText();
		System.out.println(updateMsg);
		driver.findElement(By.linkText("Home")).click();

	}

	@Test(priority = 4)
	public void customerEditExistingEmail() {

		Edit_Customer eeobj = new Edit_Customer(driver);
		eeobj.EditCustomerLink().click();
		eeobj.CustomerID().sendKeys(prop.getProperty("OldCustomerID"));
		eeobj.submit().click();
		New_Customer neeobj = new New_Customer(driver);
		neeobj.Email().sendKeys(prop.getProperty("Updated_Email"));
		neeobj.SubmitKey().click();
		String UpdateMsgE = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p"))
				.getText();
		System.out.println(UpdateMsgE);
		String exp="Email Already Exists";
		AssertJUnit.assertNotSame(exp, UpdateMsgE,"It's not showing email already exist");
		driver.findElement(By.linkText("Home")).click();

	}
	

	@Test(priority = 5)
	public void customerIDNonExisting() {

		Edit_Customer enobj = new Edit_Customer(driver);
		enobj.EditCustomerLink().click();
		enobj.CustomerID().sendKeys(prop.getProperty("NonExistingCustomer_ID"));
		enobj.submit().click();
		String NonExistingMsg = driver.switchTo().alert().getText();
		System.out.println(NonExistingMsg);
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Home")).click();
	}

	@Test(priority = 6)
	public String newAccountAdd() {

		New_Account naObj = new New_Account(driver);
		naObj.LinkNewAccount().click();

		naObj.CustomerID().sendKeys(createNewCustomer());
		naObj.select_list().click();
		naObj.IntialDeposit().sendKeys(prop.getProperty("IntialDeposit"));
		naObj.subClick().click();
		String AccID = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]")).getText();
		System.out.println(AccID);
		String AccType = driver.findElement(By.xpath(
				"String AccID= driver.findElement(By.xpath(\"/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]\")).getText();"))
				.getText();
		System.out.println(AccType);
		driver.findElement(By.linkText("Home")).click();
		return AccID;

	}

	@Test(priority = 7)
	public void AccountIdExisting() {

		New_Account naObj = new New_Account(driver);
		naObj.LinkNewAccount().click();

		naObj.CustomerID().sendKeys(createNewCustomer());
		naObj.select_list().click();
		naObj.IntialDeposit().sendKeys(prop.getProperty("IntialDeposit"));
		naObj.subClick().click();
		String NewAccID = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]"))
				.getText();
		System.out.println(NewAccID);
		AssertJUnit.assertNotSame(newAccountAdd(), NewAccID);
		driver.findElement(By.linkText("Home")).click();
	}

	@Test(priority = 8)
	public void EditAccountType() {

		Edit_Account eaobj = new Edit_Account(driver);
		eaobj.EditAccountLink().click();

		eaobj.AccountNumber().sendKeys(newAccountAdd());
		eaobj.submit().click();
		Select s = new Select(driver.findElement(By.name("a_type")));
		s.selectByIndex(1);
		String AccTypeUpdate = driver.findElement(By.xpath(
				"String AccID= driver.findElement(By.xpath(\"/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]\")).getText();"))
				.getText();
		System.out.println(AccTypeUpdate);
		driver.findElement(By.linkText("Home")).click();
	}

	@Test(priority = 9)
	public void miniStatementTest() {

		Mini_Statement mobj = new Mini_Statement(driver);
		mobj.MiniStatementLink().click();

		mobj.AccountNumber().sendKeys(newAccountAdd());
		mobj.submit().click();
		String transID = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]"))
				.getText();
		System.out.println(transID);
		driver.findElement(By.linkText("Home")).click();
	}

	@Test(priority = 10)
	public void miniStatementTestNoNexistingAcc() {

		Mini_Statement mobj = new Mini_Statement(driver);
		mobj.MiniStatementLink().click();

		mobj.AccountNumber().sendKeys(prop.getProperty("NonExistingAccountNumber"));
		mobj.submit().click();
		String errMsg = driver.switchTo().alert().getText();
		System.out.println(errMsg);
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Home")).click();
	}

	@Test(priority = 11)
	public void CustomStatement() {

		Customized_Statement csobj = new Customized_Statement(driver);
		csobj.customizedStatementLink().click();
		csobj.AccountNumber().sendKeys(newAccountAdd());
		csobj.dateFrom().sendKeys("FromDate");
		csobj.dateFrom().sendKeys("ToDate");
		csobj.minimumTransactionValue().sendKeys("MinTransaction");
		csobj.NumberofTransaction().sendKeys("NumberOfTransactions");
		csobj.submit().click();
		String transIDCustom = driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td/table/tbody/tr[2]/td[1]"))
				.getText();
		System.out.println(transIDCustom);
		driver.findElement(By.linkText("Home")).click();
	}

	@Test(priority = 12)
	public void deleteAccount() {
		Delete_Account daobj = new Delete_Account(driver);
		daobj.DeleteAccountLink().click();

		daobj.AccountNumber().sendKeys(newAccountAdd());
		daobj.submit().click();
		driver.switchTo().alert().accept();
		String deleteAccMsg = driver.switchTo().alert().getText();
		System.out.println(deleteAccMsg);
		driver.switchTo().alert().accept();

		Mini_Statement mobj = new Mini_Statement(driver);
		mobj.MiniStatementLink().click();

		mobj.AccountNumber().sendKeys(newAccountAdd());
		String ConfMsg = driver.switchTo().alert().getText();
		System.out.println(ConfMsg);
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Home")).click();
	}

	@Test(priority = 13)
	public void deleteCustomer() {

		Delete_Customer dcobj = new Delete_Customer(driver);
		dcobj.DeleteCustomerLink().click();

		dcobj.CustomerID().sendKeys(createNewCustomer());
		dcobj.submit().click();
		driver.switchTo().alert().accept();
		String DelMsg = driver.switchTo().alert().getText();
		System.out.println(DelMsg);
		driver.switchTo().alert().accept();

	}*/

}


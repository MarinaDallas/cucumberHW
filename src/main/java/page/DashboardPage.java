package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage{
	
	WebDriver driver;
	
	 public DashboardPage(WebDriver driver) {
	  this.driver = driver;
	 }
	 
	 // Element library
	 
	 @FindBy(how = How.XPATH, using = "//span[text()='Bank & Cash']")
	 WebElement Bank_And_Cash;
	 
	 @FindBy(how = How.XPATH, using = "//a[text()='New Account']")
	 WebElement New_Account;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='account']")
	 WebElement Account_Title_Field;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='description']")
	 WebElement Description_Field;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='balance']")
	 WebElement Initial_Balance_Field;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	 WebElement Account_Number_Field;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	 WebElement Contact_Person_Field;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	 WebElement Phone_Number_Field;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	 WebElement Internet_BankingURL_Field;
	 
	 @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	 WebElement Submit_Button;
	 
	 
	 
// Interactive method
	
	 
	 public void clickonBankAndCashButton() {
		 waitForElement(driver,5, Bank_And_Cash);
		 Bank_And_Cash.click();
	 }
	 
	 public void clickonNewAccountButton() {
		 waitForElement(driver,5, New_Account);
		 New_Account.click();
	 }
	 
	 public void enterNewAccountInformations(String accountTitle, String description,String initialBalance, String accountNumber,String contactPerson, String  phone,String internetBankingUrl) {
		 
		 waitForElement(driver,5, Account_Title_Field);
		 Account_Title_Field.sendKeys(accountTitle + new Random().nextInt(999)); 
		 Description_Field.sendKeys(description); 
		 Initial_Balance_Field.sendKeys(initialBalance); 
		 Account_Number_Field.sendKeys(accountNumber);
		 Contact_Person_Field.sendKeys(contactPerson); 
		 Phone_Number_Field.sendKeys(phone); 
		 Internet_BankingURL_Field.sendKeys(internetBankingUrl); 
	 }
	 
	 public void clickOnSubmitButton() {
		 Submit_Button.click();
	 }
	 
	
	 

}

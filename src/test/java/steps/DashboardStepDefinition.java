
package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class DashboardStepDefinition {

	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;

	@Before
	public void beforeRun() {

		driver = BrowserFactory.startBrowser(); 
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}
	
	@Given("^User is on Techfios login page$")
	public void User_is_on_Techfios_login_page() throws InterruptedException {
		//driver = BrowserFactory.startBrowser();
 
		driver.get("https://www.techfios.com/billing/?ng=login/");
		Thread.sleep(2000);
	}
	
	 @When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void User_enter_and(String userName, String password) {
		 loginPage.enterCredentials(userName, password);
	 }
	 
	 @And("^User click on signin button$")
	 public void user_click_on_signin_button() throws InterruptedException {
		 loginPage.clickOnSignInButton();
		 Thread.sleep(2000);}
	 
	 @Then("^User should land on Dashboard Page$")
	 public void user_should_land_on_Dashboard_Page() throws IOException{
		 Assert.assertEquals("Dashboard- iBilling", driver.getTitle());
		 loginPage.takeScreenshotAtEndOfTest(driver);
	 }

	@Then("^User click on bank and cash$")
	public void user_click_on_bank_and_cash() throws InterruptedException  {
	    dashboardPage.clickonBankAndCashButton();
	    Thread.sleep(2000);
	}

	@Then("^User click on new account$")
	public void user_click_on_new_account() throws Throwable {
	    dashboardPage.clickonNewAccountButton();
	}

	@Then("^User fill up the form entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_fill_up_the_form_entering_and_and_and_and_and_and(String accountTitle, String description,
			String initialBalance, String accountNumber, String contactPerson, String phone, String internetBankingUrl)
			throws InterruptedException {

		dashboardPage.enterNewAccountInformations(accountTitle, description, initialBalance, accountNumber,
				contactPerson, phone, internetBankingUrl);
		Thread.sleep(2000);
	}

	@Then("^clicks on submit$")
	public void clicks_on_submit() {
		dashboardPage.clickOnSubmitButton();
	}
	
	@Then("^User should see validate$")
	public void user_should_see_validate() throws Throwable {
		Assert.assertEquals("Accounts- iBilling", driver.getTitle());
		dashboardPage.takeScreenshotAtEndOfTest(driver);
	    
	}

}

package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
//import util.BrowserFactory;




public class LoginStepDefinition {
	WebDriver driver;
	LoginPage loginPage;
	
	
	@Before
	public void beforeRun() {
		//driver = BrowserFactory.startBrowser(); 
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		
	}

	@Given("^User is on the Techfios login page$")
	public void User_is_on_the_Techfios_login_page() throws InterruptedException {
		
       driver.get("https://www.techfios.com/billing/?ng=login/");
		Thread.sleep(2000);
	}
	
	       
	 @When ("^User enters username as \"([^\"]*)\"$")
	 	public void User_enters_username_as(String userName) throws InterruptedException {
		 // loginPage = PageFactory.initElements(driver, LoginPage.class);
		 loginPage.enterUserName(userName);
		 Thread.sleep(2000);
	 }
	 
	 @When("^User enters password as \"([^\"]*)\"$")
	 public void user_enters_password_as(String password) throws InterruptedException{
		 loginPage.enterPassword(password);
		 Thread.sleep(2000);
	     
	 }

	 @When("^User clicks on signin button$")
	 public void user_clicks_on_signin_button() throws InterruptedException {
		 loginPage.clickOnSignInButton();
		 Thread.sleep(2000);
	    
	 }

	 @Then("^User should land on Dashboard page$")
	 public void user_should_land_on_Dashboard_page() throws IOException{
		 
		// String expectedTitle = "Dashboard- iBilling";
		// String actualTitle = loginPage.getLoginPageTitle();
		 
		// if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			// System.out.println("Title matched");
			 
		// }else {
			// System.out.println("Title does not matched");
		 //}
	// if else is called soft assert. if, if is failed, rest of the code will be executed.	 
	// Assert is called hard assert. if it is not passed, it will not move for the rest of the code.	 
	 Assert.assertEquals("Dashboard- iBilling", driver.getTitle());
		 loginPage.takeScreenshotAtEndOfTest(driver);
	     
	 }
	 
	 @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void user_enters_and(String userName, String password) {
	     loginPage.enterCredentials(userName, password);
	 }
	 
	 
 @After
	 public void tearDown() {
    	  //driver.close();
    	 // driver.quit();
		 
	 }
	 		

			
}

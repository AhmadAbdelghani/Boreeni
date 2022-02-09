package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.TradeJournalHomePage;
import pages.TradeJournalLoginPage;
import utilities.Driver;
import utilities.PropertiesReader;

public class TradeJournalLoginSteps {
	
	TradeJournalLoginPage lp; 
	TradeJournalHomePage hp;

	// VALID TEST #STARTS
	@Given("User is on the Stock trade Tracking application")
	public void user_is_on_the_stock_trade_tracking_application() {
	    Driver.getDriver().get(PropertiesReader.getProperty("url"));
	}
	
	@When("User enters valid username  in the username field")
	public void user_enters_valid_username_in_the_username_field() {
		lp = new TradeJournalLoginPage();
	    lp.userNameBox.sendKeys(PropertiesReader.getProperty("username"));
	}
	
	@When("User enters valid password  in the password field")
	public void user_enters_valid_password_in_the_password_field() {
		lp = new TradeJournalLoginPage();
	    lp.passwordBox.sendKeys(PropertiesReader.getProperty("password"));
	}
	
	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		lp = new TradeJournalLoginPage();
	    lp.signInBtn.click();
	}
	
	@Then("User should be directed to the home page of the Stock Trade Tracking Aplication")
	public void user_should_be_directed_to_the_home_page_of_the_stock_trade_tracking_aplication() {
		hp = new TradeJournalHomePage();
	  Assert.assertTrue(hp.pageTitle.isDisplayed());
	  
	}
	// VALID TEST # ENDS ===========================================.
	
	
	//INVALID TEST USERNAMR/PASSWORD #STARTS
	@When("User enters invalid username {string} in the username field")
	public void user_enters_invalid_username_in_the_username_field(String username) {
		lp = new TradeJournalLoginPage();
		lp.userNameBox.sendKeys(username);
	    
	}
	@When("user enters invalid password {string}   in the password field")
	public void user_enters_invalid_password_in_the_password_field(String password) {
		lp = new TradeJournalLoginPage();
		lp.passwordBox.sendKeys(password);
	}
	@Then("user shoud not be directed to the home page of trade Tracking application")
	public void user_shoud_not_be_directed_to_the_home_page_of_trade_tracking_application() {
		lp = new TradeJournalLoginPage();
	    Assert.assertTrue(lp.userNameBox.isDisplayed());
	}
	@Then("System sould display {string}")
	public void system_sould_display(String expectedErrormessage) {
		lp = new TradeJournalLoginPage();
	    Assert.assertEquals(lp.badCredentialText.getText().trim(), expectedErrormessage);
	}
	//INVALID TEST USERNAMR/PASSWORD #ENDS ================================================.
	
		// INVALID PASSWORD TEST #STARTS
	@When("User enters invalid password {string}   in the password field")
	public void User_enters_invalid_password_in_the_password_field(String password) {
	    lp = new TradeJournalLoginPage();
	    lp.passwordBox.sendKeys(password);
	}
	    // INVALID PASSWORD TEST #ENDS
	
	// INVALID USERNAME TEST #STARTS
	@When("User enters invalid username {string} in the username field multiple invalid username tests")
	public void user_enters_invalid_username_in_the_username_field_multiple_invalid_username_tests(String username) {
		lp = new TradeJournalLoginPage();
		lp.userNameBox.sendKeys(username);
		
	}
	// INVALID USERNAME TEST #ENDS
	
	
	
	
	
	
	
	
	
	
	
}

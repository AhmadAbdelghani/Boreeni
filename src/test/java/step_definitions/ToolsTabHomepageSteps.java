package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.TradeJournalHomePage;
import pages.TradeJournalLoginPage;
import utilities.Driver;
import utilities.PropertiesReader;

public class ToolsTabHomepageSteps {
	
	TradeJournalHomePage hp;
	TradeJournalLoginPage lp;
	WebDriverWait letsWait;
	

	@Given("User is on Trade Journal application home page")
	public void user_is_on_trade_journal_application_home_page() {
	    lp = new TradeJournalLoginPage();
	    Driver.getDriver().get(PropertiesReader.getProperty("url"));
	    lp.userNameBox.sendKeys(PropertiesReader.getProperty("username"));
	    lp.passwordBox.sendKeys(PropertiesReader.getProperty("password"));
	    lp.signInBtn.click();
	}
	
	@When("User click on tools tab")
	public void user_click_on_tools_tab() {
	    hp = new TradeJournalHomePage();
	    letsWait = new WebDriverWait(Driver.getDriver(), 10);
	    letsWait.until(ExpectedConditions.visibilityOf(hp.toolDropDown));
	    hp.toolDropDown.click();
	}
	
	@Then("user should see three options {string}, {string}, {string}")
	public void user_should_see_three_options(String option1, String option2, String option3) {
	    String actualOption1Text = hp.dropDownOptions.get(0).getText().trim();
	    String actualOption2Text = hp.dropDownOptions.get(1).getText().trim();
	    String actualOption3Text = hp.dropDownOptions.get(2).getText().trim();
	    Assert.assertEquals(actualOption1Text, option1);
	    Assert.assertEquals(actualOption2Text, option2);
	    Assert.assertEquals(actualOption3Text, option3);
    
	    
	    
	}
}

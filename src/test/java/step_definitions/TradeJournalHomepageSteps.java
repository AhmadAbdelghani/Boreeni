package step_definitions;

import java.util.Set;

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

public class TradeJournalHomepageSteps {
	TradeJournalLoginPage lp;
	TradeJournalHomePage hp;

	// FINUM GROUP FUNCTIONALITY TEST #STARTS
	@Given("I am on the home page of the Stock Trade Tracking application")
	public void i_am_on_the_home_page_of_the_stock_trade_tracking_application() {
		lp = new TradeJournalLoginPage();
		Driver.getDriver().get(PropertiesReader.getProperty("url"));
		lp.userNameBox.sendKeys(PropertiesReader.getProperty("username"));
		lp.passwordBox.sendKeys(PropertiesReader.getProperty("password"));
		lp.signInBtn.click();
	}

	@When("User clicks on finum group functionality")
	public void user_clicks_on_finum_group_functionality() {
		hp = new TradeJournalHomePage();
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(hp.finomGroup));
		hp.finomGroup.click();
	}

	@Then("User should be directed to {string}")
	public void user_should_be_directed_to(String finumUrl) {
		hp = new TradeJournalHomePage();
		String homepage = Driver.getDriver().getWindowHandle();
		Set<String> tabs = Driver.getDriver().getWindowHandles();
		for (String tab : tabs) {
			if (!homepage.equals(tab)) {
				Driver.getDriver().switchTo().window(tab);
			}
		}
		Assert.assertEquals(Driver.getDriver().getCurrentUrl(), finumUrl);

	}

	@Then("Page tiltle should be {string}")
	public void page_tiltle_should_be(String expectedTitle) {
		String actualTitle = Driver.getDriver().getTitle().trim();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	// FINUM GROUP FUNCTIONALITY TEST #ENDS
	
	
	// Slack channel test #	STARTS
	@When("User Clicks on the Slack Channel functionality")
	public void user_clicks_on_the_slack_channel_functionality() {
		hp = new TradeJournalHomePage();
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(hp.slackChannel));
	    hp.slackChannel.click();
	}
	@Then("User should be Directed to the Slack Channel {string}")
	public void user_should_be_directed_to_the_slack_channel(String string) {
		hp = new TradeJournalHomePage();
	   String homepageWindow = Driver.getDriver().getWindowHandle();
	   Set<String> windows = Driver.getDriver().getWindowHandles();
	   for(String window : windows) {
		   if (!homepageWindow.equals(window)) {
			   Driver.getDriver().switchTo().window(window);
		   }
	   }
	   Assert.assertTrue(hp.batch1SlackChannel.isDisplayed());
	   System.out.println(hp.batch1SlackChannel.getText().trim());
	// Slack channel test #	STARTS
}
}

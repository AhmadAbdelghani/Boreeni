package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class TradeJournalHomePage {
	
	
	
	public TradeJournalHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	@FindBy (xpath = "(//a[@class=‘nav-link’])[1]")
	public WebElement pageHeader;
	
	@FindBy (xpath = "(//a[@class=‘nav-link’])[2]")
	public WebElement finomGroup;
	
	@FindBy (xpath = "(//a[@class=‘nav-link’])[3]")
	public WebElement slackChannel;
	
	@FindBy (css = "#navbarDropdown")
	public  WebElement toolDropDown;
	
	@FindBy (xpath = "//a[@class='dropdown-item']")
	public List <WebElement> dropDownOptions;
	
	@FindBy (xpath = "//input[@name='symbol']")
	public  WebElement symbolBox;
	
	@FindBy (xpath = "(//button[@type='submit'])[1]")
	public  WebElement searchBtn;
	
	@FindBy (xpath = "//input[@type='date']")
	public  WebElement dateBox;
	
	@FindBy (xpath = "(//button[@type='submit'])[2]")
	public  WebElement logOutBtn;
	
	@FindBy (linkText  = "Add trade")
	public  WebElement addTradeBtn;
	
	@FindBy (xpath = "//a[@class='btn btn-info btn-sm']")
	public List <WebElement> updateBtn;
	
	@FindBy (xpath = "//a[@class='btn btn-danger btn-sm']")
	public List <WebElement> deleteBtn;

}

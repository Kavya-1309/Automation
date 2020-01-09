package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageobject extends BasePage {
	@FindBy(xpath = "//*[@title='Women'][@class='sf-with-ul']")
	private WebElement women;
	@FindBy(xpath = "//div/ul/li/a[@title='Dresses']")
	private WebElement dress;
	@FindBy(xpath = "//div/ul/li/a[@title='T-shirts']")
	private WebElement tshirt;
	@FindBy(xpath="//*[@id=\"newsletter-input\"]")
	private WebElement Email;
	@FindBy(xpath="//*[@id=\"newsletter_block_left\"]/div/form/div/button")
	private WebElement EmailClick;
	@FindBy(xpath="//*[@id=\"columns\"]/p")
	private WebElement EmailDone;
	
	
	
	public Loginpageobject() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getwomen() {
		return women;
		}
	public WebElement getdress() {
		return dress;
	}
	public WebElement gettshirt() {
		return tshirt;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getEmailclick() {
		return EmailClick; 
	}
	public WebElement getEmailDone() {
		return EmailDone;
	}
	
	
}


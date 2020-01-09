package Objects;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Dresspageobject extends BasePage{
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement S;
	@FindBy(xpath ="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement M;
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement L;
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")
	private WebElement totalcount;
	@FindBys(@FindBy(xpath="//ul[@class='product_list grid row']/li"))
	private List<WebElement> productcount;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement product;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[2]/span")
	private WebElement more;
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	private WebElement AddCart;
	@FindBy(tagName="h2")
	private WebElement Success;
	@FindBy(name="Submit")
	private WebElement subBtn;
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div/div[3]/p[7]/button[1]")
	private WebElement Tweet;
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div/div[3]/p[7]/button[2]")
	private WebElement Share;
	@FindBy(xpath="//*[@id=\"short_description_content\"]/p")
	private WebElement Desc;
	
	public Dresspageobject() {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getS() {
		return S;
	}
	public WebElement getM() {
		return M;
	}
	public WebElement getL() {
		return L;
	}
	public int gettotalcount() {
		String count=totalcount.getText();
		String num[]=count.split(" ");
		int totalcount= Integer.parseInt(num[2]);
		return totalcount;
	}
	public int getproductcount() {
		return productcount.size(); 	
	}
	public WebElement getproduct() {
		return product;
	}
	public WebElement getAddCart() {
	 return AddCart;
	}
	public String getSuccesstxt() {
		isElementVisible(Success);
		return Success.getText();
	}
	public WebElement getTweet() {
		return Tweet;
	}
	public WebElement getmore() {
		return more;
	}
	public WebElement getShare() {
		return Share;
	}
	public WebElement getDesc() {
		return Desc;
	}
	
}

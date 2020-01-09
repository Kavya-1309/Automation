package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	 static WebDriver driver;
	@BeforeMethod
	public void Lanuching() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
	}
	
//	@DataProvider(name="TestData")
//	public Object MultipleData() {
//			Object TestData[][]= {{"rakhesh07","yakesh07"},{"rakhesh07","yakesh07"}};
//		return TestData;	
//	}
	
	
	
	@Test
	@Parameters({"username","password"})
	public void verifyLogin(String username, String password) {
	WebElement	user=driver.findElement(By.id("username"));
	user.sendKeys(username);	
	WebElement	pass=driver.findElement(By.id("password"));
	pass.sendKeys(password);
	driver.findElement(By.id("login")).click();
	driver.close();	
	}
	
//	@Test
//	@Parameters({"username","password"})
//	public void verifyLogin1(String username, String password) {
//	WebElement	user=driver.findElement(By.id("username"));
//	user.sendKeys(username);	
//	WebElement	pass=driver.findElement(By.id("password"));
//	pass.sendKeys(password);
//	driver.findElement(By.id("login")).click();
//	driver.close();	
//	}
//	

}

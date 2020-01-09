package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
	
	WebDriver driver;
	
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		driver.findElement(By.id("username")).sendKeys("KavyaGopalakrishnan");
		driver.findElement(By.id("password")).sendKeys("kavya123");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")).click();
		
		
		
		
	
		List<WebElement> list=	driver.findElements(By.xpath("//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr/td"));
		
		for(WebElement a:list) {
			System.out.println(a.getText());
		}
	}
	
	

}


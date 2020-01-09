package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Objects.BasePage;
import Objects.Loginpageobject;

public class Loginpagetest {
	Loginpageobject lg;
	BasePage bp;

	public Loginpagetest() {
		lg = new Loginpageobject();
		bp = new BasePage();
	}

	@Test
	public void verifyWomen() {
		Assert.assertTrue(bp.elementFound(lg.getwomen()), "not found");
	}

	@Test
	public void verifyDress() {
		Assert.assertTrue(bp.elementFound(lg.getdress()), "not found");
	}

	@Test
	public void verifyTshirt() {
		Assert.assertTrue(bp.elementFound(lg.gettshirt()), "not found");
	}

	@Test
	public void verifyWomenTag() {
		//lg.getwomen().click();
		String title1=bp.getTitlte();
		Assert.assertTrue(title1.contains("Women"), "Failed to VerifyTag");
	}
	@Test
	public void verifyDressTag() {
		lg.getdress().click();
		String title2=bp.getTitlte();
		Assert.assertTrue(title2.contains("Dresses"), "Failed to VerifyTag");
	}
	@Test
	public void verifyTshirtTag() {
		lg.gettshirt().click();
		String title3=bp.getTitlte();
		Assert.assertTrue(title3.contains("T-shirts"), "Failed to VerifyTag");
	}
	
	@BeforeMethod
	public void verifyWomenClick() {
		lg.getwomen().click();
	}
		
	
	@Test
	public void verifyNewsLtr() {
		bp.setText(lg.getEmail(),"kavya6@gmail.com");
		lg.getEmailclick().click();
		String P=lg.getEmailDone().getText();
		System.out.println(P);
		Assert.assertTrue(P.contains("subscribed"), "Failed to verifyNewsLtr");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

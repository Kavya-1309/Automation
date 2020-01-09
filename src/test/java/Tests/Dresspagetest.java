package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Objects.BasePage;
import Objects.Dresspageobject;
import Objects.Loginpageobject;

public class Dresspagetest {
	Dresspageobject dp;
	Loginpageobject lg;
	BasePage bp;

	public Dresspagetest543210() {
		dp = new Dresspageobject();
		bp = new BasePage();
		lg = new Loginpageobject();
	}

	@BeforeMethod
	public void verifyClick() {
		lg.getdress().click();
	}

	@Test
	public void verifySSize() {
		Assert.assertTrue(bp.elementFound(dp.getS()), "failed to verifytag");
	}

	@Test
	public void verifyMSize() {
		Assert.assertTrue(bp.elementFound(dp.getM()), "failed to verifytag");
	}

	@Test
	public void verifyLSize() {
		Assert.assertTrue(bp.elementFound(dp.getL()), "failed to verifytag");
	}

	@Test
	public void verifyProductCount() {

		lg.getdress().click();
		System.out.println(dp.getproductcount());
		System.out.println(dp.gettotalcount());

		Assert.assertEquals(dp.getproductcount(), dp.gettotalcount());
	}

	@Test
	public void verifycart() {
		lg.getdress().click();
		bp.mouseover(dp.getproduct());
		dp.getmore().click();
		dp.getAddCart().click();

		String	S=dp.getSuccesstxt();
		System.out.println(S);
		
		Assert.assertTrue(S.contains("successfully"), "failed");

		// Assert.assertTrue(C.contains("successfully"), "failed to add to cart");
	}

	@Test
	public void verifyTweet() {
		lg.getdress().click();
		bp.mouseover(dp.getproduct());
		dp.getmore().click();
		Assert.assertTrue(bp.elementFound(dp.getTweet()), "failed");
	}
	@Test
	public void verifyShare() {
		lg.getdress().click();
		bp.mouseover(dp.getproduct());
		dp.getmore().click();
		Assert.assertTrue(bp.elementFound(dp.getShare()), "failed");
	}
	@Test
	public void verifyDesc() {
		lg.getdress().click();
		bp.mouseover(dp.getproduct());
		dp.getmore().click();
		String D=dp.getDesc().getText();
		System.out.println(D);
		Assert.assertTrue(D.contains("cotton"), "Failed");
	}
		
		
	}



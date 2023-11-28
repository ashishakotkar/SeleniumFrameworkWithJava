package com.ss.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ss.pageobjects.CartPage;
import com.ss.pageobjects.HomePage;
import com.ss.pageobjects.ShoesPage;
import com.ss.pageobjects.SuitPage;
import com.ss.utilities.ReadConfig;

public class TestCases extends BaseClass{
	
	@Test
	public void test_verify_cart_empty_msg() throws InterruptedException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickcookieAcceptBtn();
		hp.clickhamburgerIcon();
		hp.clicknavPanelShoes();
		hp.clicknavPanelSneakers();
		
		ShoesPage sp = new ShoesPage(driver);
		
		sp.clickfilterBtn();
		sp.clicksortByFromPanel();
		sp.clickpriceHighToLow();
		sp.clickclosePanel();
		sp.clickfirstProduct();
		sp.clickselectSizeBtn();
		sp.clickactualSize();
		sp.clickaddToBagBtn();
		sp.clickaddedToBagLink();
		
		hp.clickgoHomeLink();
		hp.clickhamburgerIcon();
		hp.clicknavPanelClothing();
		hp.clicknavPanelSuits();
		hp.clicknavPanelClassicSuits();
		
		SuitPage spg = new SuitPage(driver);
		spg.clickfilter();
		spg.clickcolor();
		spg.clickblue();
		spg.clickclose();
		spg.clickfirstProduct();
		spg.clickselectSizeBtn();
		spg.clickselectSize();
		spg.clickaddToBagBtn();
		spg.clickaddedToBagLink();
		
		CartPage cp = new CartPage(driver);
		cp.clickremoveFromCartBtn();
		cp.clickremoveFromCartBtn();
		String actualmsg = cp.getemptyCartMsg();
		ReadConfig rc = new ReadConfig();
		String expectedmsg = rc.getAssertMessage();
		
		Assert.assertEquals(actualmsg, expectedmsg);
		
		
	}
}

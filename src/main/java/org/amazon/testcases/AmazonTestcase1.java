package org.amazon.testcases;

import org.amazon.pages.AmazonHomePage;
import org.testng.annotations.Test;

public class AmazonTestcase1  extends AmazonHomePage {
	
	
	
	@Test
	public void runBuyProduct() throws InterruptedException {
		new AmazonHomePage().page1()
		.getMobilePrice()
		.clickOnSelectedMobile()
		.getTitleofCurrentWindow()
		.getDeliveryDate()
		.clickOnAddToCart()
		.getCartText()
		.clickOnProceedToBuy()
		.getTitleOfSignInPage()
		.clickOnContinueButton()
		.getErrorMessage();
		
		
	}

}

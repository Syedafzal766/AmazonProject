package org.amazon.pages;

public class AddToCartPage extends AmazonHomePage {
	
	
	public AddToCartPage getCartText() {
		System.out.println(driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText());
		return this;
	}

	public AmazonSignInPage clickOnProceedToBuy() {
		
		driver.findElementByLinkText("Proceed to Buy (1 item)").click();
		return new AmazonSignInPage();
	}
}

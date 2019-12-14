package org.amazon.pages;

public class SelectedMobilePage extends AmazonHomePage {
	
	public SelectedMobilePage getMobilePrice() throws InterruptedException {
		Thread.sleep(3000);
		String text = driver.findElementByXPath("//span[@class='a-price-whole'][1]").getText();
		System.out.println(text);
		return this;
	}
	
	
	public NewAmazonMobileWindow clickOnSelectedMobile() {
		
		driver.findElementByXPath("//img[@alt='Samsung Galaxy M30 (Metallic Blue, 5000mAh Battery, Super AMOLED Display, 3GB RAM, 32GB Storage)'][1]").click();
		return new NewAmazonMobileWindow();
		
	}

}

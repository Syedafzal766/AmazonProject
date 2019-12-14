package org.amazon.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NewAmazonMobileWindow extends AmazonHomePage {
	
	
	public NewAmazonMobileWindow getTitleofCurrentWindow() {
		
		Set<String> allwindow=driver.getWindowHandles();
		List<String> allList=new ArrayList<String>();
		allList.addAll(allwindow);
		driver.switchTo().window(allList.get(1));
		System.out.println(driver.getTitle());
		return this;
	}

	public NewAmazonMobileWindow getDeliveryDate() throws InterruptedException {
		
		Thread.sleep(3000);
		System.out.println(driver.findElementByXPath("//div[@id='ddmDeliveryMessage']/span").getText());
		return this;
		
	}
	
	public AddToCartPage clickOnAddToCart() {
		
		driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
		return new AddToCartPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

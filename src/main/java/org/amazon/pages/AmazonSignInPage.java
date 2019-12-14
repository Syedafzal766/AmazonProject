package org.amazon.pages;

public class AmazonSignInPage extends AmazonHomePage {
	
	
	
	public AmazonSignInPage getTitleOfSignInPage() {
		System.out.println(driver.getTitle());
		return this;
		
	}
	
	public AmazonSignInPage clickOnContinueButton() {
		
		driver.findElementByXPath("//input[@id='continue']").click();
		return this;
		
		
	}
	public AmazonSignInPage getErrorMessage() {
		System.out.println(driver.findElementByXPath("//*[@id=\"auth-email-missing-alert\"]/div/div").getText());
		return this;
	}
	

}

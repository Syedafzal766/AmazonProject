package org.amazon.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePage {
	public static ChromeDriver driver;
	
	    public SelectedMobilePage page1() {
		
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys("Samsung Galaxy M30",Keys.ENTER);
		return new SelectedMobilePage();
		
	}

}

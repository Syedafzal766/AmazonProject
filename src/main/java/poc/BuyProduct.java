package poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BuyProduct {
	public ChromeDriver driver;
	
	@Test
	public void product() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("http://amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys("Samsung Galaxy M30",Keys.ENTER);
	System.out.println(driver.findElementByXPath("//span[@class='a-price-whole'][1]").getText()); 
	driver.findElementByXPath("//img[@alt='Samsung Galaxy M30 (Metallic Blue, 5000mAh Battery, Super AMOLED Display, 3GB RAM, 32GB Storage)'][1]").click();
	
	Set<String> allwindow=driver.getWindowHandles();
	List<String> allList=new ArrayList<String>();
	allList.addAll(allwindow);
	driver.switchTo().window(allList.get(1));
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	System.out.println(driver.findElementByXPath("//div[@id='ddmDeliveryMessage']/span").getText());
	driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
	System.out.println(driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText());
	driver.findElementByLinkText("Proceed to Buy (1 item)").click();
	System.out.println(driver.getTitle());
	driver.findElementByXPath("//input[@id='continue']").click();
	System.out.println(driver.findElementByXPath("//*[@id=\"auth-email-missing-alert\"]/div/div").getText());
	
	
	}
	@AfterMethod
	public void closeWindow() {
		driver.close();
	}
}

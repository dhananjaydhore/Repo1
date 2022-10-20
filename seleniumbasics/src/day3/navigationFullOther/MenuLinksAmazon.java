package day3.navigationFullOther;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class MenuLinksAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\geckodriver.exe");
		
		FirefoxDriver fd=new FirefoxDriver();
        fd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		fd.manage().window().maximize();
		
		fd.manage().window().setSize(new Dimension(500, 500));
		fd.manage().window().maximize();
		fd.get("https://www.amazon.in/");
		
		String actTitle=fd.getTitle();
		String actUrl=fd.getCurrentUrl();
		
		System.out.println("current Title & URL : "+actTitle+"\n"+actUrl);
		

		String expUrl="https://www.amazon.in/";
		String expTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		System.out.println("URL validation: "+actUrl.equals(expUrl));
		System.out.println("Title validation: "+actTitle.equals(expTitle));
		Wait wait=new FluentWait(fd).withTimeout(50, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class);
		

		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));
		WebElement amazonPayLink=fd.findElementByLinkText("Amazon Pay on Merchants");
		amazonPayLink.click();	
		
		fd.navigate().back();
		fd.navigate().forward();
//		fd.navigate().back();
//		Wait wait=new FluentWait(fd).withTimeout(50, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("for-merchants-menu")));
		String actUrl1=fd.getCurrentUrl();
		String expUrl1="https://www.amazonpay.in/merchant";
		
		System.out.println("title validation for amazon pay: "+expUrl1.equals(actUrl1));
//		fd.navigate().refresh();
		Thread.sleep(10000);
		fd.navigate().to("https://www.google.com/search?client=firefox-b-d&q=google");
		
		fd.close();
	}

}

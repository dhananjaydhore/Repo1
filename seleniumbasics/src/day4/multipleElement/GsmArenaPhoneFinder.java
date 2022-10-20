package day4.multipleElement;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class GsmArenaPhoneFinder {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\geckodriver.exe");
		
		WebDriver fx=new FirefoxDriver();
		fx.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		fx.get("https://www.gsmarena.com/");
		
//		List<WebElement> mobileList=fx.findElements(By.cssSelector("aside.sidebar>div.brandmenu-v2>*:nth-child(2)"));
//		List<WebElement> suggList=fx.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>span"));

//		List<WebElement> mobileNameList=fx.findElements(By.cssSelector("aside.col>div.light>ul>li"));
		List<WebElement> mobileNameList=fx.findElements(By.xpath("//div[@class='brandmenu-v2 light l-box clearfix']//ul/li"));
//		
		System.out.println(mobileNameList.size());
		

		for(int i=0;i<mobileNameList.size();i++) {
			System.out.println(mobileNameList.get(i).getText());
			}
        Wait wait=new FluentWait(fx).withTimeout(50, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class);
		

//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("aside.col>div.light>ul>*:first-child>a")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = 'Samsung']")));
		
		fx.findElement(By.xpath("//a[text() = 'Samsung']")).click();
//		fx.findElement(By.cssSelector("aside.col>div.light>ul>*:first-child>a")).click();
//		List<WebElement> samsungSub=fx.findElements(By.cssSelector("div#review-body>div.makers>ul>li"));
		List<WebElement> samsungSub=fx.findElements(By.xpath("//div[@class='makers']/ul/li"));
		
		System.out.println(samsungSub.size());
		for(int i=0;i<mobileNameList.size();i++) {
			System.out.println(samsungSub.get(i).getText());
			}
		
		fx.close();
	
	}
}

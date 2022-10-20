package day4.multipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBalze {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
		WebDriver cDriver=new ChromeDriver();
		
		cDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		cDriver.manage().window().maximize();
		cDriver.get("https://www.demoblaze.com/");
		
//		List<WebElement> mobileList=cDriver.findElements(By.cssSelector("div.row#tbodyid>div>div>div>h4>a"));
		List<WebElement> mobileList=cDriver.findElements(By.xpath("//a[@class='hrefch']"));
		System.out.println(mobileList.size());
//		List<WebElement> mobilePrice=cDriver.findElements(By.cssSelector("div.row#tbodyid>div>div>div>h5"));
		List<WebElement> mobilePrice=cDriver.findElements(By.xpath("//div[@class='card-block']/h5"));

		for(int i=0; i<mobileList.size(); i++) {
			System.out.println(mobileList.get(i).getText()+"  =  "+mobilePrice.get(i).getText());
		}
//		cDriver.close();
	}

}

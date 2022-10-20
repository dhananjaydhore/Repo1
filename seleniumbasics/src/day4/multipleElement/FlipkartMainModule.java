package day4.multipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMainModule {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.get("https://www.flipkart.com/");
		
//		List<WebElement> mainModule=cd.findElements(By.cssSelector("div.InyRMC>div>div>a>div>div.CXW8mj"));
//		List<WebElement> mainModule=cd.findElements(By.cssSelector("div._331-kn._2tvxW div.xtXmba"));
		List<WebElement> mainModule=cd.findElements(By.xpath("//div[@class='_331-kn _2tvxW']//div[@class='xtXmba']"));
		System.out.println(mainModule.size());
		
		for(int i=0; i<mainModule.size(); i++) {
			System.out.println(mainModule.get(i).getText());
		}
		cd.navigate().to("https://www.google.com/");
//		cd.close();

	}

}
//div.InyRMC>div>div>a>div.xtXmba
//div.InyRMC>div>div>a>div>div.CXW8mj
//div._331-kn._2tvxW div.xtXmba
package day4.multipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoSite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.get("https://www.espncricinfo.com/");
		
		List<WebElement> mainModule=cd.findElements(By.cssSelector("div.ds-flex.ds-items-center.ds-justify-between.ds-flex-1>div>div.ds-popper-wrapper>a"));
        System.out.println(mainModule.size());
		
		for(int i=0; i<mainModule.size(); i++) {
			System.out.println(mainModule.get(i).getText());
		}
		
		cd.close();
	}

}

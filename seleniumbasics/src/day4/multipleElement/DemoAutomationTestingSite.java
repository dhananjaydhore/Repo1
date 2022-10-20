package day4.multipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomationTestingSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
		WebDriver cDriver=new ChromeDriver();
		
		cDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		cDriver.manage().window().maximize();
		cDriver.get("https://demo.automationtesting.in/Register.html");
		
		List<WebElement> mainModule=cDriver.findElements(By.cssSelector("div.collapse>ul>li>a"));
		System.out.println(mainModule.size());
		
		for(int i=0; i<mainModule.size(); i++) {
			System.out.println(mainModule.get(i).getText());
		}
		cDriver.manage().window().setSize(new Dimension(100, 100));
		Thread.sleep(2000);
		cDriver.close();
	}

}

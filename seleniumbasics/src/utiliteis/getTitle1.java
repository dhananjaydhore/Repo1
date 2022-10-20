package utiliteis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getTitle1 {
	static WebDriver driver;
	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		getPageTitle(driver, driver.getCurrentUrl());

	}
	public static void getPageTitle(WebDriver driver, String url) {
		String reqTitle=driver.getTitle();
		System.out.println(reqTitle);
	}

}

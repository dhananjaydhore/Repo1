package mouseKeyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard4 {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		WebElement body=driver.findElement(By.xpath("//body"));
		body.sendKeys(Keys.ESCAPE);
//		10 times page down
		for(int i=0; i<10; i++) {
			body.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(2000);
		}
		Thread.sleep(3000);
		body.sendKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
		body.sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
		
		
	}

}

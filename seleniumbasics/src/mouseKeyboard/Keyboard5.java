package mouseKeyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard5 {
	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "R"));
		driver.close();
		/**
		 * possible ways to refresh the browser:
		 * 1. driver.navigate().refresh();
		 * 2. sendKeys(Keys.F5)
		 * 3. by hitting same URL again
		 * 4. ctrl+R
		 */
}
}

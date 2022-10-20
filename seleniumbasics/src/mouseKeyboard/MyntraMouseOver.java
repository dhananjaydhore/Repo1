package mouseKeyboard;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMouseOver {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		
		List<WebElement> mainLinks=driver.findElements(By.cssSelector("div.desktop-navLinks>div>div>a"));
		System.out.println("manu optons count: "+mainLinks.size());
		Actions act=new Actions(driver);
		for(int i=0; i<mainLinks.size(); i++) {
			WebElement option=mainLinks.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(2000);
		}

	}

}

package mouseKeyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CutPaste {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		
		firstName.sendKeys("Dhananjay", Keys.chord(Keys.CONTROL, "a"));
		Thread.sleep(4000);
		firstName.sendKeys(Keys.CONTROL, "x");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.CONTROL, "v");

	}

}

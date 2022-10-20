package cssValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValidation {

	/**
	 * Open a browser and enter vtiger application URL 
	 * validate in login page Signin
	 * 			button is displayed in Green color(code) 
	 * 			Signin text size is 16px 
	 * 			Signin text in white color(code) 
	 * 			Forgot Password ? is displayed in Blue color(code)
	 */
	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement signInButton=driver.findElement(By.cssSelector("button.button.buttonBlue"));
		System.out.println("color: "+signInButton.getCssValue("color"));
		System.out.println("font size: "+signInButton.getCssValue("font-size"));
		System.out.println("Background: "+signInButton.getCssValue("background-image"));
		
		WebElement forgotPassword=driver.findElement(By.className("forgotPasswordLink"));
		System.out.println("color of forgot pwd: "+forgotPassword.getCssValue("color"));
		
		
	}
}
package day2.locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//Login validation
		String actURL=driver.getCurrentUrl();
		String expURL="https://demo.vtiger.com/vtigercrm/index.php";
		System.out.println("Login validation: "+actURL.equals(expURL));
		
		//locate username 
		WebElement userNameInput=driver.findElement(By.id("username"));
		//removing existing text from username
		userNameInput.clear();
		
		//locate username 
		WebElement passwordInput=driver.findElement(By.id("password"));
		//removing existing text from username
		passwordInput.clear();
		
		userNameInput.sendKeys("admin");
		passwordInput.sendKeys("Test@123");
		
		//locate login button
		WebElement logInButton=driver.findElement(By.tagName("button"));
		logInButton.click();
		
		driver.close();
		
	}

}
/**
open a chrome browser
enter vtiger application url- https://demo.vtiger.com/vtigercrm/index.php
validation login page open or not
remove existing text from username field
type username as 'admin'
remove existing text from password field
type password as 'Test@123'
click on login button

*/
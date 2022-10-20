package day2.locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OranageHRMsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String actUrl=dr.getCurrentUrl();
		String expUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		String actTitle=dr.getTitle();
		String expTitle="OrangeHRM";
		
		System.out.println("title validation: "+actTitle.equals(expTitle));
		System.out.println("Url validation: "+actUrl.equals(expUrl));
		
		WebElement userName=dr.findElement(By.name("username"));
		WebElement password=dr.findElement(By.name("password"));
		
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		
		WebElement logInbutton=dr.findElement(By.tagName("button"));
		
		logInbutton.click();
		
		//homepage validation
//		WebDriverWait wait=new WebDriverWait(dr, 100);
//		wait.until(ExpectedCondition)
//		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
		System.out.println(dr.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"));
//		dr.close();
		
		
	}

}
/**
 Open chrome browser
Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Validate login page
Enter user name as Admin
Password as admin123
Click on login button
Validate home page

 */
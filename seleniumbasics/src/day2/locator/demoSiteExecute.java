package day2.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoSiteExecute {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\geckodriver.exe");
		//step2 : create an instance of firefox driver class
		FirefoxDriver fd=new FirefoxDriver();
		
		fd.get("https://demosite.executeautomation.com/Login.html");
		//verifying
		String actTitle=fd.getTitle();
		String actUrl=fd.getCurrentUrl();
		
		System.out.println("current Title & URL : "+actTitle+"\n"+actUrl);
		
//		Comparing
		String expUrl="https://demosite.executeautomation.com/Login.html";
		String expTitle="Execute Automation";
		
		System.out.println("URL validation: "+actUrl.equals(expUrl));
		System.out.println("Title validation: "+actTitle.equals(expTitle));
		
		WebElement userName=fd.findElement(By.name("UserName"));
		userName.sendKeys("execution");
		WebElement passWord=fd.findElement(By.name("Password"));
		passWord.sendKeys("admin");
		WebElement logIn=fd.findElement(By.name("Login"));
		logIn.submit();
		String actTitle1=fd.getTitle();
		String actUrl1=fd.getCurrentUrl();
		
		System.out.println("home title & URL: "+actTitle1+"   "+actUrl1);
//		WebElement logOut=fd.findElement(By.tagName("span"));
//        logOut.click();
		
	}

}
/*
Launch a new firefox browser.
Open https://demosite.executeautomation.com/Login.html
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Enter username as “execution”
Enter password as “admin”
Click on login button
Get the page title and current URL, print on console
Click on logout
Close the Browser.
*/
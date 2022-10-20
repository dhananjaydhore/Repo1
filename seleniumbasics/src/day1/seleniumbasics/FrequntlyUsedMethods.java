package day1.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrequntlyUsedMethods {

	public static void main(String[] args) {
//		step1: using System.setPropeerty(key, value); to set path for driver execution
		System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
//		step2: create an instance of chrome driver Generic way now

		WebDriver driver1=new ChromeDriver();
//		enter the application URL
		driver1.get("https://www.facebook.com/login/");
//		verify URL & Title
		String actualURL=driver1.getCurrentUrl();
		String actualTitle=driver1.getTitle();
		System.out.println("actual URL: "+actualURL+"\nactualTitle: "+actualTitle);
//		expected one
		String expectedURL="https://www.facebook.com/login/";
		String expectedTitle="Log in to Facebook";
		
//		System.out.println("URL Validation: "+actualURL.equals(expectedURL));
//		System.out.println("Title Validation: "+actualTitle.equals(expectedTitle));
		System.out.println("URL Validation: "+expectedURL.equals(actualURL));
		System.out.println("Title Validation: "+expectedTitle.equals(actualTitle));
		//driver1.close();
		
//		String pagesource =driver1.getPageSource();
//		System.out.println("Length of page source: "+pagesource.length());
//		System.out.println("data from page source: "+pagesource);
	}

}

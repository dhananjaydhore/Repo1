package day1.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class IEdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\IEDriverServer.exe");
//		step2: create an instance of IE driver Generic way now

		WebDriver driver1=new InternetExplorerDriver();
//		enter the application URL
//		driver1.get("https://www.facebook.com/login/");
////		verify URL & Title
//		String actualURL=driver1.getCurrentUrl();
//		String actualTitle=driver1.getTitle();
//		System.out.println("actual URL: "+actualURL+"\nactualTitle: "+actualTitle);
////		expected one
//		String expectedURL="https://www.facebook.com/login/";
//		String expectedTitle="Log in to Facebook";
//		
////		System.out.println("URL Validation: "+actualURL.equals(expectedURL));
////		System.out.println("Title Validation: "+actualTitle.equals(expectedTitle));
//		System.out.println("URL Validation: "+expectedURL.equals(actualURL));
//		System.out.println("Title Validation: "+expectedTitle.equals(actualTitle));
//		driver1.close();
		
	}
}
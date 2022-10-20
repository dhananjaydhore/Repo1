package day1.seleniumbasics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		//step 1 : using System.setProperty(key, value); - set path
		System.setProperty("webdriver.gecko.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\geckodriver.exe");
		//step2 : create an instance of firefox driver class
		FirefoxDriver fd=new FirefoxDriver();
		
		fd.get("https://www.facebook.com/");
		//verifying
		String actTitle=fd.getTitle();
		String actUrl=fd.getCurrentUrl();
		
		System.out.println("current Title & URL : "+actTitle+"\n"+actUrl);
		
//		Comparing
		String expUrl="https://www.facebook.com/";
		String expTitle="Facebook – log in or sign up";
		
		System.out.println("URL validation: "+actUrl.equals(expUrl));
		System.out.println("Title validation: "+actTitle.equals(expTitle));
		
		//fd.close();
	}
	//Facebook – log in or sign up
}

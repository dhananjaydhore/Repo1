package day1.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeGeneric {

	public static void main(String[] args) {
		//step1: using System.setProperty(key, value); = set path for driver execution
		System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
		//step2: create an instance of a chrome driver Generic way
		WebDriver wd=new ChromeDriver();
		
//		closed current browser
		wd.close();
	}

}

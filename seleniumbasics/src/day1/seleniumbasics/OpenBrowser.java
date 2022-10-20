package day1.seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		//step1: using System.setProperty(key,value) set to path for ChromeDriver.exe
		//System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
       //step2: Create an instance of ChromeDriver class
		ChromeDriver cd=new ChromeDriver ();
	}

}

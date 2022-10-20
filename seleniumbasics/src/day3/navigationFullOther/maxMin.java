package day3.navigationFullOther;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class maxMin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\geckodriver.exe");
		
		FirefoxDriver fd=new FirefoxDriver();
//        fd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		fd.manage().window().maximize();
		Thread.sleep(5000);
		
		fd.manage().window().setSize(new Dimension(500, 500));
		Thread.sleep(5000);
		fd.manage().window().maximize();
		Thread.sleep(5000);
		fd.manage().window().setSize(new Dimension(500, 500));
		fd.manage().window().maximize();
		Thread.sleep(5000);
		
		fd.manage().window().setSize(new Dimension(500, 500));
		Thread.sleep(5000);
		fd.manage().window().maximize();
		Thread.sleep(5000);
		fd.manage().window().setSize(new Dimension(500, 500));

}
}

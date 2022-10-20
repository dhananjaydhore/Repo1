package mouseKeyboard;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import utiliteis.SeleniumUtility;

public class GetScreenShot {

	public static void main(String[] args) throws IOException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.google.com");
//		//type cast WebDriver instance into TakesScreenshot interface
		TakesScreenshot ts=(TakesScreenshot) driver;
//		//get screenshot using getScreenshotAs() of TakesScreenshot interface
		File file=ts.getScreenshotAs(OutputType.FILE);
//		//store above screenshot into required location
		FileUtils.copyFile(file, new File("C:\\Users\\DELL\\Pictures\\Screenshots\\google.jpg"));

	}

}

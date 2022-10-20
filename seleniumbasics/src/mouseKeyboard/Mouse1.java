package mouseKeyboard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse1 {

	public static void main(String[] args) throws IOException {
		String chromeExePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
        WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        WebElement lastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        firstName.sendKeys("Dhananjay");
//      object creation for mouse action
        Actions act=new Actions(driver);
        
        act.moveToElement(firstName).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        act.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
//   extra something     
        String filePath1="C:\\aceleration\\workspace1\\property\\src\\property.properties";
        FileInputStream fis=new FileInputStream(filePath1);
		//Create an instance of Properties class 
		Properties prop=new Properties();
		//with the help of Properties class ref call load() and pass FileInputStream ref as a parameter
		prop.load(fis);
		//in order to get data from property file use getProperty(String key) of Properties class
		System.out.println("adress: "+prop.getProperty("city"));
		
		WebElement adress=driver.findElement(By.cssSelector("textarea"));
		adress.sendKeys(prop.getProperty("city"));//city=Pune
	}

}

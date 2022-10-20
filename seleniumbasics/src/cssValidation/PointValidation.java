package cssValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		cd.get("https://demo.actitime.com/login.do");
		cd.findElement(By.id("loginButton")).click();
		WebElement errorMsg=cd.findElement(By.className("errormsg"));
		Point errorMsgLocation=errorMsg.getLocation();
		int errorX=errorMsgLocation.getX();
		int errorY=errorMsgLocation.getY();
		System.out.println("errorX: "+errorX+" and errorY: "+errorY);
		
		int userNameX=cd.findElement(By.id("username")).getLocation().getX();
		int userNameY=cd.findElement(By.id("username")).getLocation().getY();
		System.out.println("userNameX: "+userNameX+" usesrNAmeY: "+userNameY);
		
		int passwordX=cd.findElement(By.name("pwd")).getLocation().getX();
		int passwordY=cd.findElement(By.name("pwd")).getLocation().getY();
		System.out.println("passwordX: "+passwordX+" passwordY: "+passwordY);
		
		System.out.println("is error msg displayed above username: "+(userNameY>errorY));
		
		System.out.println("is password is bolew username: "+(passwordY>userNameY));
		
		System.out.println("is password shows below error msg: "+(errorY<passwordY));
		
	}

}
//https://demo.actitime.com/login.do
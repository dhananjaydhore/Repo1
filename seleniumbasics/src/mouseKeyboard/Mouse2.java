package mouseKeyboard;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse2 {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/");
		List<WebElement> mainMenu=driver.findElements(By.cssSelector("div#menu>ul>li"));
		System.out.println("Menu options count: "+mainMenu.size());
		
		Actions act=new Actions(driver);
//		act.moveToElement(mainMenu.get(3)).contextClick().perform();
//		for(int i=0; i<mainMenu.size(); i++) {
//			WebElement option=mainMenu.get(i);
//			act.moveToElement(option).perform();
//			Thread.sleep(3000);
//		}
		
//		rightClick(act, mainMenu.get(1));
		
//		mouseOverTheElement(act, mainMenu.get(2));
		
		mouseOverWithCords(act, mainMenu.get(1), 100, 0);
		
//		mouseOver(act, mainMenu);
	}
	static void rightClick(Actions act, WebElement option) {
		System.out.println("Option name is : " + option.getText());
		act.moveToElement(option).contextClick().build().perform();
		// act.contextClick(option).build().perform();
	}
	
	static void mouseOverTheElement(Actions act, WebElement element) {
		act.moveToElement(element).perform();
	}
	
	static void mouseOverWithCords(Actions act, WebElement option, int x, int y) {
		System.out.println("Option namr is: "+option.getText());
		act.moveToElement(option,x, y).perform();
	}
	
	static void mouseOver(Actions act, List<WebElement> mainMenu) throws InterruptedException {
		for(int i=0; i<mainMenu.size(); i++) {
			WebElement option=mainMenu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(2000);
		}
	}
}



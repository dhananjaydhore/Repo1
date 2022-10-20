package dropdownCalender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	cd.manage().window().maximize();
	cd.manage().timeouts().implicitlyWait(29, TimeUnit.SECONDS);
	cd.get("https://www.redbus.in/");
	cd.findElement(By.id("src")).sendKeys("Pune");
	cd.findElement(By.cssSelector("ul.autoFill>li.selected")).click();
	Thread.sleep(1000);
	cd.findElement(By.id("dest")).sendKeys("Nagpur");
	cd.findElement(By.cssSelector("ul.autoFill>li.selected")).click();
	cd.findElement(By.id("onward_cal")).click();
	cd.findElement(By.cssSelector("div.rb-calendar>table>tbody>*:nth-child(6)>*:nth-child(4)")).click();
	cd.findElement(By.id("search_btn")).click();
	cd.findElement(By.cssSelector("div#filter-block>div>div.details>ul.list-chkbox>*:nth-child(3)>label.custom-checkbox")).click();
	cd.findElement(By.cssSelector("div#filter-block ul.dept-time.at-time-filter>*:first-child")).click();
	List<WebElement> busList=cd.findElements(By.cssSelector("div#result-section ul.bus-items div.column-two"));
	System.out.println("Available Buses: "+busList.size());
	List<WebElement> priceList= cd.findElements(By.cssSelector("div.column-seven"));
	for(int i=0; i<busList.size(); i++) {
		System.out.println("Bus Options "+i+": "+busList.get(i).getText()+" price: "+priceList.get(i).getText());
	}
	

	}

}

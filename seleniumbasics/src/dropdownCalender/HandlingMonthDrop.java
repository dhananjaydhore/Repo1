package dropdownCalender;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMonthDrop {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	cd.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	cd.get("http://demo.automationtesting.in/Register.html");
	WebElement monthDrop=cd.findElement(By.cssSelector("select[placeholder=\"Month\"]"));
	Select selectMonth=new Select(monthDrop);
	System.out.println("Multiple or not: "+selectMonth.isMultiple());
	List<WebElement> yearOptions=selectMonth.getOptions();
	System.out.println("size: "+yearOptions.size());
	List<String> month=new ArrayList<String>();
	for(int i=1; i<yearOptions.size(); i++) {
		String month1=yearOptions.get(i).getText();
		month.addAll(month);
	}
	List<String> dupMonth=new ArrayList<String>(month);
	Collections.sort(dupMonth);
	System.out.println(month.equals(dupMonth));

	}

}

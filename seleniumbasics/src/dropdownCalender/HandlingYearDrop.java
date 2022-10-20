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

public class HandlingYearDrop {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	cd.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	cd.get("http://demo.automationtesting.in/Register.html");
	WebElement YearDrop=cd.findElement(By.id("yearbox"));
	Select selectYear=new Select(YearDrop);
	System.out.println("Multiple or not: "+selectYear.isMultiple());
	List<WebElement> yearOptions=selectYear.getOptions();
	System.out.println("size: "+yearOptions.size());
	List<Integer> year=new ArrayList<Integer>();
	for(int i=1; i<yearOptions.size(); i++) {
		String year1=yearOptions.get(i).getText();
		year.add(Integer.parseInt(year1));
	}
	List<Integer> dupYear=new ArrayList<Integer>(year);
	Collections.sort(dupYear);
	System.out.println(year.equals(dupYear));

	}

}

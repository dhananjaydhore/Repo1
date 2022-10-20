package day4.multipleElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLongOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\aceleration\\workspace1\\seleniumbasics\\executables\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.get("https://demo.actitime.com/login.do");
		cd.findElement(By.name("username")).sendKeys("admin");
		cd.findElement(By.name("pwd")).sendKeys("manager");
		cd.findElement(By.id("loginButton")).click();
//		click on task
		cd.findElement(By.cssSelector("a.content.tasks")).click();
//		click on add new
		cd.findElement(By.cssSelector("div.addNewButton>div.downIcon")).click();
//		click on new task
		cd.findElement(By.cssSelector("div.item.createNewTasks")).click();
//		select project as android testing
		cd.findElement(By.cssSelector("tr.selectProjectRow.projectSelectorRow div.dropdownButton")).click();
		cd.findElement(By.cssSelector("tr.selectProjectRow.projectSelectorRow div.searchItemList>*:nth-child(5).itemRow.cpItemRow")).click();
//		entre task name as Testing
		cd.findElement(By.cssSelector("tbody>*:first-child>td.nameCell.first>input.inputFieldWithPlaceholder")).sendKeys("Testing1");
//		click on create task
		cd.findElement(By.cssSelector("div.commitButtonPlaceHolder>div>div.components_button_label")).click();
//		verify task
		WebElement viewTask=cd.findElement(By.cssSelector("tbody>*:last-child div.title"));
//		tr.taskRow.noLastTrackingData div.title
		System.out.println(viewTask.getText());
//		click checkbox of testing task
		cd.findElement(By.cssSelector("tbody>*:last-child.noLastTrackingDate div.img")).click();
//		click on delete
		cd.findElement(By.cssSelector("div.bulkOperationsPanel div.delete.button")).click();
//		click on delete permanently
		cd.findElement(By.cssSelector("div.dialogWithPointerWrapper.deleteDialog span.submitTitle.buttonTitle")).click();
//		Testing task delete or not
//		System.out.println(viewTask.getText());
		
		
	}

}

package testNgPractice;

import org.testng.annotations.Test;

public class Ex_param2 {
  @Test(priority=1)
  public void login() {
	  System.out.println("hello, i am login");
  }
  @Test(priority=2)
  public void sendEmail() {
	  System.out.println("hello, i am sendEmail method");
  }
 @Test(priority=3)
public void logout() {
	 System.out.println("hello, i am logout method");
 }
}
//By Default each @Test has priority as 0
//lowest priority will get executed first
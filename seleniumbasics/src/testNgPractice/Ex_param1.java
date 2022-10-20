package testNgPractice;

import org.testng.annotations.Test;

public class Ex_param1 {
  @Test(invocationCount=5)
  public void param1() {
	  System.out.println("hello, i am param 1 test case");
  }
}

/*
*if testNG class contains more than one test method then all the test 
*method executed in alphabetical order
*
*/
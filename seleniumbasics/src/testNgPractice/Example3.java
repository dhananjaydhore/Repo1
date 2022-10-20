package testNgPractice;

import org.testng.annotations.Test;

public class Example3 {
  @Test
  public void testCase3() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("Hello, i am TC3 from Example3 class");
  }
}

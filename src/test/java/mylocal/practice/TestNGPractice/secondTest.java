package mylocal.practice.TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class secondTest {
	 @Test
	  public void f() {
		  System.out.println("second Test f()");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("SecondTest beforeTest");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("SecondTest afterTest");
	  }

}

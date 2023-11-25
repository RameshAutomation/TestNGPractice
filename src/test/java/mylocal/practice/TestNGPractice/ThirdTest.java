package mylocal.practice.TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ThirdTest {
	@Test
	  public void f() {
		  System.out.println("Third Test f()");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("ThirdTest beforeTest");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("ThirdTest afterTest");
	  }

}

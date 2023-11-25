package mylocal.practice.TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FourthTest {
  @Test
  public void f() {
	  System.out.println("FourthTest f()");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("FourthTest beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("FourthTest afterTest");
  }

}

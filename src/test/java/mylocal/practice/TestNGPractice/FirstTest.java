package mylocal.practice.TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
  @Test
  public void f() {
	  System.out.println("First Test f()");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("FirstTest beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("FirstTest afterTest");
  }

}

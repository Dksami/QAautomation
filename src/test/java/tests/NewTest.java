package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("This is a new test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method execution");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method execution");

  }

}

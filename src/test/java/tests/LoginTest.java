package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import pages.LoginPage;

public class LoginTest {
 WebDriver driver;
 LoginPage lp;

  
  @BeforeMethod
  public void beforeMethod() {
	   driver = new ChromeDriver();
//loginpage ko constructor ma driver pathaxa so yo pathauni vhnerw vhnni   
	 lp =new LoginPage(driver);
	 driver.manage().window().maximize();  
	driver.get("https://demoblaze.com/");
  }
  
  @Test
 public void Login() {	  
//loginpage.java lay username and pw mageko xa so 
	  lp.normalLogin("testmorning", "test123");
	  
		  }
  
  @Test
  public void BlankLogin() {
	  lp.blankpassword("testmorning");
	  
  }
		  
 
  @AfterMethod
  public void afterMethod() {
//	  try {
//		  Thread.sleep(5000);
//	  }
//	  catch(InterruptedException e) {
//		  e.printStackTrace();
//		   
//	  }
	  driver.quit();
  }

}

package pages;
//jati pani actions haru xa login garda ko xa loginpage ma rakhni 

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import locator.Locator; 

public class LoginPage {
	
	WebDriver driver;
	//locator vhitra ko sab locator chalauna lai locator import
	Locator lc=new Locator();

//	class constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
//	for every action create a function 
	public void clicknavLogin() {
		driver.findElement(By.id(lc.nav_id)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	}
	
	public void enterUsername(String username) {	
		driver.findElement(By.id(lc.username_id)).sendKeys(username);
		
	}
	public void enterPassword(String password) {
		driver.findElement(By.id(lc.password_id)).sendKeys(password);
		
	}
	public void clickLoginButton(){
		driver.findElement(By.xpath(lc.button_xpath)).click();
		
	}	
	
	public void normalLogin(String username,String password) {
		clicknavLogin();
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();
		
	}
	public void blankpassword(String username) {
		clicknavLogin();
		enterUsername(username);
		clickLoginButton();
	}
	
	
	

}

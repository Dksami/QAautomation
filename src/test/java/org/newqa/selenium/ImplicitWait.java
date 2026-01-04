//filename: ImplicitWait

package org.newqa.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//difference between wait and sleep 
//wait until certain time but when everyone is here start is implicit(wait every element)both might take same time 
//and explicit (wait only one element ) comparatively explicit is fast 
//sleep lai certain time kurnai paryo 10 mins vhnesi 10 mins 
//in real time, wait is preferred

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");

		WebElement navlogin, username_input, password_input, login_button;
		
		navlogin = driver.findElement(By.id("login2"));
		navlogin.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		username_input = driver.findElement(By.id("loginusername"));
		username_input.sendKeys("testmorning");
		
		password_input = driver.findElement(By.id("loginpassword"));
		password_input.sendKeys("test123");
		
		login_button = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		login_button.click();
		
		
//		driver.quit();
		
	}

}

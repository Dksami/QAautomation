

//filename:RegisterFill.java 


package org.newqa.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class RegisterFill {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		
		WebElement first_name,last_name,submit_button,address,email,phone,f_gender,hobby,pw,c_pw;
	
		WebElement lang,s_lang,skill,country,s_country,dob_year,dob_month,dob_day;
		
		first_name=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		first_name.sendKeys("Samita");
		Thread.sleep(2000);
		
		last_name=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		last_name.sendKeys("Gurung");
		Thread.sleep(2000);
		
		address=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		address.sendKeys("Pokhara");
		Thread.sleep(2000);
		
		email=driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		email.sendKeys("gdhankumari007@gmail.com");
		Thread.sleep(2000);
		
		phone=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		phone.sendKeys("9816199264");
		Thread.sleep(2000);
		
		f_gender=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
		f_gender.click();
		Thread.sleep(2000);
		
		hobby=driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
		hobby.click();
		Thread.sleep(2000);
		
		lang=driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		lang.click();
		s_lang=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]"));
		s_lang.click();
		s_lang=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[35]/a"));
		s_lang.click();
		s_lang=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[40]/a"));
		s_lang.click();
		
		Thread.sleep(2000);
	
		skill=driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		Select s1 = new Select(skill);
		s1.selectByVisibleText("Support");
		Thread.sleep(2000);
		
		country=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		country.click();
		s_country=driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[5]"));
		s_country.click();
		Thread.sleep(2000);
		
		
		dob_year=driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		Select s2 = new Select(dob_year);
		s2.selectByVisibleText("2001");
		Thread.sleep(2000);
		
		dob_month=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select s3 = new Select(dob_month);
		s3.selectByVisibleText("June");
		Thread.sleep(2000);
		
		dob_day=driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		Select s4 = new Select(dob_day);
		s4.selectByVisibleText("8");
		Thread.sleep(2000);
		
		pw=driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
		pw.sendKeys("@sam123");
		Thread.sleep(2000);
		
		c_pw=driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
		c_pw.sendKeys("@sam123");
		Thread.sleep(2000);
		
		
		submit_button = driver.findElement(By.xpath("//*[@id=\"submitbtn\"]"));
		submit_button.click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}

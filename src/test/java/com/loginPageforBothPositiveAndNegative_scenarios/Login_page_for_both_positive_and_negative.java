package com.loginPageforBothPositiveAndNegative_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_page_for_both_positive_and_negative 
{
  
	WebDriver driver;
	
	@BeforeMethod
	public void setuptest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	}
	
	
	@Test(description = "verify the sign",priority = 1, dataProvider="passdataPositiveAndNegative")
	public void Testcase1(String uname,String pswd) throws InterruptedException
	{
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Account & Lists')]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//span[.='Sign in'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys(uname);
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pswd);
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
	
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	
	
	@DataProvider()
	public static Object[][] passdataPositiveAndNegative()
	{
		return new Object[][] {{"anilk111umar@gmail.com","Anilkumar327@#"},{"anilk11umar@gmail.com","Anilkumar32@#"},{"anilk111umar@gmail.com","Anlkumar32@#"},{"anilk11umar@gmail.com","Anilkumar327#"}};
	}
	

}

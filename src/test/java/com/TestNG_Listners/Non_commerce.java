package com.TestNG_Listners;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


//@Listeners(com.TestNG_Listners.Noncommerce.class)
public class Non_commerce {

	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/login");
	}
	
//	@Test(priority=1)
//	public void testcase1()
//	{
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,200)");
//		driver.findElement(By.xpath("//input[@value='Register']")).click();
//	    driver.findElement(By.id("FirstName")).sendKeys("abc");
//	    driver.findElement(By.name("LastName")).sendKeys("dude");
//	    driver.findElement(By.id("Email")).sendKeys("anilkumar327a@gmail.com");
//	    driver.findElement(By.id("ConfirmEmail")).sendKeys("anilkumar327a@gmail.com");
//	    driver.findElement(By.id("Username")).sendKeys("abc dude");
//	}
//	
//	
//	@Test(priority=2,description = "inside dropdown count options")
//	public void testcase2()
//	{
//		WebElement ele=driver.findElement(By.id("CountryId"));
//		Select sel=new Select(ele);
//		sel.selectByVisibleText("India");
//		List<WebElement> opt = sel.getOptions();
//		int count = opt.size();
//		System.out.println(count);
//		
//		WebElement ele1=driver.findElement(By.id("TimeZoneId"));
//		Select sel1=new Select(ele1);
//		List<WebElement> opt1 = sel1.getOptions();
//		int count1=opt1.size();
//		System.out.println(count1);
//		
//	}
//	
//	@Test(priority=3)
//	public void testcase3()
//	{
//		driver.findElement(By.id("Password")).sendKeys("abcd123@#");
//		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd123@#");
//        boolean validation=driver.findElement(By.xpath("//strong[.='Your Account Details']")).isDisplayed();
//        Assert.assertEquals(true, validation);
//        System.out.println(validation);
//        
//        WebElement ele2=driver.findElement(By.id("Details_CompanyIndustryId"));
//		Select sel2=new Select(ele2);
//		sel2.selectByVisibleText("I am student");
//		List<WebElement> opt2 = sel2.getOptions();
//		int count2 = opt2.size();
//		System.out.println(count2);
//        
//		 driver.findElement(By.id("register-button")).click();
//			
//	}
	
	
	@Test(priority=4)
	public void testcase4()
	{
	  boolean validation=driver.findElement(By.xpath("//h1[.='Welcome, Please Sign In!']")).isDisplayed();
      AssertJUnit.assertEquals(validation, true);
      System.out.println(validation);
      
	}
	@Test(priority = 5)
	public void testcase5()
	{
	  WebElement ele=driver.findElement(By.xpath("//pan[@class='user-actions-ico']"));
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	}
	@Test(priority = 6,dependsOnMethods = {"testcase5"})
	public void testcase6()
	{
	  driver.findElement(By.xpath("//span[.='Log in']")).click();
	  
	  driver.findElement(By.id("Username")).sendKeys("abc dude");
	  driver.findElement(By.id("Password")).sendKeys("abcd123@#");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	
	
	
}

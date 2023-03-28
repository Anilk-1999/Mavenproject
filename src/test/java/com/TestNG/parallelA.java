package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelA {
WebDriver driver;
	
	
   @Test
	public void testcase1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Open Menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
       System.out.println("this is parallel execute1 :"+Thread.currentThread().getId());
	}
   
   @Test
   public void testcase2() 
   {
	   System.out.println("this is parallel execute2 :"+Thread.currentThread().getId());
   }

}

package com.facebook;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
   WebDriver driver;
  
   @Test
@BeforeTest
   public void test()
   {
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
  
		@Test(priority = 3)
		public void logintest() throws InterruptedException
		{

	    Thread.sleep(2000);
	    driver.findElement(By.id("email")).sendKeys("anilkumar327a@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.name("pass")).sendKeys("Anil123@#");
	    Thread.sleep(2000);
	    driver.findElement(By.name("login")).click();
         }
	
		@Test(priority = 1)
		public void signuptest() throws InterruptedException
		{
			    driver.findElement(By.xpath("//a[.='Create new account']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ani");
			    Thread.sleep(2000);
			    driver.findElement(By.name("lastname")).sendKeys("ani");
			    Thread.sleep(2000);
			    driver.findElement(By.name("reg_email__")).sendKeys("anilkumar327a@gmail.com");
			    Thread.sleep(2000);
			    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("anilkumar327a@gmail.com");
			    driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("Anil123@#");
			    Thread.sleep(2000);
			    driver.findElement(By.id("day")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//option[.='22']")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.id("month")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//option[.='Jan']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.id("year")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//option[.='1999']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//label[.='Male']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//button[.='Sign Up']")).click();
			    Thread.sleep(2000);
 		}
       @Test(priority = 2)
		public void signouttest() throws InterruptedException
		{
               driver.findElement(By.xpath("//*[@id='scrollview']/div/div/div/div[1]/div/div[3]/div[1]/div[1]/span/div/i")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//span[.='Log Out']")).click();
		       driver.findElement(By.xpath("//span[.='Log Out']")).click();
		}

       @AfterTest
        public void Closetest()
        {
        	driver.close();
        }



   }


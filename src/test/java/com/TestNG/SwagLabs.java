package com.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SwagLabs {

	WebDriver driver;
	
	
	@BeforeClass
	public void setupTest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
	
	@Test(priority = 1, description= "launch the Swag Labs website and verify the title")
	public void Testcase1()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.saucedemo.com/");
        String actualTitle1 = driver.getTitle();
		String expectedTitle = "Swag Labs";
		AssertJUnit.assertEquals(actualTitle1, expectedTitle);
	}
	
	@Test(priority = 2,description = "Log in to Swag Labs")
	public void Testcase2() throws InterruptedException
	{
	
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	
	@Test(priority = 4,description = "verify the URL",enabled=false)
	public void Testcase3() throws InterruptedException
	{
        Thread.sleep(2000);
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://www.saucedemo.com/inventory.html";
		AssertJUnit.assertEquals(actualurl, expectedurl);
		
	}
	
	@Test(priority = 3,description = "verify the title",dependsOnMethods = {"Testcase5"},alwaysRun = true,invocationCount = 3)
	public void Testcase4() throws InterruptedException
	{
    Thread.sleep(2000);
	String	actulaltitle=driver.getTitle();
	String expectedtitle="Swag Labs";
	AssertJUnit.assertEquals(actulaltitle, expectedtitle);
	}
	
	@Test(priority = 5,description = "verify the image")
	public void Testcase5()
	{
		boolean img = driver.findElement(By.xpath("(//img[@class='inventory_item_im'])[2]")).isDisplayed();
        AssertJUnit.assertTrue(img);	//"(//img[@class='inventory_item_img'])[2]")--correct xpath
	}
	
	@Test(priority = 6,description = "Logout from the Swag Labs website and verify the URL")
	public void Testcase6() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Open Menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
        Thread.sleep(2000);
		String actualurl1 = driver.getCurrentUrl();
		String expectedurl="https://www.saucedemo.com/";
		AssertJUnit.assertEquals(actualurl1, expectedurl);
	}
	
	@AfterClass
	public void CloseTest() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
}

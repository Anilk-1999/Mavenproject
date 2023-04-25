package doubts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dilip {
	WebDriver driver;

	@BeforeMethod
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(option);
		
		driver.get("https://v2trade.ekbazaar.com/");
	
		
		driver.manage().window().maximize();  // to maximise the Browser
		
		driver.manage().deleteAllCookies();  // it will delete all the cookies
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(priority=0,groups="display logo")
	public void logodisplay() 
	{
		
	boolean b = driver.findElement(By.xpath("//img[@alt=\"logo\"]")).isDisplayed();
		
		
	}
	
	
	@Test(priority=1,groups="signin")
	public void signin() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class=\"sign-in-btn\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Number\"]")).sendKeys("7978006295");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Password\"]")).sendKeys("Tester@123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value=\"Sign In\"]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//h2[text()=\"My Products/Services\"]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@value=\"Add Products\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class=\"checkmark-x\"])[3]")).click();
		Thread.sleep(3000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		
		driver.findElement(By.xpath("//button[@value=\"Next\"]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//button[@value=\"Add / Edit Details\"])[1]")).click();
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("(//div[.='Per Bag'])[2]")).click();
        driver.findElement(By.xpath("(//div[.='Per Kg'])[1]")).click();
		
		
	}
	
	
	
	@Test(priority=2,enabled=false)
	public void product() throws InterruptedException
	{
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	@AfterMethod(enabled=false)
	public void close()
	{
		driver.quit();
	}
}

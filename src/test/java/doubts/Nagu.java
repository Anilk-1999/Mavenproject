package doubts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nagu {

WebDriver driver;
	
	@Test
	public void testcase() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,600)");
		 driver.findElement(By.id("mat-select-value-1")).click();
		 Thread.sleep(2000);
	  Robot rob=new Robot();
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_TAB);
//	  rob.keyRelease(KeyEvent.VK_TAB);
//	  Thread.sleep(2000);
//	  rob.keyPress(KeyEvent.VK_ENTER);
//	  rob.keyRelease(KeyEvent.VK_ENTER);
//	  Thread.sleep(2000);
	  rob.keyPress(KeyEvent.VK_ENTER);
	  rob.keyRelease(KeyEvent.VK_ENTER);
	 WebElement ele = driver.findElement(By.xpath("//span[.='$31,981.41']"));	
	Actions act=new Actions(driver);
	act.doubleClick(ele).perform();
	
	String text = driver.findElement(By.xpath("//span[.='$31,981.41']")).getText();
	System.out.println(text);
	}
}

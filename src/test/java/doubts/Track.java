package doubts;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Track {
	
	WebDriver driver;
	
@Test
public void testcase() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dev-trackado.tech-active.com/login");
	Thread.sleep(5000);
	driver.manage().window().minimize();
	
	driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("gajee@gmail.com");
	driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys("123456");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Clients')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Add Client']")).click();
	Thread.sleep(2000);
}
	@Test
	public void testcase1() throws AWTException
	{
	
	driver.findElement(By.xpath("//input[@class=\"addinput ng-pristine ng-valid ng-touched\"]")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Anglo");
	
	WebElement ele = driver.findElement(By.xpath("(//input[@class=\"btn addButton btn-outline-success\"])[1]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", ele);
	
//	Robot rob=new Robot();
//	rob.keyPress(KeyEvent.VK_ENTER);
//	rob.keyRelease(KeyEvent.VK_ENTER);
	
//	WebElement ele= driver.findElement(By.xpath("(//input[@type='text'])[10]"));
//	Actions act1=new Actions(driver);
//	act.click(ele).build().perform();
	//JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,1000)");
//	
//	
//	driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
	
	
	
}
}
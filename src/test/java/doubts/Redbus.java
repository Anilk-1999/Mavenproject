package doubts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

WebDriver driver;
	

	@BeforeClass
	public void setuptest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
	}
	
	@Test
	public void testcase1() throws InterruptedException
	{
		driver.findElement(By.id("onward_cal")).click();
//		new WebDriverWait(driver, Duration.ofSeconds(5))
//		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//labal[.='Date']")));
		driver.findElement(By.xpath("//button[text()='>']")).click();
		
		Thread.sleep(2000);
	driver.findElement(By.xpath("//td[.='25']")).click();
	
}//button[text()='>']
}

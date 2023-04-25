package doubts;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.Toolkit;
public class Kmlfile {
	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/maps/d/edit?hl=en&mid=1GnLo8qeQUS85iVk1Y64LrVOH46ZAyso&ll=15.854161601052223%2C82.75998700000002&z=4");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nagaraj@active.agency");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Nagu@123");
		Thread.sleep(3000);
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='+ Create a new map'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Import'])[1]")).click();

		Thread.sleep(3000);

		WebElement popupFrame = driver.findElement(By.xpath("//div[@id=':33.contentEl']//iframe"));
		//iframe[@id='gr92i74sdgzw']

		driver.switchTo().frame(popupFrame);
		Thread.sleep(2000);
		//To click on select file button
		driver.findElement(By.xpath("//span[.='Browse']")).click();

		//To close the frame
		//driver.findElement(By.xpath("//div[@class='le-ak-db-zi']")).click();
		Thread.sleep(3000);
		//switch back to parent frame
		driver.switchTo().parentFrame();

		String path="/home/active30/Downloads/EMNATI track.kml";

//		JavascriptExecutor js=(JavascriptExecutor) driver;
		// js.executeScript("argument[0].click();", buttonclick);
		rt.delay(2000);

		StringSelection ss=new StringSelection(path);
//		Toolkit toolKit = Toolkit.getDefaultToolkit();
		Toolkit.getDefaultToolkit().getSystemClipboard();
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		System.out.println("File Selection =  "+ path);
		//		
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyRelease(KeyEvent.VK_V);
		rt.delay(1000);
		//		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		rt.delay(1000);
		//file access
		Thread.sleep(1000);
		//virtual Key VK
//		driver.quit();
	}
}
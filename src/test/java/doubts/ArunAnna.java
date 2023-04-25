package doubts;



	
	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ArunAnna{
		
	WebDriver driver;	

		@Test(priority = 1)
		public void setup() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));

			// login
			// ****************************************************************************
			driver.get("http://campaignsopend.tech-active.com/#/admin_login");
			WebElement emailTextField = driver.findElement(By.id("email_id"));
			emailTextField.clear();
			emailTextField.sendKeys("admin@opend.com");
			WebElement passwordTextField = driver.findElement(By.id("password"));
			passwordTextField.clear();
			passwordTextField.sendKeys("1234");
			driver.findElement(By.xpath("//button[text()='Sign In']")).submit();
		}

			// ******************************************************************************
			//Click on the campaign
			@Test(priority = 2)
			public void contactUpload() throws InterruptedException {
			JavascriptExecutor js5 = (JavascriptExecutor) driver;

			js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//			Click on the Contact button
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/aside[1]/ul[1]/li[7]/a[1]")).click();
			Thread.sleep(1000);
//			Click on the create contact
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/a[1]")).click();
			Thread.sleep(1000);
//			Upload contact page
//			Click on the dropdown publisher
			Select drpPublisher = new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]")));
			drpPublisher.selectByValue("51");
			Thread.sleep(1000);
//			Click on the contact list Name
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("DTP data");
			Thread.sleep(1000);
//		    Click on the Audience type
			driver.findElement(By.xpath("Click on the Audience type")).click();
			Thread.sleep(1000);
//			Click on the type book
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]/input[1]")).click();
			Thread.sleep(1000);
//			Click on the Select button popup
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/button[1]")).click();
			Thread.sleep(1000);
//			Click on the CPM payout price
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[3]/input[1]")).sendKeys("10");
			Thread.sleep(1000);
//			Click on the Usage limit per day
			driver.findElement(By.xpath("(//input[@class='validate input-field ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required'])[3]")).sendKeys("5");
			Thread.sleep(1000);
//			Click on the Audience Interests
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/span[1]/input[1]")).click();
			Thread.sleep(1000);
//			Click on the Audience Interests popup (book)
			driver.findElement(By.xpath("Click on the Audience Interests popup (book)")).click();
			Thread.sleep(1000);
//			Click on the Audience interest Select button
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/button[1]")).click();
			Thread.sleep(1000);
//			Click on the  Country Drop Down
			Select drpCountry=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[6]/select[1]")));
			drpCountry.selectByValue("79");
			Thread.sleep(1000);
//			Click on the Upload button(send keys)
			driver.findElement(By.xpath("//input[@id='uploadBtn2']")).sendKeys("C:\\Users\\Active.30\\Downloads\\New Contacts (2)G.csv");
			Thread.sleep(1000);
//			Click on the Default From Name
			driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[1]/input[1]")).sendKeys("DTP Contacts");
			Thread.sleep(1000);
//			Click on the Add button
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
//			***************************************************************************************************
			
//			Data Mapping page
//			Click on the first name
			Thread.sleep(1000);
			Select firstName=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")));
			firstName.selectByValue("first name");
			Thread.sleep(1000);
//			Select the Surname
			Select surName=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]")));
			surName.selectByValue("sur name");
			Thread.sleep(1000);
//			Select the Email
			Select drpEmail=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/select[1]")));
			drpEmail.selectByValue("email");
			Thread.sleep(1000);
//			Select the Salutation
			Select saluation=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/select[1]")));
			saluation.selectByValue("salutation");
			Thread.sleep(1000);
//			Select the Ip Address
			Select drpAddress=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/select[1]")));
			drpAddress.selectByValue("ipaddress");
			Thread.sleep(1000);
//			Select the DOB
			Select drpDob=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[6]/select[1]")));
			drpDob.selectByValue("dob");
			Thread.sleep(1000);
//			Select the Postcode
			Select drpPostcode=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[7]/select[1]")));
			drpPostcode.selectByValue("post code");
			Thread.sleep(1000);
//			Select the Gender
			Select drpGender=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[8]/select[1]")));
			drpGender.selectByValue("gender");
			Thread.sleep(1000);
//			Select the Country
			Select drpCountry1=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[9]/select[1]")));
			drpCountry1.selectByValue("country");
			Thread.sleep(1000);
//			Select the Opt in Source*
			Select drpSource=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[10]/select[1]")));
			drpSource.selectByValue("optinsource");
			Thread.sleep(1000);
//			Select the Opt in date*
			Select drpDate=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/select[1]")));
			drpDate.selectByValue("optindate");
			Thread.sleep(1000);
//			Select the Opt in time*
			Select drpTime=new Select(driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[12]/select[1]")));
			drpTime.selectByValue("optintime");
			Thread.sleep(1000);
//			Select the Add button
			driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
			}
			

	
}

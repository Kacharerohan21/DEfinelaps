package bhaane.Define_Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Create_account {

	WebDriver driver=new ChromeDriver();
	
	@Before
	public void setUp() throws Exception {
	driver.get("https://www.bhaane.com/tops");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	
	@Test
	public void test_account() {
		WebElement Account = driver.findElement(By.xpath("//li[contains(text(),'account')]"));
		Account.click();
		
		WebElement SignUp=driver.findElement(By.xpath("//div[contains(text(),'sign up >')]"));
		SignUp.click();
		
		
		WebElement FirstName=driver.findElement(By.xpath("//body/div[@id='modal-register']/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		FirstName.sendKeys("first name");
		

		WebElement LastName=driver.findElement(By.xpath("//body/div[@id='modal-register']/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]"));
		LastName.sendKeys("Last name");
		
		
		WebElement Email_ID=driver.findElement(By.xpath("//body/div[@id='modal-register']/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]"));
		Email_ID.sendKeys("first_Last_name@gmail.com");
		
		WebElement Mobile=driver.findElement(By.name("mobile"));
		Mobile.sendKeys("1234567891");
		
		WebElement Password=driver.findElement(By.xpath("//body/div[@id='modal-register']/div[1]/form[1]/div[1]/div[5]/div[1]/input[1]"));
		Password.sendKeys("First@123");
		
		driver.findElement(By.xpath("//body/div[@id='modal-register']/div[1]/form[1]/div[2]/button[1]")).click();
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}

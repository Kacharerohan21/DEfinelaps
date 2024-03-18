package bhaane.Define_Labs;



import java.io.File;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Place_order {

	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("https://www.bhaane.com/tops");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	}

	
	@Test
	public void test_Place_Order() throws Exception {
		WebElement item1 = driver.findElement(By.xpath("//body/div[7]/div[2]/div[1]/div[1]/div[10]/div[1]/span[2]"));
		item1.click();
		driver.findElement(By.xpath("//body[1]/div[7]/div[2]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/label[3]/span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'add to bag')]")).click();

		WebElement Go_to_Cart = driver.findElement(By.xpath("//a[contains(text(),'go to cart')]"));
		Go_to_Cart.click();

		WebElement Checkout = driver.findElement(By.xpath("//button[contains(text(),'checkout')]"));
		Checkout.click();

		WebElement Email = driver.findElement(
				By.xpath("//body/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
		Email.sendKeys("aa@gmail.com");

		driver.findElement(By.xpath("//button[contains(text(),'continue')]")).click();

		WebElement State = driver.findElement(By.id("state"));
		Select sel = new Select(State);
		System.out.println("Select the value : Maharashtra");
		sel.selectByValue("Maharashtra");

		driver.findElement(By.xpath(
				"//body[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[3]/div[1]/input[1]"))
				.sendKeys("first");

		driver.findElement(By.xpath(
				"//body[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[4]/div[1]/input[1]"))
				.sendKeys("Last");

		driver.findElement(By.xpath(
				"//body[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[5]/div[1]/input[1]"))
				.sendKeys("Company");

		driver.findElement(By.xpath(
				"//body[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]"))
				.sendKeys("1234567890");

		driver.findElement(By.xpath(
				"//body[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[7]/div[1]/input[1]"))
				.sendKeys("Pune");

		driver.findElement(By.xpath(
				"//body[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[9]/div[1]/input[1]"))
				.sendKeys("Pune");

		driver.findElement(By.xpath(
				"//body[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[10]/div[1]/input[1]"))
				.sendKeys("ABC123");

		driver.findElement(By.xpath("//button[contains(text(),'DELIVER HERE')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'cash on delivery')]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'confirm order')]")).click();
		Thread.sleep(2000);
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("D:\\Automation\\Workspace\\Define_Labs\\src\\test\\java\\com\\DefineLabs\\testData\\Screenshot\\ss.jpg"));		
	
		
		driver.findElement(By.xpath("//a[contains(text(),'continue shopping')]")).click();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}

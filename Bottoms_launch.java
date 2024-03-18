package bhaane.Define_Labs;



import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bottoms_launch {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://www.bhaane.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
	}

}

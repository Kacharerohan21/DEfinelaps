package bhaane.Define_Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class A2_Launch_Bhaane_Com {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		// https://www.bhaane.com/tops
		driver = new ChromeDriver();
		//driver =new EdgeDriver();
		driver.get("https://www.bhaane.com/tops");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@Test
	public void test_Title() {
		String title = driver.getTitle();
		System.out.print("The correct Title is : " + title);
		Assert.assertEquals(title, "Shop Tops's Online | bhaane", "Shop Tops's Online | bhaane");

	}

	@Test
	public void test_Search() {
		WebElement Search = driver.findElement(By.xpath("//header/div[1]/div[1]/div[4]/ul[1]/li[4]/div[1]/img[1]"));
		Search.click();
		WebElement Search_Box = driver.findElement(By.name("q"));
		Search_Box.sendKeys("velha shirt");
		Search_Box.sendKeys(Keys.ENTER);

	}

	@Test
	public void test_Mini_Cart() {
		WebElement Mini_cart = driver.findElement(By.xpath("//header/div[1]/div[1]/div[4]/ul[1]/li[3]/img[1]"));
		Mini_cart.click();
	}

	@Test
	public void test_Account() {
		WebElement Account = driver.findElement(By.xpath("//li[contains(text(),'account')]"));
		Account.click();
	}

	@Test
	public void test_Gender() {
		WebElement Gender = driver.findElement(By.xpath("//span[contains(text(),'gender >')]"));
		Gender.click();

		driver.findElement(
				By.xpath("//header/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/ul[1]/li[3]/div[1]/label[2]/input[1]"))
				.click();
		driver.findElement(
				By.xpath("//header/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/ul[1]/li[3]/div[1]/label[1]/input[1]"))
				.click();
	}

	//
	@Test
	public void test_Size() {
		WebElement Size = driver.findElement(By.xpath("//span[contains(text(),'size >')]"));
		Size.click();

	}

	@Test
	public void test_Price() {
		WebElement Price = driver.findElement(By.xpath("	//span[contains(text(),'price >')]\r\n"));
		Price.click();

		driver.findElement(By.xpath("//span[contains(text(),'low - high')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'high - low')]")).click();

	}

	@Test
	public void tes_bottoms() {
		WebElement bottoms = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]"));
		bottoms.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,5000)");

	}

	@Test
	public void tes_dresses() {
		WebElement dresses = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]"));
		dresses.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,5000)");
	}

	@Test
	public void tes_Other() {
		WebElement Other = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/span[1]"));
		Other.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,5000)");

	}

	@Test
	public void tes_fams() {
		WebElement fams = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/ul[1]/li[5]"));
		fams.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,5000)");

		driver.findElement(By.className("content-btn")).click();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}

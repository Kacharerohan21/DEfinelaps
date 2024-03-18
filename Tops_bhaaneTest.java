package bhaane.Define_Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Tops_bhaaneTest {

	WebDriver driver= new ChromeDriver();
	
	@Before
	public void setUp() throws Exception {
		driver.get("https://www.bhaane.com/tops");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));		
	}


	@Test
	public void test() {
		WebElement Tops= driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
		Tops.click();
	}

	@Test
	public void tes_tees() {
		WebElement tees=driver.findElement(By.xpath("//a[contains(text(),'tees')]"));
		tees.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,5000)");
		
		driver.findElement(By.className("content-btn")).click();
	}
	
	
	@Test
	public void test_blouses() throws Exception{
		WebElement Blouses=driver.findElement(By.xpath("//a[contains(text(),'blouses')]"));
		Blouses.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");
	
		driver.findElement(By.xpath("//body/div[7]/footer[1]/div[1]/div[1]/h3[1]")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void test_shirts() throws Exception{
		WebElement Shirts=driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]"));
		Shirts.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");
	
		driver.findElement(By.xpath("//body/div[7]/footer[1]/div[1]/div[1]/h3[1]")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void test_sweatshirts() throws Exception{
		WebElement Sweatshirts=driver.findElement(By.xpath("//a[contains(text(),'sweatshirts')]"));
		Sweatshirts.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");
	
		driver.findElement(By.xpath("//body/div[7]/footer[1]/div[1]/div[1]/h3[1]")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void test_jackets() throws Exception{
		WebElement Blouses=driver.findElement(By.xpath("//a[contains(text(),'jackets')]"));
		Blouses.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");
	
		driver.findElement(By.xpath("//body/div[7]/footer[1]/div[1]/div[1]/h3[1]")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void test_sweater() throws Exception{
		WebElement Blouses=driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/ul[1]/li[6]"));
		Blouses.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");
	
		driver.findElement(By.xpath("//body/div[7]/footer[1]/div[1]/div[1]/h3[1]")).click();
		Thread.sleep(2000);
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}

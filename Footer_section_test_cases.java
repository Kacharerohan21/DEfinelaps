package bhaane.Define_Labs;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Footer_section_test_cases {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.bhaane.com/tops");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Thread.sleep(2000);
		//((JavascriptExecutor) driver).executeScript("scroll(0,50000)");
		WebElement element =driver.findElement(By.xpath("//a[contains(text(),'store')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
 
	}

	@Test
	public void test_subscribe() {
		WebElement subscribe=driver.findElement(By.xpath("//a[contains(text(),'subscribe')]"));
		subscribe.click();
		
		try {
			FileInputStream ExcelFile = new FileInputStream(
					new File("D:\\Automation\\Workspace\\Define_Labs\\src\\test\\java\\com\\DefineLabs\\testData\\ExcelFile.xlsx"));
			Workbook workbook = WorkbookFactory.create(ExcelFile);
			Sheet sheet = workbook.getSheetAt(0);
			for (Row row : sheet) {
				String data1 = row.getCell(0).getStringCellValue();
				String data2 = row.getCell(1).getStringCellValue();

				WebElement inputName = driver.findElement(By.name("name"));
				inputName.sendKeys(data1);

				WebElement inputEmail_ID = driver.findElement(By.name("email"));
				inputEmail_ID.sendKeys(data2);

				driver.findElement(By.name("btn btn-primary btn-lg mt-xl lg")).click();

				inputName.clear();
				inputEmail_ID.clear();
				Thread.sleep(2000);
			}
			workbook.close();
			ExcelFile.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	
	}
	
	@Test
	public void tes_shipping() throws Exception {
		WebElement shipping=driver.findElement(By.xpath("//a[contains(text(),'shipping')]"));
		shipping.click();
		((JavascriptExecutor) driver).executeScript("scroll(0,5000)");
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("D:\\Automation\\Workspace\\Define_Labs\\src\\test\\java\\com\\DefineLabs\\testData\\Screenshot"));		
	}
	

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}

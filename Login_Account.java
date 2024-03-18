package bhaane.Define_Labs;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Account {

	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("https://www.bhaane.com/tops");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}


	@Test
	public void test() {
		WebElement Account = driver.findElement(By.xpath("//li[contains(text(),'account')]"));
		Account.click();

		try {
			FileInputStream ExcelFile = new FileInputStream(new File(
					"D:\\Automation\\Workspace\\Define_Labs\\src\\test\\java\\com\\DefineLabs\\testData\\ExcelFile.xlsx"));
			Workbook workbook = WorkbookFactory.create(ExcelFile);
			Sheet sheet = workbook.getSheetAt(0);
			for (Row row : sheet) {
				String data1 = row.getCell(0).getStringCellValue();
				String data2 = row.getCell(1).getStringCellValue();

				WebElement inputEmail = driver.findElement(By.xpath("//body/div[@id='modal-login']/div[1]/form[1]/div[1]/input[1]"));
				inputEmail.sendKeys(data1);
				WebElement inputPassword = driver.findElement(By.xpath("//body/div[@id='modal-login']/div[1]/form[1]/div[2]/input[1]"));
				inputPassword.sendKeys(data2);

				WebElement Submit = driver
						.findElement(By.xpath("//body/div[@id='modal-login']/div[1]/form[1]/div[4]/button[1]"));
				Submit.click();

				inputEmail.clear();
				inputPassword.clear();
				Thread.sleep(2000);
			}
			workbook.close();
			ExcelFile.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}

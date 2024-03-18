package bhaane.Define_Labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_Launch_bhaane {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bhaane.com/");
		driver.quit();
	}

}

package com.DefineLabs.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_found {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
		
		WebElement Login=driver.findElement(By.xpath("//body/div[@id='modal-register']/div[1]/form[1]/div[2]/div[1]"));
		
		WebElement Email=driver.findElement(By.name("email"));
		
		WebElement Password=driver.findElement(By.name("password"));
		
		WebElement Submit= driver.findElement(By.className("btn btn-primary"));
		
		WebElement SignUp=driver.findElement(By.xpath("//div[contains(text(),'sign up >')]"));
		
		WebElement firstNameElement=driver.findElement(By.name("first_name"));
		
		WebElement LastNameElement=driver.findElement(By.name("last_name"));
		
		WebElement SignUp_Email=driver.findElement(By.xpath("//body/div[@id='modal-register']/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]"));
		
		WebElement Mobile=driver.findElement(By.name("mobile"));
		
		WebElement SignUp_Password=driver.findElement(By.name("password"));
		
		
		
		 
	}

}

package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDay3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		driver.findElement(By.linkText("My Info")).click();
		driver.findElement(By.linkText("Emergency Contacts")).click();
		driver.findElement(By.id("btnAddContact")).click();
		driver.findElement(By.id("emgcontacts_name")).sendKeys("Rajashree");
		driver.findElement(By.id("emgcontacts_relationship")).sendKeys("Mother");
		driver.findElement(By.id("emgcontacts_homePhone")).sendKeys("080 25210149");
		driver.findElement(By.id("emgcontacts_mobilePhone")).sendKeys("+91 8660527539");
		driver.findElement(By.id("emgcontacts_workPhone")).sendKeys("+91 9535174193");
		driver.findElement(By.id("btnSaveEContact")).click();

	}

}

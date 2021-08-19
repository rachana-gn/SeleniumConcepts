package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCPractiseDay4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//switch to frame
		//driver.switchTo().frame(0);--index
		driver.switchTo().frame("login_page");//name or id
		
		//using webelement
	//driver.switchTo().frame(driver.findElement(By.xpath("//frame[contains(@src,'RSLogin')]")));
		//driver.switchTo().frame(driver.findElement(By.tagName("frame")));
	
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		
		driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
					
		//come to main HTML
		driver.switchTo().defaultContent();
		
		//for nested frame
	//	driver.switchTo().parentFrame();
		

	}

}

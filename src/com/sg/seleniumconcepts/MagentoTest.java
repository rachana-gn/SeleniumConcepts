package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://magento.com/");//waits until page loads and no time limit
		
//		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
//		System.out.println(driver.getCurrentUrl());
//		
		
		
		//Thread.sleep(5000);//wait for 5 secs-- not recommended
		
		driver.findElement(By.id("gnav_557")).click();//present and visisble --takes only 500ms(0.5s)
		
		driver.findElement(By.id("email")).sendKeys("balaji0017@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("balaji@12345");
		
		driver.findElement(By.id("send2")).click();
		
		//wait condition to make sure dashboard is loaded
		//class---> WedDrivererWait
		//non-static method-- until
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Log Out")));
		
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
		//get the id and print
		String id= driver.findElement(By.xpath("//span[contains(text(),'ID')]")).getText();
		System.out.println(id);
		
		driver.findElement(By.linkText("Log Out")).click();
		
		
		
		

	}

}

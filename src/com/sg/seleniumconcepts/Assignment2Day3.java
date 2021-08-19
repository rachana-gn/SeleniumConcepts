package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Day3 {

	public static void main(String[] args) throws InterruptedException {
	
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.get("https://www.medibuddy.in/");
				Thread.sleep(15000);
				
				driver.findElement(By.id("wzrk-cancel")).click();
			//	driver.findElement(By.xpath("//button[text()='Not Now']")).click();
				driver.findElement(By.linkText("Signup")).click();
			//	above step using xpath
			//	driver.findElement(By.xpath("//a[@ng-click='userSignin(true)']")).click();
				driver.findElement(By.id("mobile")).sendKeys("123");
				driver.findElement(By.id("name")).sendKeys("123");
				driver.findElement(By.id("email")).sendKeys("abc@xyz.com");
				driver.findElement(By.xpath("//button[text()='Sign up']")).click();
			//	driver.findElement(By.xpath("((//button[@type='submit'])[1])")).click();
			//	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
//			WebElement error = driver.findElement(By.id("signuperr"));
//			String message = error.getText();
//			System.out.println(message);
				
//				Thread.sleep(3000);
//				
//			String error= driver.findElement(By.id("signuperr")).getText();
//			System.out.println(error);
			
		// instead of using thread.sleep, use xpath with contains text. 
		//	As we are using id, it will take some time.. so use the xpath of the error message	
			
			String error= driver.findElement(By.xpath("//div[contains(text(),'INVALID')]")).getText();
			System.out.println(error);
			
			
				
				
				
				


	}

}

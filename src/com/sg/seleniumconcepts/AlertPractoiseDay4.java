package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractoiseDay4 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		Alert alert = driver.switchTo().alert();
		
		//to get alert text
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		//prompt box
		driver.switchTo().alert().sendKeys("hello");//does not work in chrome. we should use robot class or autoit
		driver.switchTo().alert().accept();
		
		
		
		driver.findElement(By.id(alertText)).sendKeys("send in proper format");

	}

}

package com.sg.seleniumconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5Class_WebTableTest4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
	
		//check the checkbox for a particular person and stop the iteration
		
		for (int p=1; p<=6;p++)
		{
			int rowCount = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
		
			for (int i=1; i<=rowCount; i++)
			{
				String name= driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
				System.out.println(name);
				if(name.equals("Michael Bruce")) {
					driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[1]")).click();
					break;
				
				}
			}
			
		//if next button is enabled only then click, else stop
			
			if(driver.findElement(By.id("example_next")).isEnabled())
			{
				driver.findElement(By.id("example_next")).click();
			}
		}
		
			

	}

}

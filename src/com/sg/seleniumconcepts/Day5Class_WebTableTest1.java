package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5Class_WebTableTest1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
//		String name1= driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]")).getText();
//		System.out.println(name1);
//		
//		String name2= driver.findElement(By.xpath("//table[@id='example']/tbody/tr[2]/td[2]")).getText();
//		System.out.println(name2);
		
		//we can use for loop
		
		for (int i=1; i<=10; i++)
		{
			String name= driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(name);
			
			if(name.equals("Brenden Wagner"))
			{
				driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]")).click();
				break;
				}
			}
		
		//to get the row count use findElements
		

	}

}

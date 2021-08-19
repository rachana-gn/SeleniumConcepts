package com.sg.seleniumconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5Class_WebElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int linkCount =elements.size();
		
		System.out.println(linkCount);
		
//		WebElement ele =elements.get(0);
//		ele.click();
		
//		WebElement ele =elements.get(1);
//		String link = ele.getAttribute("href");
//		System.out.println(link);
//		String text = ele.getText();
//		System.out.println(text);
		
		//above code using for loop
//		for(int i=0; i<linkCount; i++)
//		{
//			WebElement ele =elements.get(i);
//			String link = ele.getAttribute("href");
//			System.out.println(link);
//			String text = ele.getText();
//			System.out.println(text);
//			
//		}
		
		//above code without storing
//		for(int i=0; i<linkCount; i++)
//			{
//				String link =elements.get(i).getAttribute("href");
//				System.out.println(link);
//				
//				String text = elements.get(i).getText();
//				System.out.println(text);
//				
//			}
		
		//clicking on an element and to handle staleException
		
		for(int i=0; i<linkCount; i++)
		{
			String link =elements.get(i).getAttribute("href");
			System.out.println(link);
			
			String text = elements.get(i).getText();
			System.out.println(text);
			
			if (text.equalsIgnoreCase("images"))
			{
				elements.get(i).click();
				break;//to handle staleException
			}
			
		}
		

	}

}

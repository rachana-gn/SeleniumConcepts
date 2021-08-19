package com.sg.seleniumconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5ClassExample_Multipletabs1  {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//img[@class='appClose']")).click();
		driver.findElement(By.linkText("APPLY FOR CREDIT CARD")).click();
		
		//get session id to switch to different tabs
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		//Set<String>  windows = driver.getWindowHandles();
		//ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		
		//to print the session id of both the tabs
//		System.out.println(windows.get(0));
//		System.out.println(windows.get(1));
		
		driver.switchTo().window(windows.get(1));
		
		//to indentify specific tab
		
		

	}

}

package com.sg.seleniumconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5ClassExample2_Multipletabs2or3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.naukri.com");
		
		//List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String win: windows)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.equals("Genpact"))	
			{
				break;//will break the forloop
			}
			
			System.out.println("--------------");			
		}
		//do the operations on Genpact window
		driver.close();
	}

}

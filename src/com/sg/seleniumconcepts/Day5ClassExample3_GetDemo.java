package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5ClassExample3_GetDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		
		String text = driver.findElement(By.partialLinkText("Acknowledgements")).getText();
		System.out.println(text);
		
		String tagname = driver.findElement(By.partialLinkText("Acknowledgements")).getTagName();
		System.out.println(tagname);
		
		String href = driver.findElement(By.partialLinkText("Acknowledgements")).getAttribute("href");
		System.out.println(href);
		
		String placeholderUser = driver.findElement(By.id("authUser")).getAttribute("placeholder");
		System.out.println(placeholderUser);



	}

}

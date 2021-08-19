package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenEMRClassPracticeDay4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		
        driver.findElement(By.id("authUser")).sendKeys("admin");
        driver.findElement(By.id("clearPass")).sendKeys("pass");
        
        Select selectLang = new Select(driver.findElement(By.name("languageChoice")));
        //selectLang.selectByIndex(2);
        selectLang.selectByVisibleText("English (Indian)");
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        //new Select(driver.findElement(By.name("languageChoice")).selectByVisibleText("English (Indian)"));
        
        // can be done using webelement also
        
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[text()='Flow Board']")));
        
        
        System.out.println(driver.getTitle());
        
        //mouse hover activity on billy smith to find logout
        
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//span[@data-bind='text:fname']"))).perform();
        
//      action.click();
//      action.clickAndHold();
//      action.build().perform();//when more than one action use build
        
        driver.findElement(By.xpath("//li[text()='Logout']")).click();
        
	

	}

}

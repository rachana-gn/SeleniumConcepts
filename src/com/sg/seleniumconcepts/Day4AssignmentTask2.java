package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day4AssignmentTask2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		
        driver.findElement(By.id("authUser")).sendKeys("admin");
        driver.findElement(By.id("clearPass")).sendKeys("pass");
        
        Select selectLang = new Select(driver.findElement(By.name("languageChoice")));
        selectLang.selectByVisibleText("English (Indian)");
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[text()='Patient/Client']"))).perform();
        
        driver.findElement(By.xpath("(//div[text()='Patients'])[1]")).click();
        
        driver.switchTo().frame("fin");
        driver.findElement(By.id("create_patient_btn1")).click();
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame("pat");
        Select prefix = new Select(driver.findElement(By.name("form_title")));
        prefix.selectByVisibleText("Ms.");
        
        driver.findElement(By.id("form_fname")).sendKeys("Daisy3");
        driver.findElement(By.id("form_lname")).sendKeys("Test3");
        driver.findElement(By.id("form_DOB")).sendKeys("2021-08-14");
        
        
        Actions genderdropdown = new Actions(driver);
        genderdropdown.moveToElement(driver.findElement(By.id("form_sex"))).click().perform();
        
        Select gender=new Select(driver.findElement(By.id("form_sex")));
        gender.selectByVisibleText("Female");
        //driver.findElement(By.xpath("//select[@name='form_sex']/option[2]")).click();
        driver.findElement(By.id("create")).click();
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='modalframe']")));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
        driver.switchTo().defaultContent();
        
        
        WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.alertIsPresent());
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("closeDlgIframe")).click();
		
		String patientname= driver.findElement(By.className("ptName")).getText();
		System.out.println(patientname);
		
		driver.quit();
        
      

	}

}

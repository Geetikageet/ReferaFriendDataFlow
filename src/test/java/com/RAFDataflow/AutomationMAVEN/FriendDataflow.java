package com.RAFDataflow.AutomationMAVEN;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class FriendDataflow {
	public WebDriver driver;
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/86a771ecac336b0f9baa?fh=2be68b2d120bf5b13455b7ae9b2a020d617fe042");
		driver.findElement(By.id("429")).click();
		driver.findElement(By.id("429")).sendKeys("Geetika");
		driver.findElement(By.id("430")).click();
		driver.findElement(By.id("430")).sendKeys("S");
		driver.findElement(By.id("427")).click();
		driver.findElement(By.id("427")).sendKeys("sumeet.verma1989@gmail.com");
		driver.findElement(By.cssSelector("#submitButton > div")).click();
		
	
		
		
	}
	
}

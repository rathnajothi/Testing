package com.accenture.testscripts.TestMeScripts;

import junit.framework.Test;
import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.annotations.Test;

public class AppTest extends TestCase{
	
	public void testHome() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8085/HelloWorld.war");
		WebElement text = driver.findElement(By.xpath("html/body/h2"));
		//Assert.assertEquals(driver.getTitle(), "Welcome to Orchestrating with Jenkins training!!");
		System.out.println("Test Passed");
String title=driver.getTitle();
  System.out.println("title of page=" + title);
  Assert.assertEquals(title,"Selenium - Web Browser Automation");
	}
}
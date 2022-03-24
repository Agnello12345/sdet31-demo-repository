package com.crm.vtiger.organization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerLoginTest  
{
	WebDriver driver=null;
String Browser=System.getProperty("browser");
String url=System.getProperty("url");
String un=System.getProperty("username");
String pwd=System.getProperty("password");
	@Test
	public void loginTest()
	{		
		if(Browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	 else if (Browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
	}
	 else {
		driver = new ChromeDriver();
}
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		
		WebElement element = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
       Actions act=new Actions(driver);
       act.moveToElement(element).perform();
       driver.findElement(By.linkText("Sign Out")).click();
	}
}

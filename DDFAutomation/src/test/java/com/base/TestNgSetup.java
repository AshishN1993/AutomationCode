package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgSetup {
	
	protected WebDriver driver;
	
	
	public void setup() throws IOException{
		
		
		FileInputStream fis = new FileInputStream("D:\\workspace\\DDFAutomation\\Resource\\data\\data.properties");
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String url =prop.getProperty("URL");
		
		
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\DDFAutomation\\Resource\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	
	    driver.get(url);
	    
	    driver.findElement(By.id("email")).sendKeys("nehareashish@ymail.com");
	    driver.findElement(By.id("pass")).sendKeys("ashpasswordish");
	    driver.findElement(By.id("loginbutton")).click();
	}
	

}

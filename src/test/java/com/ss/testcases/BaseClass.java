package com.ss.testcases;

import org.testng.annotations.AfterMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.ss.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void setup() throws IOException {
		
		ReadConfig rc = new ReadConfig();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(rc.getBaseUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
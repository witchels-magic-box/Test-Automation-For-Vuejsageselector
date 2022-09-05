package com.bd.Vuecodetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicDriver {
	public static WebDriver drive;
	
	@BeforeSuite
	public void Start() {
		WebDriverManager.chromedriver().setup();
		drive = new ChromeDriver();
	}
	
	@AfterSuite
	public void Close() {
		drive.quit();
	}

}

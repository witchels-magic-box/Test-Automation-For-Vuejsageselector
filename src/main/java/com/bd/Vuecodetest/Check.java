package com.bd.Vuecodetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Check extends BasicDriver {
	public static String baseurl = "http://127.0.0.1:5173/";
	
	@Test (priority = 0)
	public void openUrl() throws InterruptedException {
		drive.get(baseurl);
		drive.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test (priority = 1)
	public void Test() throws InterruptedException {
		WebElement search = drive.findElement(By.id("input-number"));
		WebElement display = drive.findElement(By.xpath("/html[1]/body[1]/div[1]/h2[1]"));
		search.click();
		search.sendKeys("55");
		String str = display.getText();
		if (str.equals("Pass"))
		{
			System.out.println("Input for pass condition : Test is passed");
		}
		
		else
		{
			System.out.println("Input for pass condition : Test is Failed");
		}
//		Assert.assertTrue(flag, "Page title is not matching with expected");
		Thread.sleep(5000);
	}
	@Test (priority = 2)
	public void Test1() throws InterruptedException {
		WebElement search = drive.findElement(By.id("input-number"));
		WebElement display = drive.findElement(By.xpath("/html[1]/body[1]/div[1]/h2[1]"));
		search.click();
		search.clear();
		search.sendKeys("5");
		String str = display.getText();
		if (str.equals("Fail"))
		{
			System.out.println("Input for Failed condition: Test is passed");
		}
		else
		{
			System.out.println("Input for Failed condition : Test is Failed");
		}
		
//		Assert.assertTrue(flag, "Page title is not matching with expected");
		Thread.sleep(5000);
	}
//	@Test (priority = 2)
//	public void Testhtml() throws InterruptedException {
//		WebElement searchIcon = drive.findElement(By.id("learntocode_searchbtn"));
//		searchIcon.click();
//		Thread.sleep(5000);
//		
//		
//	}
}

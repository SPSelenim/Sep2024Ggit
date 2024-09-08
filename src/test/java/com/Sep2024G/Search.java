package com.Sep2024G;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {
//4:21 pm
public WebDriver driver=null;
	
@BeforeClass
	public void tearUp()
	{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
	}
	
	
@Test
  public void f() {
  
	try
	{
		Thread.sleep(2000);
		driver.manage().window().maximize();
		POMSearch ss=new POMSearch(driver);
		ss.SendFName("xxxx");
		ss.SendLName("yyy");
		ss.clickOnQA();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}


@AfterClass
public void tearDown()
{
	driver.quit();
}



}

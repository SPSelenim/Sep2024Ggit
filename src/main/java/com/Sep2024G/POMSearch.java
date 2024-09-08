package com.Sep2024G;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMSearch {

	public WebDriver driver = null;
	public String FName = "fname";
	public String LName = "lname";
	public String QAm = "//a[@name='QA']";

	public POMSearch(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFName() {
		WebElement ele;
		ele = driver.findElement(By.id(FName));
		return ele;
	}

	public WebElement getLName() {
		WebElement ele;
		ele = driver.findElement(By.id(LName));
		return ele;
	}

	public WebElement getQA() {
		WebElement ele;
		ele = driver.findElement(By.xpath(QAm));
		return ele;
	}

	public void SendFName(String myF) {
		getFName().sendKeys(myF);
	}

	public void SendLName(String myL) {
		try {
			getLName().sendKeys(myL);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void clickOnQA() {
		
		try
		{
		getQA().click();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
}

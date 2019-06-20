package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonMethods;

public class TestCase1 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * TC 1: Verify element is present Open chrome browser Go to
		 * “https://the-internet.herokuapp.com/” Click on “Click on the “Dynamic
		 * Loading” link Click on “Example 1...” and click on “Start” Verify element
		 * with text “Hello World!” is displayed Close the browser
		 */
		String url="https://the-internet.herokuapp.com";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
		driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#finish")));
		WebElement el=driver.findElement(By.cssSelector("div#finish"));
		//boolean flag=el.isDisplayed();
		if (el.isDisplayed()) {
			System.out.println("The element is presemnt");
		}else {
			System.out.println("The element is not present");
		}
		driver.close();
		

	}
	

}

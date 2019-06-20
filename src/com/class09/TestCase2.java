package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonMethods;

public class TestCase2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 2: Verify element is clickable1.Open chrome browser2.Go to
		 * “https://the-internet.herokuapp.com/”3.Click on “Click on the “Dynamic
		 * Controls” link4.Select checkbox and click Remove5.Click on Add button and
		 * verify “It's back!” text is displayed6.Close the browser
		 */
		String url="https://the-internet.herokuapp.com";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		WebElement el=driver.findElement(By.id("message"));
		if(el.isDisplayed()) {
			String text="It's back!";
			System.out.println("The text "+text+" is displayed");
		}else {
			System.out.println("The text is not displayed");
		}
		Thread.sleep(3000);
		//driver.close();
		
		
	}

}

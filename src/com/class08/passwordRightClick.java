package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.CommonMethods;

public class passwordRightClick extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Task for contextClick // Navigate to https://www.saucedemo.com // Right click
		 * on the password textbox // Close the browser
		 * 
		 */
		CommonMethods.setUpDriver("chrome", "https://www.saucedemo.com/");
		WebElement element = driver.findElement(By.cssSelector("input#password"));
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
		Thread.sleep(3000);

	}

}

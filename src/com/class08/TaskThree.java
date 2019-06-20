package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.CommonMethods;

public class TaskThree extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * Ahead to http://uitestpractice.com/Students/Index Click on the Actions Click
		 * and hold on 1,2,3,4 boxes Close the browser
		 */
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		WebElement one=driver.findElement(By.xpath("//li[text()='1']"));
		WebElement Two=driver.findElement(By.xpath("//li[text()='1']"));
		WebElement Three=driver.findElement(By.xpath("//li[text()='1']"));
		WebElement Four=driver.findElement(By.xpath("//li[text()='1']"));
		Actions action =new Actions(driver);
		
		action.moveToElement(one).clickAndHold().moveToElement(Two).clickAndHold().moveToElement(Three).clickAndHold().moveToElement(Four).build().perform();
		

	}

}

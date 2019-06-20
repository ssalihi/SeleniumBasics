package com.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.CommonMethods;

public class TaskOne extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Task One Ahead to http://uitestpractice.com/Students/Index Click on the
		 * Actions Click on the click me ! Handle the alert and click okay Double Click
		 * Double Click Me ! Handle the alert and click okay Close the browser
		 * 
		 */
     CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
 driver.findElement(By.xpath("//a[text()='Actions']")).click();
  
 WebElement element=driver.findElement(By.xpath("//button[text()='Click Me !']"));
 Actions action=new Actions(driver);
 action.moveToElement(element).click().perform();
  Alert alert=driver.switchTo().alert();
  alert.accept();
  WebElement dc=driver.findElement(By.xpath("//button[text()='Double Click Me !']"));
  action.doubleClick(dc).perform();
  Alert alerttwo=driver.switchTo().alert();
  alerttwo.accept();
  Thread.sleep(2000);
  driver.close();
  
  
   
	}

}

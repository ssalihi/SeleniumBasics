package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;

public class iframe2 extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		
		//driver.switchTo().frame("iframe_a");
				//WebElement ele=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
				//driver.switchTo().frame(ele);
				driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input#name")).sendKeys("salihi");

	}

}

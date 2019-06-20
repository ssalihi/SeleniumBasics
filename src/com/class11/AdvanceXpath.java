package com.class11;

import org.openqa.selenium.By;

import Utils.CommonMethods;

public class AdvanceXpath extends CommonMethods {

	public static void main(String[] args) {
		
		////div[@id='divUsername']/input
		//setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
		//driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("admin123");
		//driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
////span[text()='Password']/preceding-sibling::input
		setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']/following-sibling::span")).sendKeys("Admin");
		driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	}

}

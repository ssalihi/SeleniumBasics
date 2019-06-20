package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("5712447013");
		//driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Huda@143");
		//driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
		driver.findElement(By.xpath("//input[starts-with(@type,'email')]")).sendKeys("5712447013");
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("Huda@143");
		driver.findElement(By.xpath("//input[starts-with(@value,'Lo')]")).click();
		driver.close();

	}

}

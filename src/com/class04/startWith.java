package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class startWith {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Username')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[starts-with(@class,'btn')]")).click();
		driver.close();

	}

}

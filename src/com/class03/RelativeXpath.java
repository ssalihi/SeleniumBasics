package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
		//driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='text']")).sendKeys("standard_user");
        driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='submit']")).click();
	}

}

package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("sekandersalihi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sekandersalihi");
	//	driver.findElement(By.partialLinkText("Forgot")).click();
		//driver.navigate().back();
		//driver.findElement(By.id("pass")).sendKeys("sekandersalihi");
		driver.findElement(By.id("u_0_2")).click();

	}

}

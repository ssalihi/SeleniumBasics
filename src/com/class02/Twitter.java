package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com");
		//System.out.println(driver.getTitle());
		//String title=driver.getTitle();
		//if (title.equalsIgnoreCase("Twitter. It's what's happening.")) {
			//System.out.println("This is right web");
		//}else {
			System.out.println("This is wrong");
		//}
			driver.findElement(By.className("/login")).click();
		driver.findElement(By.name("clearfix field")).sendKeys("engsalihi@gmail.com");
		driver.findElement(By.name("js-password-type")).sendKeys("Neda@143");
		driver.findElement(By.className("submit")).click();
		

	}

}

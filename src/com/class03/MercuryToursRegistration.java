package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryToursRegistration {

	public static void main(String[] args) {
		/*
		 * TC 2: Mercury Tours Registration:
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered
		 */
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Afghan");
		driver.findElement(By.name("lastName")).sendKeys("Loy");
		driver.findElement(By.name("phone")).sendKeys("38373738");
		driver.findElement(By.id("userName")).sendKeys("sekandersalihi@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("123 str");
		driver.findElement(By.name("city")).sendKeys("woodbridge");
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("22913");
		driver.findElement(By.name("country")).sendKeys("UNITED STATE");
		driver.findElement(By.id("email")).sendKeys("ABCD");
		driver.findElement(By.name("password")).sendKeys("abcd@143");
		driver.findElement(By.name("confirmPassword")).sendKeys("abcd@143");
		driver.findElement(By.name("register")).click();

	}

}

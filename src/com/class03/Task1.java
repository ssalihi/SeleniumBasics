package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
	//driver.findElement(By.xpath("//a[@href='<a href='mercuryregister.php']")).click();
	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("abcded");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("abcd@143");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("474737837");
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sekandersalihi@gmail.com");
	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("1234 street");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Sterling");
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys("VA");
	driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("22193");
	//driver.findElement(By.xpath("//input[@name='country']")).sendKeys("UNITED STATE");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("java123");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Jdk@143");
	driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Jdk@143");
	driver.findElement(By.xpath("//input[@name='register']")).click();
	
}
}

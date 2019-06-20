package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask1 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: JavaScript alert text verification Open chrome browser Go to
		 * “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html” Verify
		 * alert box with text “I am an alert box!” is present confirm box with text
		 * “Press a button!” is present prompt box with text “Please enter your name” is
		 * present Quit browser
		 */
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		
		Alert alert = driver.switchTo().alert();
		String AlertText = alert.getText();
		if(AlertText.equalsIgnoreCase("I am an alert box!")) {
			Thread.sleep(3000);
			alert.accept();
		}
		
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Alert alert2 = driver.switchTo().alert();
		String AlertText2 = alert2.getText();
		if(AlertText2.equalsIgnoreCase("Press a button!")) {
			Thread.sleep(3000);
			alert.accept();
		}
		
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Alert alert3 = driver.switchTo().alert();
		String AlertText3 = alert3.getText();
		if(AlertText3.equalsIgnoreCase("Please enter your name")) {
			Thread.sleep(3000);
			alert.accept();
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
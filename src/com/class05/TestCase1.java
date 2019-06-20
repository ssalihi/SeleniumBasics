package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	public static String userName="standard_user";
	public static String password="secret_sauce";
	private static String product;

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Swag Labs Positive login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter valid username and valid password and click login
Verify robot icon is displayed
Verify “Products” text is available next to the robot icon
		 */
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement username=driver.findElement(By.cssSelector("input[id*='user-name']"));
		username.sendKeys("Salihi");
		Thread.sleep(1000);
		 username.clear();
		 username.sendKeys(userName);
		 WebElement pass=driver.findElement(By.cssSelector("input[id^='pass']"));
		 pass.sendKeys(password);
		 driver.findElement(By.cssSelector("input[class$='_action']")).click();
		boolean isDisplayed= driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		if (isDisplayed) {
			System.out.println("Logo is displayed");
			
		}else {
			System.out.println("logo is not displayed");
		}
		// verify product text
		WebElement product=driver.findElement(By.cssSelector("div.product_label"));
		boolean displayP=product.isDisplayed();
		String productText=product.getText();
		String expectedText="Products";
		if (displayP && product.getText().equals(expectedText)) {
			System.out.println("ELement is displayed and text is "+productText);
		}else {
			System.out.println("ELement is not displayed the text of "+productText);
		}
		driver.close();
	
			
		

	}

}

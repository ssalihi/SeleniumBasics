package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		/*TC 2: Swag Labs Negative login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter invalid username and password and click login
Verify error message contains: “Username and password do not match any user in this service”
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("stander");
		driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("password");
		driver.findElement(By.xpath("//input[starts-with(@value,'LOGI')]")).click();
		
		WebElement message= driver.findElement(By.xpath("//h3[@data-test='error']"));
		String value=message.getText();
		System.out.println(value);
		if (value.contains("Username and password do not match any user in this service")) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
	}

}

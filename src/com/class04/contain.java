package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class contain {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//1.contains()
		//TagName[contains(@attributes,'value')]
		//Example:  input[contains(@name,'userName')]
		//tagName[text(),'text']
		//example: input[text(), 'Share With Facebook']
		//tagNAme[contains(text(),'text']
		// example: input[contains(text(),'share with facebook']
		System.out.println("---------------------------------start-with()");
		/*  //tagName[start-with(@attibutes,'value')]
		 * 
		 */
     driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("standard_user");
     driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("secret_sauce");
     driver.findElement(By.xpath("//input[contains(@value,'LOGIN')]")).click();
	}

}

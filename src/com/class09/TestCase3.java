package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.CommonMethods;

public class TestCase3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Open chrome browser
		 * 2.Go to “https://the-internet.herokuapp.com/”
		 * 3.Click on “Click on the “Dynamic Controls” link
		 * 4.Click on enable button
		 * 5.Enter “Hello” and verify text is entered successfully
		 * 6.Close the browser
		 */
	      String url="https://the-internet.herokuapp.com";
         setUpDriver("chrome", url);
		//String text="Dyanmic Controls";
//		//driver.findElement(By.linkText(text));
		driver.findElement(By.xpath("//a[@href='/dynamic_controls']")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
//		//1 way
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
//		
//		String textToEnter="Sunday";
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textToEnter);
//		
//		String returnedText=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
//		//compare entered and returned text
//		if (returnedText.equals(textToEnter)) {
//			System.out.println("Text is entered");
//		}else {
//			System.out.println("Text "+textToEnter+" is NOT entered");
//		}
		
		//2way
		//identify the element and then pass it to the exp conditions
		WebElement el=driver.findElement(By.xpath("//input[@type='text']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(el));
		
		String textToEnter="Hi";
		el.sendKeys(textToEnter);
		
		String value=el.getAttribute("value");
		System.out.println(value);
		
		Thread.sleep(5000);
		driver.quit();
	}
}


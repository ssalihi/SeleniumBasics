package com.class10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;

import Utils.CommonMethods;

public class FluentWaitDemo extends CommonMethods{

	public static void main(String[] args) {
		 String url="https://the-internet.herokuapp.com";
         setUpDriver("chrome", url);
       String text="Dyanmic Controls";
		driver.findElement(By.linkText(text)).click();
		
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(3, TimeUnit.SECONDS);
		wait.pollingEvery(1, TimeUnit.SECONDS);
		//wait.ignoring(NoSuchElementException.class);
		
		String buttonXpath="//button[text()='Enable']";
		driver.findElement(By.xpath(buttonXpath)).click();

	}

}

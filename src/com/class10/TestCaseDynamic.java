package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;

public class TestCaseDynamic extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * TC 1: Table headers and rows verification
		 * 
		 * Open chrome browser Go to
		 * “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.
		 * aspx” Login to the application Verify customer “Susan McLaren” is present in
		 * the table Click on customer details Update customers last name Verify updated
		 * customers name is displayed in table Close browser
		 * 
		 */
		String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
		setUpDriver("chrome", url);
		
		//login to the application
		driver.findElement(By.cssSelector("input[id$='username']")).sendKeys("Tester");
		driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
	      
	        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
	        List<WebElement> columns=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td"));
	        String name="Susan McLaren";
	        for (int i=1; i<=rows.size(); i++) {
	            String rowText=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]")).getText();
	        
	            if(rowText.contains(name)) {
	            System.out.println("The name of "+name+" is here");
	            driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]/td[1]")).click();
	            }
	        }
	}

}

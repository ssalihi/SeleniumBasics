package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		/*TC 2: Select and Deselect values
Open chrome browser
Go to “http://uitestpractice.com/”
Click on “Select” tab
Verify how many options available in the first drop down and then select “United states of America”
Verify how many options available in the second drop down and then select all.
Deselect China from the second drop down
Quit browser (edited) 
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.xpath("//a[text()='Select']")).click();
		WebElement select=driver.findElement(By.cssSelector("select#countriesSingle"));
		Select option=new Select(select);
		List<WebElement> allOption=option.getOptions();
		int a=allOption.size();
		System.out.println("The number of drop down are "+a);
		
			option.selectByVisibleText("United states of America");
			
		WebElement multiDD=driver.findElement(By.cssSelector("select#countriesMultiple"));
		Select select1=new Select(multiDD);
		List<WebElement> alloption=select1.getOptions();
		int b=alloption.size();
		System.out.println("the of option n multiple countries dd is "+b);
		if (select1.isMultiple()) {
		for (int i=0; i<b; i++) {
			select1.selectByIndex(i);
			Thread.sleep(2000);
		}
		}
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}

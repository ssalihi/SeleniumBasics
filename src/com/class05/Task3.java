package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
/*
 * check all years fo experience radio buttons are clickable
 * ----------------------------------------------------------------------
 * check all automation tools checkboxes are clickable
 * and keet "selenium WebDrinver" option as selection
 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
        List <WebElement> professionList=driver.findElements(By.name("exe"));
        for (WebElement list: professionList) {
        	if (list.isEnabled()) {
        		String value=list.getAttribute("value");
        		System.out.println(value);
        		if (value.equals("a")) {
        			list.click();
        		}
        	}
        	
        }
        List<WebElement> list1=driver.findElements(By.name("tool"));
        for (WebElement lis:list1) {
        	if(lis.isEnabled()) {
        		String value=lis.getAttribute("value");
        		System.out.println(value);
        		if (value.equals("Selenium WebDriver")) {
        			lis.click();
        		}
        	}
        }
		
	}



	}



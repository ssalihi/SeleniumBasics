package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPathNativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-form/");
driver.findElement(By.xpath("html/body/div/div[5]/div/div/div/div/div/div/div/div[2]/div/form/fieldset/div[7]/input[@name='firstname']")).sendKeys("name");
	}

}

package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		//driver.get("http://facebook.com");
		//driver.get("http://amazon.com");
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Sekander Salihi//Selenium//geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
         driver1.get("http://facebook.com");
		
		
		
	}

}

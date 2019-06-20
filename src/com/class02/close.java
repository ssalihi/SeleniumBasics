package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://bbc.com");
	   // driver.close();// close will close only one particular window
	   // driver.get("http://cnn.com");
	    driver.quit();// will close the entire browser 
	}

}

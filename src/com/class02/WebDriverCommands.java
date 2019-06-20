package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");	
		System.out.println(driver.getTitle());
		String title= driver.getTitle();
		if (title.equalsIgnoreCase("google")) {
			System.out.println("This is the right title");
		}else {
			System.out.println("sorry This is wrong title");
		}
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://facebook.com");
		System.out.println(driver1.getTitle());
		String tit=driver1.getTitle();
		if (tit.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("This right title");
			
		}else {
			System.out.println("sorry this wrong title");
		}
		
	}

}

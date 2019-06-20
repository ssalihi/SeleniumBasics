package com.class12;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.CommonMethods;

public class BrokenLinks extends CommonMethods {

	@BeforeMethod
	public void setUp() {
		String url="http://newtours.demoaut.com";
		setUpDriver("chrome", url);
	}
	@Test
	public void brokenlinksVerification() {
		//1. grab all links
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total link "+links.size());
		//2. get href attribute
		for (WebElement link:links) {
			String linkUrl=link.getAttribute("href");
			try {
				URL url=new URL(linkUrl);
				
					HttpURLConnection conn=(HttpURLConnection)url.openConnection();
					int code =conn.getResponseCode();
					if (code==200) {
						System.out.println("Link is valid "+link.getText());
					}else {
						System.out.println("the link is not valid "+link.getText());
					}
				} catch (IOException e) {
					
					e.printStackTrace();
		
				
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		
	}
}

package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC 1: Amazon Page Title Verification:
*Open chrome browser
*Go to “https://www.amazon.com/”
*Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
 * 
 */
public class AmzonTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://Amazon.com");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if (title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("This right web");
		}else {
			System.out.println("This is wrong");
		}
		
	}

}

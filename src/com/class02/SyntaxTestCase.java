package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxTestCase {
/*TC 2: Syntax Page URL Verification:
*Open chrome browser Navigate to “https://www.syntaxtechs.com/”
*Navigate to “https://www.google.com/” Navigate back to Syntax Technologies Page
*Refresh current page Verify url contains “Syntax”
*
*/
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    

	}

}

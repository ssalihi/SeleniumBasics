package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
		/*Open chrome browser
Go to “https://www.amazon.com/”
Using Iterator get text of each link
Get number of links that has text
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are "+links.size());
		int num=0;
		//for (WebElement link:links) {
		//	String linkText=link.getText();
			//if (!linkText.isEmpty()) {
			//	System.out.println(linkText);
				//num++;
			//}
			
		//}
		//capture all links
		Iterator <WebElement> iterator=links.iterator();
		while (iterator.hasNext()) {
			String linkText=iterator.next().getText();
			if (!linkText.isEmpty()) {
				System.out.println(linkText);
				num++;
			}
		}
		System.out.println("The total number of links are "+num);
driver.quit();
	}

}

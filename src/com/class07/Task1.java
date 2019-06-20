package com.class07;

import org.openqa.selenium.By;

import Utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * TC 1: ToolsQA Frame verification Open chrome browser Go to
		 * “https://www.toolsqa.com/iframe-practice-page/” Click on “Blogs” link inside
		 * first frame Verify element “Interactions” is present in second frame Navigate
		 * to Home Page Quit browse
		 */
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page");
		
       driver.switchTo().frame("IF1");
       driver.findElement(By.xpath("//a[text()='Git Log']"));
       driver.switchTo().defaultContent(); // switch back to our webpage
       driver.switchTo().frame("IF2");
      boolean inter= driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
       if (inter==true) {
    	   driver.switchTo().defaultContent();
    	  // driver.close();
       }
	}

}

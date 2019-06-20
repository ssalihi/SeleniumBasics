package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import Utils.CommonMethods;

public class iframe extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
				//Way 1; name 
				//driver.switchTo().frame("iframe_a");
				//Way 2 webelelement 
				//WebElement ele = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
				//driver.switchTo().frame(ele);
				//Way 3 //index
				//driver.switchTo().frame(0);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input#name")).sendKeys("arif");
				Set<String> windows=driver.getWindowHandles();
				Iterator<String> it = windows.iterator();
				String pwin = it.next();
				String chWin=it.next();
				System.out.println("The parent Id is "+pwin);
				System.out.println("The parent Id is "+chWin);
				
				
				
				
				driver.switchTo().window(chWin);

			}
		

	}


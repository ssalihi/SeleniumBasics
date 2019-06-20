package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import Utils.CommonMethods;

public class windows extends CommonMethods{

	public static void main(String[] args) {
		 CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
	        String parent =driver.getTitle();
	        String parentId= driver.getWindowHandle();
	        System.out.println("title: "+parent+" "+" ID: "+parentId);
	        driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
	        Set<String> allWindows = driver.getWindowHandles();
	        Iterator<String> it = allWindows.iterator();
	        parent=it.next();
	        String child= it.next();
	        driver.switchTo().window(child);
	        child=driver.getTitle();
	        String childId= driver.getWindowHandle();
	        System.out.println("title: "+child+" "+" ID: "+childId);
	        driver.switchTo().window(parent);

	    }

	}

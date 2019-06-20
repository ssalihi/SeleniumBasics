package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook1 {

	public static void main(String[] args) {
		//Select your date of birth    
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com");
	
		List<WebElement> options;
		
//		month dd has 12 month options
		WebElement month=driver.findElement(By.cssSelector("select[name=birthday_month]"));
		Select obj=new Select(month);
		options=obj.getOptions();
		int numOfmonth=options.size()-1;
		System.out.println("There is "+numOfmonth+" months in one year");
		List<WebElement> mon=obj.getOptions();
		Iterator<WebElement> iterator=mon.iterator();
		while(iterator.hasNext()) {
			String a=iterator.next().getText();
			System.out.println(a);
		}
		obj.selectByIndex(1);
		
		
//		day dd has 31 day options
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select obj1=new Select(day);
		options=obj1.getOptions();
		int numOfDay=options.size()-1;
		System.out.println("There is "+numOfDay+" in one month");
		List<WebElement> list=obj1.getOptions();
		Iterator<WebElement> it= list.iterator();
		while(it.hasNext()) {
			String option=it.next().getText();
			System.out.println(option);
		}
		obj1.selectByValue("17");
		
		
//		year dd has 115 year options
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select obj2=new Select(year);
		options=obj2.getOptions();
		int numOfYear=options.size()-1;
		System.out.println("There is "+numOfYear+" in facebook page");
		obj2.selectByVisibleText("1985");
		
		
		driver.quit();
	}

}

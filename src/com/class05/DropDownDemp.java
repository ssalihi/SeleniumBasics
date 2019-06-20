package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement continent=driver.findElement(By.id("continents"));
		//continent.click();
		Select obj=new Select(continent);
		//select value by index
		obj.selectByIndex(3);//Australia

		Thread.sleep(2000);
		// select by visibleText
		obj.selectByVisibleText("North America");
		//get all options
		List<WebElement>allOption=obj.getOptions();
		System.out.println(allOption.size());
		
		Thread.sleep(2000);
		driver.quit();
	}

}

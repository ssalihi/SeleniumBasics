package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmzonTask {

	public static void main(String[] args) throws InterruptedException {
		/*TC 1: Amazon Department List Verification
         *Open chrome browser
         *Go to “http://amazon.com/”
         *Verify how many department options available.
         *Print each department
         *Select Computers
         *Quit browser
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		
		WebElement department=driver.findElement(By.cssSelector("select[class='nav-search-dropdown searchSelect']"));
		Select select=new Select(department);
		List<WebElement> alloption=select.getOptions();
		int a=alloption.size();
		System.out.println("There is "+a+" department in amazon");
		Iterator<WebElement> it=alloption.iterator();
		while(it.hasNext()) {
			String b=it.next().getText();
			System.out.println("The department in amazon is "+b);
			
		}
		
			select.selectByVisibleText("Computers");
		
		Thread.sleep(3000);
		driver.quit();

	}

}

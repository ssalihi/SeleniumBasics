package webTablePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;

public class task1 extends CommonMethods{

	public static void main(String[] args) {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		WebElement flag=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td/a[1]"));

	}

}

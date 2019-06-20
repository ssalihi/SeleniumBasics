package webTablePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.CommonMethods;

public class table extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		//table[@id='table1']/thead/tr/th

    //    List <WebElement> list=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));		
        //for (WebElement ele:list) {
        	//String string=ele.getText();
        	//System.out.println(string);
       // }
		 List <WebElement> list=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		 System.out.println(list.size());
		 for (int i=1; i<=list.size(); i++) {
			 if (i<=6) {
			 String text=driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th["+i+"]")).getText();
			 System.out.println(text);
			 }else {
				 System.out.println("Fail");
			 }
		 }
        //System.out.println("pass");
	}

}

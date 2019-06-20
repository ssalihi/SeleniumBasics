package com.class09;

import Utils.CommonMethods;

public class DriversTest extends CommonMethods {

	public static void main(String[] args) {
		CommonMethods.setUpDriver("chrome", "http://google.com");
		
		driver.quit();

	}

}

package com.class07;

import Utils.CommonMethods;// we need to import them because it is different package

public class Test extends CommonMethods {

	public static void main(String[] args) {
		//CommonMethods.setUpDriver("chrome", "http://google.com");// if method is static, we dont need to create an object of that, we 
		                                                         // just call it by class name thn by method name
        CommonMethods.setUpDriver("firefox", "http://google.com");
        driver.close();
	}

}

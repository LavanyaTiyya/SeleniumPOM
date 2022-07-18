package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;

import com.qa.opencart.util.ElementUtil;

public class AccPage {
	
	public AccPage(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
}

package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.Constants;
import com.qa.opencart.util.ElementUtil;

public class AccountsPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//1. By locators
	private By  header= By.cssSelector("ul.breadcrumb > li:last-of-type a");
	private By logoutLink = By.linkText("Logout");
	private By sectionHeaders=By.cssSelector("div#content h2");
	private By search= By.name("search");
	private By searchIcon=By.xpath("//span[@class='input-group-btn']");
	
	
	//2.page Constructor
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
	
	public String getAccountsPageTitle() {
		return eleUtil.waitForTitleIs(Constants.ACCOUNTS_PAGE_TITLE, Constants.DEFAULT_TIME_OUT);
		
	}
	
	public String getAccountsPageUrl() {
		return eleUtil.waitForTitleContains(Constants.ACCOUNTS_PAGE_URL_FRACTION, Constants.DEFAULT_TIME_OUT);
		
	}
	
	public String getAccountsPageHeader() {
		return eleUtil.doGetText(header);
	}
	
}


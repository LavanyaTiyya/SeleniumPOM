package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.Constants;
import com.qa.opencart.util.ElementUtil;

public class LoginPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//1. By locators
	By emailId= By.id("input-email");
	By password= By.id("input-password");
	By loginBtn=By.xpath("//input[@value='Login']");
	By forgotPasswordLink= By.linkText("Forgotten Password");
	By registerLink=By.linkText("Register");
	
	//2.page Constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
	
	//3.Page actions
	public String getLoginPageTitle(){
		return eleUtil.waitForTitleIs(Constants.LOGIN_PAGE_TITLE,Constants.DEFAULT_TIME_OUT);	
	}
	
	public String getLoginPageURL() {
		return eleUtil.waitForUrlContains(Constants.LOGIN_PAGE_URL_FRACTION,Constants.DEFAULT_TIME_OUT);
	}
	
	public AccountsPage doLogin(String un,String pwd) {
		System.out.println("user name is : "+un +"pwd is: "+pwd);
		eleUtil.waitForElementVisible(emailId, Constants.DEFAULT_ELEMENT_TIME_OUT).sendKeys(un);
		eleUtil.doSendKeys(password, pwd);
		eleUtil.doClick(loginBtn);
		return new AccountsPage(driver);
	}
	
	public boolean isForgotPwdLinkExist() {
		return eleUtil.doIsDisplayed(forgotPasswordLink);
	}
	
	public boolean isRegisterLinkExist() {
		return eleUtil.doIsDisplayed(registerLink);
	}
}



package org.xyz.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.xyz.test.pages.interfaces.XyZHomePageInterface;

public class XyZHomePage implements XyZHomePageInterface {

	public WebDriver driver;
	public XyZHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[starts-with(@class,'btn home')]")
	private WebElement homeNav;
	@FindBy(xpath = "(//*[starts-with(@class,'btn btn-primary btn-lg')])[1]")
	private WebElement customerLogin;
	@FindBy(xpath = "(//*[starts-with(@class,'btn btn-primary btn-lg')])[2]")
	private WebElement bankManagerLogin;
	
	@Override
	public void performHome() {
		// TODO Auto-generated method stub
		homeNav.click();
	}

	@Override
	public void customerLogin() {
		// TODO Auto-generated method stub
		customerLogin.click();
	}

	@Override
	public void bankManagerLogin() {
		// TODO Auto-generated method stub
		bankManagerLogin.click();
	}
	
}

package org.xyz.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.xyz.test.pages.interfaces.XyZManagerPageInterface;

public class XyZBankManagerPage implements XyZManagerPageInterface {

	public WebDriver driver;
	public XyZBankManagerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//*[starts-with(@class,'btn btn-lg tab')])[1]")
	private WebElement AddCustomer;
	@FindBy(xpath = "(//*[starts-with(@class,'btn btn-lg tab')])[2]")
	private WebElement openAccount;
	@FindBy(xpath = "(//*[starts-with(@class,'btn btn-lg tab')])[3]")
	private WebElement customers;
	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub
		AddCustomer.click();
	}
	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		openAccount.click();
	}
	@Override
	public void customers() {
		// TODO Auto-generated method stub
		customers.click();
	}
	
}

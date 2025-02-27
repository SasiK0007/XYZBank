package org.xyz.test.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.xyz.test.pages.interfaces.AddCustomersInterface;

public class AddCustomers implements AddCustomersInterface {

	public WebDriver driver;
	public Select select;
	public AddCustomers(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//*[starts-with(@ng-model,'fName')])")
	private WebElement fname;
	@FindBy(xpath = "(//*[starts-with(@ng-model,'lName')])")
	private WebElement lname;	
	@FindBy(xpath = "(//*[starts-with(@ng-model,'postCd')])")
	private WebElement postCode;
	@FindBy(xpath = "(//*[starts-with(@class,'btn btn-default')])")
	private WebElement addCustomer;
	@FindBy(xpath = "(//*[starts-with(@ng-click,'openAccount()')])")
	private WebElement openAccount;
	@FindBy(name = "userSelect")
	private WebElement customerName;
	
	@Override
	public void AddCustomersData(String fn, String ln, String postCod) {
		// TODO Auto-generated method stub
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		postCode.sendKeys(postCod);
		addCustomer.click();
		driver.switchTo().alert().accept();
	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		openAccount.click();
	}

	@Override
	public void customerNames() {
		// TODO Auto-generated method stub
		List<WebElement>lists = driver.findElements(By.name("userSelect"));
		for (WebElement webElement : lists) {
			System.out.println(webElement.getText());
		}
	}

	@Override
	public void selectCustomerName(String text) {
		// TODO Auto-generated method stub
		select = new Select(customerName);
		select.selectByVisibleText(text);
	}
	
	
	
}

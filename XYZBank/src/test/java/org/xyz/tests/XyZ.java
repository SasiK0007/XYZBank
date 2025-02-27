package org.xyz.tests;

import org.testng.annotations.Test;
import org.xyz.bases.XyZBase;

public class XyZ extends XyZBase{

	@Test
	public void one() throws Exception {
		homePage.bankManagerLogin();
		bankManagerPage.addCustomer();
		addCustomers.AddCustomersData("One", "Two", "323");
		addCustomers.openAccount();
		addCustomers.customerNames();
		addCustomers.selectCustomerName("One Two");
	}
}

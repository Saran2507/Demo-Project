package com.Automation_demo.org;

import com.Automation.Pom.Purcharse_Page;

public class purcharse extends Baseclass {
	
	public static void main(String[] args) {

		getBrowser("chrome");
		geturl("http://automationpractice.com/index.php");
		Purcharse_Page page = new Purcharse_Page(driver);

		click(page.getSignin());
		SendKey(page.getEmail(), "sarankumrml@gmail.com");
		SendKey(page.getPassword(), "Saravanan@123");
		click(page.getSubmitlogin());
		moveToElement(page.getwomens());
		click(page.getblouses());
		moveToElement(page.getImage());
		click(page.getAddcart());
		click(page.getCheckout());
		click(page.getFinalcheckout());
		click(page.getAddress());
		click(page.getCondition());
		click(page.getShipping());
		click(page.getPayment());

	}

}

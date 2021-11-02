package com.Automation_demo.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Automation.Pom.Purcharse_Page;

public class purcharse extends Baseclass {
	
	public static void main(String[] args) throws Throwable {

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
		click(page.getPay());
		click(page.getPayment());
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File fs =  new  File("C:\\Users\\User\\eclipse-workspace\\.metadata\\Automation_Pratics_Demo\\Screenshot//img.png");
		FileUtils.copyFile(ss, fs);
		
		
		

	}

}

package com.Automation.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purcharse_Page {

	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(name = "SubmitLogin")
	private WebElement submitlogin;

	@FindBy(xpath = "(//a[@class='sf-with-ul'])[1]")
	private WebElement womens;

	@FindBy(xpath = "//a[@title='Blouses']")
	private WebElement blouses;

	@FindBy(xpath = "//img[@title='Blouse']")
	private WebElement image;

	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement addcart;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement checkout;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement finalcheckout;

	@FindBy(name = "processAddress")
	private WebElement Address;

	@FindBy(name = "cgv")
	private WebElement condition;

	@FindBy(name = "processCarrier")
	private WebElement shipping;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement payment;

	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement pay;

	public Purcharse_Page(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitlogin() {
		return submitlogin;
	}

	public WebElement getwomens() {
		return womens;
	}

	public WebElement getblouses() {
		return blouses;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getFinalcheckout() {
		return finalcheckout;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCondition() {
		return condition;
	}

	public WebElement getShipping() {
		return shipping;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getPay() {
		return pay;
	}

}

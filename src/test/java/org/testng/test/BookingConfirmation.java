package org.testng.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass {
	
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//input[@id='order_no']")) WebElement orderid;

	public WebElement getOrderid() {
		return orderid;
	}

}

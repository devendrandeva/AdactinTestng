package org.testng.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaHotel extends BaseClass {
	
	public BookaHotel() {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="first_name") WebElement firstname;
	@FindBy(name="last_name") WebElement lastname;
	@FindBy(name="address") WebElement address;
	@FindBy(name="cc_num") WebElement cardnum;
	@FindBy(name="cc_type") WebElement cardtype;
	@FindBy(name="cc_exp_month") WebElement cdmon;
	@FindBy(name="cc_exp_year") WebElement cdyr;
	@FindBy(name="cc_cvv") WebElement cvv;
	@FindBy(name="book_now") WebElement booknow;
	
	
	
	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardnum() {
		return cardnum;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCdmon() {
		return cdmon;
	}
	public WebElement getCdyr() {
		return cdyr;
	}
	public WebElement getCvv() {
		return cvv;
	}

	

	
	
	
	
	
}

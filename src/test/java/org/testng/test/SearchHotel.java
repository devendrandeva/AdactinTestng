package org.testng.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
public SearchHotel() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath=("//select[@name='location']")) private WebElement location;
@FindBy(xpath=("//*[@id='hotels']")) private WebElement hotels;
@FindBy(xpath=("//*[@id='room_type']")) private WebElement type;
@FindBy(xpath=("//*[@id='room_nos']")) private WebElement roomno;
@FindBy(xpath=("//*[@id='datepick_in']")) private WebElement checkindate;
@FindBy(xpath=("//*[@id='datepick_out']")) private WebElement checkoutdate;
@FindBy(xpath=("//*[@id='adult_room']")) private WebElement adultno;
@FindBy(xpath=("//*[@id='child_room']")) private WebElement childno;
@FindBy(xpath=("//*[@id='Submit']")) private WebElement search;

public WebElement getSearch() {
	return search;
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getType() {
	return type;
}
public WebElement getRoomno() {
	return roomno;
}
public WebElement getCheckindate() {
	return checkindate;
}
public WebElement getCheckoutdate() {
	return checkoutdate;
}
public WebElement getAdultno() {
	return adultno;
}
public WebElement getChildno() {
	return childno;
}



}

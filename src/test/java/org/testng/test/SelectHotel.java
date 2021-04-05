package org.testng.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0") private WebElement radiobutton;
	@FindBy(id="continue") private WebElement continueclick;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinueclick() {
		return continueclick;
	}

}

package org.testng.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends BaseClass{
	
public login() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@id='username']") WebElement userName;
@FindBy(xpath="//*[@id='password']") WebElement password;
@FindBy(xpath="//*[@id='login']") WebElement click;
public WebElement getUserName() {
	return userName;
}
public WebElement getPassword() {
	return password;
}
public WebElement getClick() {
	return click;
}



}

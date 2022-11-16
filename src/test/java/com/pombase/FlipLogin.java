package com.pombase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class FlipLogin extends BaseClass {
public FlipLogin() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement user;

@FindBy(xpath="//input[@type='password']")
private WebElement pass;

@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement login;

public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

public WebElement getLogin() {
	return login;
}

}

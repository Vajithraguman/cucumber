package com.pombase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class FacePom extends BaseClass {
public FacePom() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private WebElement userr;
@FindBy(id="pass")
private WebElement passw;
@FindBy(name="login")
private WebElement log;

public WebElement getUserr() {
	return userr;
}
public WebElement getPassw() {
	return passw;
}
public WebElement getLog() {
	return log;
}

}

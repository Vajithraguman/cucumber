package com.pombase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class ForgetPass extends BaseClass{
public ForgetPass(){
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Forgotten password?']")
private WebElement forger;

@FindBy(id="identify_email")
private WebElement email;

@FindBy(id="did_submit")
private WebElement did;

public WebElement getForger() {
	return forger;
}
public WebElement getEmail() {
	return email;
}
public WebElement getDid() {
	return did;
}


}

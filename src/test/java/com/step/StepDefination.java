package com.step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.pombase.FacePom;
import com.pombase.FlipLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefination extends BaseClass{


@Given("To pass Facebook login page url")
public void to_pass_Facebook_login_page_url() {
    inStall();
    launch("https://www.facebook.com/");
    bigWindow();
}

@When("To pass invalid username and password")
public void to_pass_invalid_username_and_password(io.cucumber.datatable.DataTable d) {
   List<String> li = d.asList();
   String user = li.get(0);
   String pass = li.get(1);
   FacePom fp=new FacePom();
   sendText(fp.getUserr(),user);
   sendText(fp.getPassw(),pass);
}

@When("To Click login button")
public void to_Click_login_button() {
	FacePom fp=new FacePom();
	toClick(fp.getLog());
}

@Then("To Verify loginpage Url")
public void to_Verify_loginpage_Url() {
	String url =getCurrentUrl();
	Assert.assertTrue("to verfy", url.contains("https://www.facebook.com/login/?"));

}

@When("To pass invalid Username and password")
public void to_pass_invalid_Username_and_password(io.cucumber.datatable.DataTable d) {
   List<List<String>> li = d.asLists();
   String user = li.get(0).get(0);
   String pass = li.get(1).get(2);
   FacePom fp=new FacePom();
   sendText(fp.getUserr(),user);
   sendText(fp.getPassw(),pass);
   
}

@When("To Click Login button")
public void to_Click_Login_button() {
	FacePom fp=new FacePom();
	toClick(fp.getLog());
}
@Given("To pass valid flipkart url")
public void to_pass_valid_flipkart_url() {
    inStall();
    launch("https://www.flipkart.com/account/login");
    bigWindow();
}

@When("To pass username and password")
public void to_pass_username_and_password(io.cucumber.datatable.DataTable d) {
	Map<String, String> m = d.asMap(String.class, String.class);
	String user = m.get("Username");
	String pass = m.get("password");
	FlipLogin fl=new FlipLogin();
	sendText(fl.getUser(),user);
	sendText(fl.getPass(),pass);
}

@When("Click login field")
public void click_login_field() {
	FlipLogin fl=new FlipLogin();
	toClick(fl.getLogin());
}

@When("To pass valid username and password")
public void to_pass_valid_username_and_password(io.cucumber.datatable.DataTable d) {
    List<Map<String, String>> dol = d.asMaps(String.class, String.class);
              String user = dol.get(1).get("username"); 
              String pass = dol.get(1).get("password");
              FlipLogin fl=new FlipLogin();
              sendText(fl.getUser(),user);
              sendText(fl.getPass(),pass);
}

@When("Click login secondfield")
public void click_login_secondfield() {
	FlipLogin fl=new FlipLogin();
	toClick(fl.getLogin());
}


}

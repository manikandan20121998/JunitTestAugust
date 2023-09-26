package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends RegisterPage {
	
public LoginPage() {
	PageFactory.initElements(driver, this);
	
}
@FindAll({@FindBy(id="email"),@FindBy(name="manika")})
private WebElement username;

@FindBy(id="pass")
private WebElement password;

@FindBy(name="login")
private WebElement login;


public WebElement getUsername() {
	return username;
}


public WebElement getPassword() {
	return password;
}


public WebElement getLogin() {
	return login;
}


































}
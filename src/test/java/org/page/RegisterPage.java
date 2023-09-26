package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseClass {
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id="u_0_0_Im"),@FindBy(xpath="(//a[@role='button'])[2]")})
	private WebElement btncreate;
	@FindBy(name="firstname")
	private WebElement txtfirstname;
	@FindBy(name="lastname")
	private WebElement txtlastname;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btnsignup;

	public WebElement getBtncreate() {
		return btncreate;
	}

	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getBtnsignup() {
		return btnsignup;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

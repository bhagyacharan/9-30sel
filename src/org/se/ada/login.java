package org.se.ada;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends ada {
	public login() {
		 PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id="password")
	private WebElement txtpwd;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement btn;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpwd() {
		return txtpwd;
	}

	public WebElement getBtn() {
		return btn;
	}
}

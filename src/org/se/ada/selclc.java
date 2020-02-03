package org.se.ada;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selclc extends ada{
	public selclc() {
		 PageFactory.initElements(driver,this);
			}
	@FindBy(id="radiobutton_0")
	private WebElement rbtn;
	
	@FindBy(id="continue")
	private WebElement conti;
	
	public WebElement getRbtn() {
		return rbtn;
	}

	public WebElement getConti() {
		return conti;
	}
	
	}


   






package org.se.ada;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookhotel extends ada {
	
	public bookhotel() {
			 PageFactory.initElements(driver,this);
		}
	
	@FindBy(id="first_name")
	private WebElement fn;
	
	@FindBy(id="last_name")
	private WebElement ln;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement cnum;
	
	@FindBy(id="cc_type")
	private WebElement ctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement emon;
	
	@FindBy(id="cc_exp_year")
	private WebElement eyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement clk;

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCnum() {
		return cnum;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getEmon() {
		return emon;
	}

	public WebElement getEyear() {
		return eyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getClk() {
		return clk;
	}
	
}

   

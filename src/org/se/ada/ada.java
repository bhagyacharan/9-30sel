package org.se.ada;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ada {
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaitanya\\eclipse-workspace\\seladactin\\driv\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
		public static void Loadurl(String url) {
			driver.get(url);
			}
		public static void fill(WebElement element,String name) {
			element.sendKeys(name);
			}
		public static void btnclick(WebElement element) {
			element.click();
		}
		public static void drop(WebElement e, String txt) {
			Select s = new Select(e);
			List<WebElement>ha=s.getOptions();
			for(WebElement x:ha) {
				String att = x.getText();
				if(att.equals(txt));
				{
			
			s.selectByVisibleText(txt);
				}
			}  
			}
		}
			
		
	
		
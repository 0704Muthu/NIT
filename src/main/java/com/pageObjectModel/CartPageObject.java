package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.TestBase;

public class CartPageObject extends TestBase {

	
	public CartPageObject(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//span[@id='submit.add-to-cart-announce']")
	private WebElement addtocart;

	public WebElement getAddtocart() {
		return addtocart;
	}
	
	
	
	
	
}

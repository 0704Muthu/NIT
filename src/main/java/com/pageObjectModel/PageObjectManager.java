package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.base_class.TestBase;

public class PageObjectManager extends TestBase

{

	public PageObjectManager(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	/**
	 * 
	 * Here we can achieve singleton design design pattern
	 */
	private HomePage hop;
	private CartPageObject cpo;
	
	
	public HomePage getHop() {
		hop=new HomePage(driver);
		return hop;
	}
	
	public CartPageObject getCpo() {
		cpo= new CartPageObject(driver);
		return cpo;
	}
	
	
	
	
}

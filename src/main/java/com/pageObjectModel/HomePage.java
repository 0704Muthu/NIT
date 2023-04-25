package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.TestBase;

public class HomePage extends TestBase{

	
	public HomePage(WebDriver driver) {

	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "fromCity")
	private WebElement from;
	
	@FindBy(css  = "[placeholder=\"From\"]")
	private WebElement input;
	
	
	@FindBy(id = "toCity")
	private WebElement to;
	
	@FindBy(linkText = "Mobiles")
	private WebElement mobile;
	
	@FindBy(linkText = "OnePlus")
	private WebElement oneplus;
	
	@FindBy(id = "toCity")
	private WebElement tocity;
	
	@FindBy(xpath = "(//a[@href='/shop/kids'])[1]")
	private WebElement kids;
	
	@FindBy(xpath = "//a[@href='/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false']")
	private WebElement shirt;
	
	
	public WebElement getCity() {
		return tocity;
	}


	public WebElement getShirt() {
		return shirt;
	}


	public WebElement getMobile() {
		return mobile;
	}


	public WebElement getOneplus() {
		return oneplus;
	}




	public WebElement getInput() {
		return input;
	}

	
	public WebElement getFrom() {
		return from;
	}


	public WebElement getTo() {
		return to;
	}
	
	

	
}

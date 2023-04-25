package com.loginTestOne.MakeMyTrip;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base_class.TestBase;
import com.pageObjectModel.HomePage;

public class FireFoxTest extends TestBase{

	
	
	@BeforeSuite
	private void broserLaunch() {
		browserLaunch("Firefox");
		System.out.println("Firefox BrowserLaunch");
	}

	
	@BeforeClass
	private void urlLaunch() {

		launchUrl("https://www.makemytrip.com/");
		System.out.println("URLLaunch");
	}

	@BeforeMethod
	private void validation() {
		String title = driver.getTitle();
		if (title.equals("MakeMyTri")) {
			System.out.println("ValidateSuccess");
		}else {
			System.out.println("Invalid");
		}
		System.out.println("Validation");
	}
	
	
	
	
	
	@Test(parameters = "valuefrom")
	private static void firfox(String value) {
		
		HomePage fpo = new HomePage(driver);
		clickOnWebelement(fpo.getFrom());
		inputValues(fpo.getInput(), value);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		keyboardControl("down");
		keyboardControl("enter");
		System.out.println("ChromeTest");
		
	}
	@AfterClass
	private void screenshot() {
		screenShot("firefoxTest");
		System.out.println("Exit");
	}


	@AfterSuite
	private void exitWindow() {
		driver.quit();
	}
}

package com.loginTestOne.MakeMyTrip;





import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base_class.TestBase;
import com.pageObjectModel.HomePage;
import com.pageObjectModel.PageObjectManager;

public class TestRunner extends TestBase {


	@BeforeSuite
	private void broserLaunch() {
		browserLaunch("chrome");
		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

		public java.lang.Object getCapabil(java.lang.String capabilityName)
		System.out.println("BrowserLaunch");
		
	}

	
	@BeforeClass
	private void urlLaunch() {

		launchUrl("https://www.makemytrip.com/");
		System.out.println("URLLaunch");
	}

	@BeforeMethod
	private void validation() {
		String actual = driver.getTitle();
		String expected ="MakemyTrip";
		//Hard Assert
		//Assert.assertEquals(actual, expected);
		//Soft Assert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
		soft.assertAll();
	}
	
	
	@Test(parameters = "valuefrom")
	private static void chrome(String value) {
		
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

	
	@Test()
	private static void firefox() {
		HomePage fpo = new HomePage(driver);
		clickOnWebelement(fpo.getTo());
		System.out.println("FirefoxTest");
	}



	@AfterClass
	private void screenshot() {
		screenShot("chromeTest");
		System.out.println("Exit");
	}


	@AfterSuite
	private void exitWindow() {
		driver.quit();
	}

}

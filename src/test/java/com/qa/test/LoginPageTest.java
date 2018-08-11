package com.qa.test;

import org.openqa.selenium.By;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.base.TestBase;
import com.qa.utility.Screenshot;
import com.qa.utility.TestUtil;

@Listeners(Screenshot.class)
public class LoginPageTest extends TestBase {

	
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp()  {
		initializeBrowser();
		
	}

	@DataProvider
	public Object[][] getInvalidLoginData() {
		Object[][] data = TestUtil.getTestData("InvalidLogin");
		return data;
	}

	@Test(dataProvider = "getInvalidLoginData", enabled = false, priority = 1)
	public void invalidLogin(String Username, String Password) {

		SoftAssert sassert = new SoftAssert();
		driver.findElement(By.id("user_login")).sendKeys(Username);
		driver.findElement(By.id("user_pass")).sendKeys(Password);
		driver.findElement(By.id("wp-submit")).click();
		
		String ActualUrl = driver.getCurrentUrl();

		sassert.assertEquals(ActualUrl, "http://demosite.center/wordpress/wp-login.php");
		sassert.assertAll();

	}

	
	
	@Test(enabled = false, priority = 2)
	public void validLogin() {
		SoftAssert sassert = new SoftAssert();
		
		driver.findElement(By.id("user_login")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("user_pass")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("wp-submit")).click();
		
		String homepageTitle=driver.getTitle();
		String expectedTitle = "Dashboard ‹ Wordpress Demo Site at Demo.Center — WordPress";
		                      
		sassert.assertEquals(homepageTitle, expectedTitle);
		sassert.assertAll();
	}

	@Test(enabled = false, priority = 3)
	public void logoTest() {
		SoftAssert sassert = new SoftAssert();
		Screen s = new Screen();
		Pattern wordpressLogo = new Pattern("F:\\Selenium_Framework_Folder\\Workspace_Eclipse\\"
				+ "TestngDataDrivenFramework\\SikuliImageValidation\\wordpressLogo.PNG");

		String LogoStatus = "";
		if (s.exists(wordpressLogo) != null) {
			LogoStatus = "Logo exists";
		} else
			LogoStatus = "Logo does not exists";

		sassert.assertEquals(LogoStatus, "Logo exists");
		sassert.assertAll();

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}

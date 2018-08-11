package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.qa.base.TestBase;
import com.qa.utility.Screenshot;
@Listeners(Screenshot.class)
public class CommentsPageTest extends TestBase{
	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
	}
@AfterMethod
	public void closeBrowser() {
	tearDown();	
	}

}

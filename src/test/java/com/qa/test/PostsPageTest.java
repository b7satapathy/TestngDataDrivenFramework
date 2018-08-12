package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

import com.qa.page.PostsPage;
import com.qa.utility.Screenshot;
import com.qa.utility.ExcelData;
@Listeners(Screenshot.class)
public class PostsPageTest extends TestBase{
	
	PostsPage postPage;
	
	@BeforeMethod
	public void setUp() {
		initializeBrowser();
		login();
	}
	
	@DataProvider
	public Object[][] getNewPostData() {
		Object[][] data = ExcelData.getTestData("AddNewPost");
		return data;
	}
	
	@Test(dataProvider="getNewPostData")
	public void createAPostTest(String post, String postDetails) {
		
		
		postPage= new PostsPage();
		postPage.createAPost(post, postDetails);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
@AfterMethod
	public void closeBrowser() {
	tearDown();	
	}

}

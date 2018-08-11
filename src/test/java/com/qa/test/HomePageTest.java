package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.base.TestBase;
import com.qa.page.HomePage;

import com.qa.utility.Screenshot;

@Listeners(Screenshot.class)
public class HomePageTest extends TestBase {
	
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()  {
		initializeBrowser();
		login();
	}
	
	@Test(priority=1)
	public void validatePostsLinkTest() {
		SoftAssert sassert= new SoftAssert();
		homepage= new HomePage();
		
		String PostsPageTitle=homepage.validatePostsLink();
		
		sassert.assertEquals(PostsPageTitle, "Posts ‹ Wordpress Demo Site at Demo.Center — WordPress");
		sassert.assertAll();
	}
	

	@Test(priority=2)
	public void validateMediaLinkTest() {
		
		SoftAssert sassert= new SoftAssert();
		homepage= new HomePage();
		
		String MediaPageTitle=homepage.validateMediaLink();
		
		sassert.assertEquals(MediaPageTitle, "Media Library ‹ Wordpress Demo Site at Demo.Center — WordPress");
		sassert.assertAll();
	}
	
	@Test(priority=3)
	public void validateYoutubeEmbedLinkTest() {
		SoftAssert sassert= new SoftAssert();
		
		homepage= new HomePage();
		String YoutubeEmbedPageTitle=homepage.validateYoutubeEmbedLink();
		
		sassert.assertEquals(YoutubeEmbedPageTitle, "YouTube Embed Profiles ‹ Wordpress Demo Site at Demo.Center — WordPress");
	}
	
	@Test(priority=4)
	public void validatePagesLinkTest() {
		SoftAssert sassert= new SoftAssert();
		homepage= new HomePage();
		String PagesPageTitle=homepage.validatePagesLink();
		
		sassert.assertEquals(PagesPageTitle, "Pages ‹ Wordpress Demo Site at Demo.Center — WordPress");
	}
	
	@Test(priority=5)
	public void validateCommentsLinkTest() {
		SoftAssert sassert= new SoftAssert();
		homepage= new HomePage();
		
		String CommentsPageTitle=homepage.validateCommentsLink();
		
		sassert.assertEquals(CommentsPageTitle, "Comments ‹ Wordpress Demo Site at Demo.Center — WordPress");
	}
	
	@Test(priority=6)
	public void validateAppearanceLinkTest() {
		SoftAssert sassert= new SoftAssert();
		
		homepage= new HomePage();
		String ApperancePageTitle=homepage.validateAppearanceLink();
		
		sassert.assertEquals(ApperancePageTitle, "Manage Themes ‹ Wordpress Demo Site at Demo.Center — WordPress");
	}
	
	@Test(priority=7)
	public void validatePluginsLinkTest() {
		SoftAssert sassert= new SoftAssert();
		homepage= new HomePage();
		String PluginsPageTitle=homepage.validatePluginsLink();
		
		sassert.assertEquals(PluginsPageTitle, "Plugins ‹ Wordpress Demo Site at Demo.Center — WordPress");
	}
	
	@Test(priority=8)
	public void validateUsersLinkTest() {
		SoftAssert sassert= new SoftAssert();
		homepage= new HomePage();
		String UsersPageTitle=homepage.validateUsersLink();
		
		sassert.assertEquals(UsersPageTitle, "Users ‹ Wordpress Demo Site at Demo.Center — WordPress");
	}
	
	@Test(priority=9)
	public void validateToolsLinkTest() {
		SoftAssert sassert= new SoftAssert();
		homepage= new HomePage();
		String ToolsPageTitle=homepage.validateToolsLink();
		
		sassert.assertEquals(ToolsPageTitle, "Tools ‹ Wordpress Demo Site at Demo.Center — WordPress");
	}
	
	@Test(priority=10)
	public void validateSettingsLinkTest() {
		SoftAssert sassert= new SoftAssert();
		homepage= new HomePage();
		String SettingsPageTitle=homepage.validateSettingsLink();
		
		sassert.assertEquals(SettingsPageTitle, "General Settings ‹ Wordpress Demo Site at Demo.Center — WordPress");
	}
	
	@Test(priority=11)
	public void validateAccountLinkTest() {
		SoftAssert sassert= new SoftAssert();
		homepage= new HomePage();
		String AccountPageTitle=homepage.validateAccountLink();
		
		sassert.assertEquals(AccountPageTitle, "Profile ‹ Wordpress Demo Site at Demo.Center — WordPress");
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}

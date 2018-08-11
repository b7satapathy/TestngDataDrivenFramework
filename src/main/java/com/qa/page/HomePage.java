package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//ul[@id='adminmenu']/li[3]")
	WebElement PostsLink;

	@FindBy(xpath = "//ul[@id='adminmenu']/li[4]")
	WebElement MediaLink;

	@FindBy(xpath = "//ul[@id='adminmenu']/li[5]")
	WebElement YoutubeEmbedLink;

	@FindBy(xpath = "//ul[@id='adminmenu']/li[6]")
	WebElement PagesLink;

	@FindBy(xpath = "//ul[@id='adminmenu']/li[7]")
	WebElement CommentsLink;

	@FindBy(xpath = "//ul[@id='adminmenu']/li[9]")
	WebElement AppearanceLink;

	@FindBy(xpath = "//ul[@id='adminmenu']/li[10]")
	WebElement PluginsLink;

	@FindBy(xpath = "//ul[@id='adminmenu']/li[11]")
	WebElement UsersLink;

	@FindBy(xpath = "//ul[@id='adminmenu']/li[12]")
	WebElement ToolsLink;

	@FindBy(xpath = "//ul[@id='adminmenu']/li[13]")
	WebElement SettingsLink;

	@FindBy(xpath = "//li[@id='wp-admin-bar-my-account']")
	WebElement AccountLink;

	public HomePage() {

		PageFactory.initElements(driver, this);

	}

	public String validatePostsLink() {
		PostsLink.click();
		return driver.getTitle();
	}

	public String validateMediaLink() {
		MediaLink.click();
		return driver.getTitle();
	}

	public String validateYoutubeEmbedLink() {
		YoutubeEmbedLink.click();
		return driver.getTitle();
	}

	public String validatePagesLink() {
		PagesLink.click();
		return driver.getTitle();
	}

	public String validateCommentsLink() {
		CommentsLink.click();
		return driver.getTitle();
	}

	public String validateAppearanceLink() {
		AppearanceLink.click();
		return driver.getTitle();
	}

	public String validatePluginsLink() {
		PluginsLink.click();
		return driver.getTitle();
	}

	public String validateUsersLink() {
		UsersLink.click();
		return driver.getTitle();
	}

	public String validateToolsLink() {
		ToolsLink.click();
		return driver.getTitle();
	}

	public String validateSettingsLink() {
		SettingsLink.click();
		return driver.getTitle();
	}

	public String validateAccountLink() {
		AccountLink.click();
		return driver.getTitle();
	}

}

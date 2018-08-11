package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class PostsPage extends TestBase {
	
	public Actions a;
	public Select s;
	public WebElement table;

	@FindBy(xpath = "//ul[@id='adminmenu']/li[3]")
	WebElement PostsLink;

	

	@FindBy(xpath = "//*[@id='wpbody-content']/div[4]/h1/following-sibling::a")
	WebElement AddNewButton;

	@FindBy(xpath = "//*[@id='title-prompt-text']")
	WebElement EntertPostTitleName;

	@FindBy(xpath = "//*[@id='tinymce']")
	WebElement EnterPostDetails;
	
	@FindBy(xpath="//*[@id='mceu_13-button']/i")
	WebElement ClickDistractionFreeButton;

	@FindBy(xpath = "//*[@id='save-post']")
	WebElement ClickOnSaveDraft;
	
	@FindBy(xpath = "//*[@id='cb-select-all-1']")
	WebElement checkBox;

	@FindBy(id = "bulk-action-selector-top")
	WebElement BulkActionsDropDown;

	@FindBy(id = "doaction")
	WebElement ClickApplyButton;

	public PostsPage() {
		PageFactory.initElements(driver, this);
	}

	public void createAPost(String postname, String postDetails) {

		PostsLink.click();

		AddNewButton.click();
		
		a = new Actions(driver);
		a.moveToElement(EntertPostTitleName).click().sendKeys(postname).build().perform();
		
		driver.switchTo().frame(driver.findElement(By.id("content_ifr")));
		
		a.moveToElement(EnterPostDetails).click().sendKeys(postDetails).build().perform();
		
		driver.switchTo().defaultContent();
		
		
		ClickDistractionFreeButton.click();
		ClickOnSaveDraft.click();
		driver.navigate().back();
		driver.navigate().refresh();

		table=driver.findElement(By.xpath("//*[@id='posts-filter']/table"));
		checkBox.click();
		
		

		s = new Select(BulkActionsDropDown);
		s.selectByVisibleText("Move to Bin");
		
		ClickApplyButton.click();
		
		

	}

}

package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.base.TestBase;
import com.demoqa.pages.elements.*;
import com.demoqa.util.TestUtil;

public class ElementsPage extends TestBase{
	
	//Page Object - Object Repository 
	@FindBy(xpath="//div[contains(text(),'Elements')]")
	WebElement elementspage;
	
	//div[contains(text(),'Elements')]
	//div[@class='card-body']
	
	@FindBy(xpath="//li[@id='item-0']")
	WebElement textbox;
	
	@FindBy(xpath="//li[@id='item-1']")
	WebElement checkbox;
	
	@FindBy(xpath="//li[@id='item-2']")
	WebElement radiobutton;
	
	@FindBy(xpath="//li[@id='item-3']")
	WebElement webtables;
	
	@FindBy(xpath="//li[@id='item-4']")
	WebElement buttons;
	
	@FindBy(xpath="//li[@id='item-5']")
	WebElement links;
	
	@FindBy(xpath="//li[@id='item-6']")
	WebElement brokenlinksandimages;
	
	@FindBy(xpath="//li[@id='item-7']")
	WebElement uploadanddownload;
	
	@FindBy(xpath="//li[@id='item-8']")
	WebElement dynamicproperties;
	
	
	//Initializing the page objects
	public ElementsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Page Actions or validations
	
	public boolean validateElementPage() {
		return elementspage.isDisplayed();
	}
	
	public TextBox clickOnTextBox() {
		textbox.click();
		return new TextBox();
	}
	
	public CheckBox clickOnCheckBox() {
		checkbox.click();
		return new CheckBox();
	}
	
	public RadioButton clickOnRadioButton() {
		radiobutton.click();
		return new RadioButton();
	}
	
	public WebTables clickOnWebTables() {
		webtables.click();
		return new WebTables();
	}
	
	public Buttons clickOnButtons() {
		buttons.click();
		return new Buttons();
	}
	
	public Links clickOnLinks() {
		if(links.isDisplayed()) {
			links.click();
		}
		return new Links();
	}
	
	public BrokenLinksAndImages clickOnBrokenLinksAndImages() {
		TestUtil.windowScroll(brokenlinksandimages);
		System.out.println(driver.getTitle());
		brokenlinksandimages.click();
		return new BrokenLinksAndImages();
	}
	
	public UploadAndDownload clickOnUploadAndDownload() {
		TestUtil.windowScroll(uploadanddownload);
		uploadanddownload.click();
		return new UploadAndDownload();
	}
	
	public DynamicProperties clickOnDynamicProperties() {
		TestUtil.windowScroll(dynamicproperties);
		dynamicproperties.click();
		return new DynamicProperties();
	}

	
	
	
	
	
}

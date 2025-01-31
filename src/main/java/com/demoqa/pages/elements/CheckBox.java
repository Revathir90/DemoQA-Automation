package com.demoqa.pages.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.demoqa.base.TestBase;

public class CheckBox extends TestBase{
	
	// Page Object - Object Repository
	@FindBy (xpath = "//h1[contains(text(),'Check Box')]")
	WebElement checkboxpage;
	
	@FindBy (xpath="//button[@title='Expand all']")
	WebElement expandall;
	
	@FindBy (xpath="//button[@title='Collapse all']")
	WebElement collapseall;
	
	@FindBy (id="tree-node-home") //xpath="//input[@id='tree-node-home']"
	WebElement homecheckbox;
	
	
	// Initializing the page objects
	public CheckBox() {
		PageFactory.initElements(driver, this);
	}
	
	// Page actions or validations
	public boolean validateCheckBoxPage() {
		return checkboxpage.isDisplayed();
	}
	
	public void selectingHomeCheckbox() {
		homecheckbox.click();
	}
		
		
		
		
	
}

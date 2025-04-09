package com.demoqa.pages.elements;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.base.TestBase;

public class CheckBox extends TestBase{
	
	// Page Object - Object Repository
	@FindBy (xpath = "//h1[contains(text(),'Check Box')]")
	WebElement checkboxpage;
	
	@FindBy (xpath="//button[@title='Expand all']")
	WebElement expandall;
	
	@FindBy (xpath="//button[@title='Collapse all']")
	WebElement collapseall;
	
	@FindBy (xpath="//*[@id=\"tree-node\"]/ol/li/span/label") //xpath="//input[@id='tree-node-home']" 
	WebElement homecheckbox;
	
	@FindBy (id="result")
	WebElement result;
	
	//*[text()='Desktop']
	
	// Initializing the page objects
	public CheckBox() {
		PageFactory.initElements(driver, this);
		log.info("Navigated to CheckBox Page");
	}
	
	// Page actions or validations
	public boolean validateCheckBoxPage() {
		return checkboxpage.isDisplayed();
	}
	
	public void selectingHomeCheckbox() {
		homecheckbox.click();	
	}
	
	public boolean resultContent() {
		return result.isDisplayed();
	}
		
		
		
		
	
}

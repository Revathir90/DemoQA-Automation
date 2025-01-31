package com.demoqa.pages.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoqa.base.TestBase;

public class CheckBox extends TestBase{
	
	// Page Object - Object Repository
	@FindBy (xpath = "//h1[contains(text(),'Check Box')]")
	WebElement checkboxpage;
	
	
	
}

package com.demoqa.pages.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.base.TestBase;


public class TextBox extends TestBase {

	// Page Object - Object Repository
	@FindBy(xpath = "//h1[contains(text(),'Text Box')]")
	WebElement textboxpage;

	@FindBy(xpath = "//input[@id='userName']")
	WebElement fullnameelement;

	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement emailelement;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	WebElement currentaddresselement;

	@FindBy(xpath = "//textarea[@id='permanentAddress']")
	WebElement permanentaddresselement;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement submitbtn;

	@FindBy(id = "output")
	WebElement output;

	// Initializing the page objects
	public TextBox() {
		PageFactory.initElements(driver, this);
	}

	// Page actions or validations
	public boolean validateTextBoxPage() {
		return textboxpage.isDisplayed();
	}

	public String validateTextBoxFeature() {
		return fullnameelement.getTagName();
	}

	public void enteringText(String fullname, String email, String currentaddress, String permanentaddress) {
		fullnameelement.sendKeys(fullname);
		emailelement.sendKeys(email);
		currentaddresselement.sendKeys(currentaddress);
		permanentaddresselement.sendKeys(permanentaddress);
		submitbtn.click();
	}

	public Boolean validateOutput() {
		return output.isDisplayed();
	}

}

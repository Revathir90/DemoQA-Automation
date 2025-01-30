package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.base.TestBase;
import com.demoqa.util.TestUtil;

public class HomePage extends TestBase{
	
	//Page Object - Object Repository 
	@FindBy(xpath="//div[@id='app']/header/a/img")
	WebElement demoqalogoimg;
	
	@FindBy(xpath="//div[@class='card-body'and contains(h5,'Elements')]")
	WebElement elements;
	
	@FindBy(xpath="//div[@class='card-body'and contains(h5,'Forms')]")
	WebElement forms;
	
	@FindBy(xpath="//div[@class='card-body'and contains(h5,'Alerts, Frame & Windows')]")
	WebElement alertsframeandwindows;
	
	@FindBy(xpath="//div[@class='card-body'and contains(h5,'Widgets')]")
	WebElement widgets;

	@FindBy(xpath="//div[@class='card-body'and contains(h5,'Interactions')]")
	WebElement interactions;
	
	@FindBy(xpath="//div[@class='card-body'and contains(h5,'Interactions')]")
	WebElement bookatoreapplication;
	
	//Initializing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Page Actions or Validations
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateHomePageLogo() {
		return demoqalogoimg.isDisplayed();
	}
	
	public void clickOnElements() {
		TestUtil.windowScroll(elements);
		elements.click();
		//return new ElementsPage();
	}
	
	public FormsPage clickOnForms() {
		TestUtil.windowScroll(forms);
		forms.click();
		return new FormsPage();
	}
	
	public AlertsFramesWindowsPage clickOnAlertsFrameWindos() {
		TestUtil.windowScroll(alertsframeandwindows);
		alertsframeandwindows.click();
		return new AlertsFramesWindowsPage();
	}
	
	public WidgetsPage clickOnWidgets() {
		TestUtil.windowScroll(widgets);
		widgets.click();
		return new WidgetsPage();
	}
	
	public InteractionsPage clickOnInteractions() {
		TestUtil.windowScroll(interactions);
		interactions.click();
		return new InteractionsPage();
	}
	
	public BookStoreApplicationPage clickOnBookStoreApplication() {
		TestUtil.windowScroll(bookatoreapplication);
		bookatoreapplication.click();
		return new BookStoreApplicationPage();
	}
	
	
	
}

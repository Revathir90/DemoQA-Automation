package com.demoqa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.base.TestBase;

public class JoinNowPage extends TestBase{
	
	//Page Object - Object Repository 
	@FindBy(xpath= "//*[@id=\"app\"]/div/div/div[1]/a")
	WebElement joinnow;
	
	@FindBy(xpath="//img[@class='tools-qa-header__logo']")
	WebElement toolsdqalogoimg;
	
	//Initializing the page objects
	public JoinNowPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions or validations on joinNowPage
	public void navigateToJoinNowPage() {
		this.joinnow.click();
	}
	
	public String windowsHandles() {
		String parent_window = driver.getWindowHandle();
		System.out.println("Current Window: "+driver.getTitle());
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> I1= windowhandles.iterator();
		while(I1.hasNext()){
			String child_window=I1.next();
			if(!parent_window.equals(child_window)){
				driver.switchTo().window(child_window);
			}	
		}
		return parent_window;
	}
	
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateJoinNowPageLogo() {
		return toolsdqalogoimg.isDisplayed();
	}
}

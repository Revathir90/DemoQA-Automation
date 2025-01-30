package com.demoqa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.base.TestBase;
import com.demoqa.pages.HomePage;



public class HomePageTest extends TestBase{
	
	HomePageTest homePageTest;
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		TestBase.initialization();
		homePage = new HomePage();
	}
	
	
	@Test (priority=1)
	public void verifyHomePageTitleTest() {
		String Acttitle = homePage.validateHomePageTitle();
		String exptitle = prop.getProperty("title");
		Assert.assertEquals(Acttitle, exptitle,"HomePage title not matched");
	}
	
	@Test (priority=2)
	public void verifyHomePageLogoTest() {
		boolean flag= homePage.validateHomePageLogo();
		Assert.assertTrue(flag,"HomePage logo not found");
	}
	
	@Test (priority=3)
	public void clickOnElementsTest() {
		homePage.clickOnElements();
	}
	
	@Test (priority=4)
	public void clickOnFormsTest() {
		homePage.clickOnForms();
	}
	 
	@Test (priority=5)
	public void clickOnAlertsFramesWindowTest() {
		homePage.clickOnAlertsFrameWindos();	
	}
	
	@Test (priority=6)
	public void clickOnWidgetsTest() {
		homePage.clickOnWidgets();
	}
	
	@Test (priority=7)
	public void clickOnInteractionsTest() {
		homePage.clickOnInteractions();
	}
	
	@Test (priority=8)
	public void clickOnBookStoreApplicationTest() {
		homePage.clickOnBookStoreApplication();
	}
	
	@AfterMethod
	public void cleanUp() {
		driver.quit();
	}
}

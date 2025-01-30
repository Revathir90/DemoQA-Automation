package com.demoqa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.base.TestBase;
import com.demoqa.pages.ElementsPage;
import com.demoqa.pages.HomePage;

public class ElementsPageTest extends TestBase{
	ElementsPageTest elementsPageTest;
	ElementsPage elementsPage;
	HomePage homePage;
	
	
	ElementsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		TestBase.initialization();
		elementsPage = new ElementsPage();
		homePage = new HomePage();
		homePage.clickOnElements();
	}
	
	@Test (priority=1)
	public void verifyElementPageTest() {
		Assert.assertTrue(elementsPage.validateElementPage(),"Element Page content not displayed");
	}
	
	@Test
	public void clickOnTextBoxTest() {
		elementsPage.clickOnTextBox(); 
	}
	
	@Test
	public void clickOnCheckBoxTest() {
		elementsPage.clickOnCheckBox(); 
	}
	
	@Test
	public void clickOnRadioButtonTest() {
		elementsPage.clickOnRadioButton(); 
	}
	
	@Test
	public void clickOnWebTablesTest() {
		elementsPage.clickOnWebTables(); 
	}
	
	@Test
	public void clickOnButtonsTest() {
		elementsPage.clickOnButtons(); 
	}
	
	@Test
	public void clickOnLinksTest() {
		elementsPage.clickOnLinks(); 
	}
	
	@Test
	public void clickOnBrokenLinksAndImagesTest() {
		elementsPage.clickOnBrokenLinksAndImages(); 
	}
	
	@Test
	public void clickOnUploadAndDownloadTest() {
		elementsPage.clickOnUploadAndDownload(); 
	}
	
	@Test
	public void clickOnDynamicPropertiesTest() {
		elementsPage.clickOnDynamicProperties(); 
	}
	
	@AfterMethod
	public void cleanUp() {
		driver.quit();
	}

}

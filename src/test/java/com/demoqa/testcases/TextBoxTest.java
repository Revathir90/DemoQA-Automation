package com.demoqa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoqa.base.TestBase;
import com.demoqa.pages.ElementsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.elements.TextBox;
import com.demoqa.util.TestUtil;

public class TextBoxTest extends TestBase{
	
	TextBox textbox;
	TextBoxTest textboxtext;
	ElementsPage elementpage;
	HomePage homepage;
	
	public TextBoxTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		TestBase.initialization();
		homepage = new HomePage();
		elementpage = new ElementsPage();
		textbox = new TextBox();
		homepage.clickOnElements();
		elementpage.clickOnTextBox();
	}
	
	@DataProvider
	public Object[][] getValidTextBoxFieldsData() throws IOException{
		Object data[][]=TestUtil.getTestData("TextBox_ValidData");
		return data;	
	}
	
	@DataProvider
	public Object[][] getInvalidTextBoxFieldsData() throws IOException{
		Object data[][]=TestUtil.getTestData("TextBox_InvalidData");
		return data;	
	}
	
	@Test
	public void validateTextBoxPageTest() {
		Assert.assertTrue(textbox.validateTextBoxPage(),"TextBox page not loaded");
	}
	
	@Test
	public void validateTextBoxFeatureTest() {
		Assert.assertEquals(textbox.validateTextBoxFeature(), "input");
	}
		
	@Test (dataProvider="getValidTextBoxFieldsData")
	public void validateTextBoxFieldsWithValidData(String name, String email, String currentAddress, String permanantAddress) {
		textbox.enteringText(name, email , currentAddress, permanantAddress);
		Assert.assertTrue(textbox.validateOutput(),"Output Text not Displayed");
	}
	
	@Test (dataProvider="getInvalidTextBoxFieldsData")
	public void validateTextBoxFieldsWithInvalidData(String name, String email, String currentAddress, String permanantAddress) {
		textbox.enteringText(name, email , currentAddress, permanantAddress);
		Assert.assertFalse(textbox.validateOutput(),"Output Text not Displayed");
	}
	
	@Test
	public void validatingOutputTextField() {
		Assert.assertFalse(textbox.validateOutput(),"Output Text feild is enabled before giving the input");
	}

	@AfterMethod
	public void cleanUp() {
		driver.quit();
	}
	
}

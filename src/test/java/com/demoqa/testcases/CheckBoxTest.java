package com.demoqa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.demoqa.base.TestBase;
import com.demoqa.pages.ElementsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.elements.CheckBox;

public class CheckBoxTest extends TestBase{
	
	CheckBox checkbox;
	CheckBoxTest checkboxtest;
	ElementsPage elementpage;
	HomePage homepage;
	
	public CheckBoxTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		TestBase.initialization();
		homepage = new HomePage();
		elementpage = new ElementsPage();
		checkbox = new CheckBox();
		homepage.clickOnElements();
		elementpage.clickOnCheckBox();
	}
	


}


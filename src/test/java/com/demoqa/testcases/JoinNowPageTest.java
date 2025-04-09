package com.demoqa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.io.IOException;

import org.testng.Assert;

import com.demoqa.base.TestBase;
import com.demoqa.pages.JoinNowPage;

public class JoinNowPageTest extends TestBase {

	JoinNowPageTest joinNowPageTest;
	JoinNowPage joinNowPage;

	JoinNowPageTest() {
		super();
	}


	@BeforeMethod
	public void setUp() throws IOException {
		TestBase.initialization();
		joinNowPage = new JoinNowPage();
		joinNowPage.navigateToJoinNowPage();
	}

	@Test (priority=1)
	public void verifyJoinNowPageTitleTest() {
		String parentwindow=joinNowPage.windowsHandles();
		System.out.println("Current window after the method run 'windowsHandles': "+driver.getTitle());
		String acttitle = joinNowPage.validatePageTitle();
		String exptitle = "Tools QA - Selenium Training";
		Assert.assertEquals(acttitle, exptitle,"JoinNowPage Title not matched");
		driver.close();
		driver.switchTo().window(parentwindow);
		
	}
	
	@Test (priority=2)
	public void verifyJoinNowPageLogoTest() {
		String parentwindow=joinNowPage.windowsHandles();
		boolean flag=joinNowPage.validateJoinNowPageLogo();
		Assert.assertTrue(flag,"JoinNowPage logo not displayed");
		driver.close();
		driver.switchTo().window(parentwindow);
	}
	
	@AfterMethod
	public void cleanUp() {
		driver.quit();
	}

}

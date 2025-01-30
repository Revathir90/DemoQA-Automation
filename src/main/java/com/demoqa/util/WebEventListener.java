package com.demoqa.util;
/*************************************** PURPOSE **********************************

 - This class implements the WebDriverEventListener, which is included under events.
 The purpose of implementing this interface is to override all the methods and define certain useful  Log statements 
 which would be displayed/logged as the application under test is being run.

 Do not call any of these methods, instead these methods will be invoked automatically
 as an when the action done (click, findBy etc). 

 */

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestListener;

import com.demoqa.base.TestBase;

public class WebEventListener extends TestBase implements WebDriverListener, ITestListener{

	@Override
	public void afterGet(WebDriver driver, String url) {
		System.out.println("After Naigating to:"+url);
	}
	
	@Override
    public void afterClick(WebElement element) {
		System.out.println("After Clicking on the element: "+element.toString());
	}
	
	@Override
	public  void onError(Object target,
			 Method method,
			 Object[] args,
			 InvocationTargetException e) {
		System.out.println("Exception occured: " + e);
		try {
			TestUtil.takeScreenshot();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}	
}
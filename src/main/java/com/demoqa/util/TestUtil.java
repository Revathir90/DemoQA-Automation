package com.demoqa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.demoqa.base.TestBase;

public class TestUtil extends TestBase{
	public static long PAGELOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT= 20;
	
	public static String TESTDATA_SHEET_PATH ="/Users/revubharu/eclipse-workspace/DemoQAAutomation"
						+"/src/test/resources/TestData/DemoQATestData.xlsx";
	
	static Workbook workbook;
	static Sheet sheet;
	static JavascriptExecutor js;
	
	public static void switchtoFrame(int frameindex) {
		driver.switchTo().frame(0);
	}
	public static void switchtoFrame(String framename) {
		driver.switchTo().frame(framename);
	}
	public static void switchtoFrame(WebElement frameelement) {
		driver.switchTo().frame(frameelement);
	}
	
	public static void windowScroll(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	/*
	public void windowScroll(int x, int y) {
	js.executeScript("window.scrollBy(x,y)","");
	}
	*/
	
	public static void takeScreenshot() throws IOException {
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		File DestFile=new File(currentDir + "/screenshots/" +System.currentTimeMillis()+ ".png");
		FileUtils.copyFile(srcfile, DestFile);
		
	}
	
	public static Object[][] getTestData(String sheetName) throws IOException{
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = workbook.getSheet(sheetName);
		
		Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				data[i][j]= sheet.getRow(i+1).getCell(j).toString();
				//System.out.println(data[i][j]);
			}
			
		}
		return data;
	}
	
	
	
	
}


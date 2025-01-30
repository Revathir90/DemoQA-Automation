package com.demoqa.extentReportListener;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.demoqa.base.TestBase;

public class ExtentManager extends TestBase{

  public static void setExtent() throws IOException {
    htmlReporter = new ExtentSparkReporter(
        System.getProperty("user.dir") + "/test-output/ExtentReport/"
            + "TestExecutionReport"
            + ".html");
    htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/src/main/resources/"
        + "extent-config.xml");

    extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
  }
  
  public static ExtentReports getInstance() throws IOException {
      if(extent == null) {
          setExtent();
      }   
      return extent;
  }
  
  public static void endReport() {
    extent.flush();
  }
}

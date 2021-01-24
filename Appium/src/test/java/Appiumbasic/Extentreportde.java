package Appiumbasic;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreportde {
	ExtentHtmlReporter htmlReporter;
	 public ExtentReports extent;
	@BeforeSuite
	public void beforesuit() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
	    
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
	}
	@AfterSuite
	public void Afteresuit() {
		extent.flush();
	}


}

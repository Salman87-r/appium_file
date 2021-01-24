package Appiumbasic;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POM.WebElementCAl;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Appiumclass extends Extentreportde  {
	AppiumDriver<MobileElement> driver;
	//Extentreportde extent1;ii;
	ExtentTest test;
	WebElementCAl objpage;
	@BeforeTest
	public void setup() throws Exception {
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability("deviceName","Honor 8 Lite");
		ds.setCapability("uid","HGHDU17214005306");
		ds.setCapability("platformName","Android");
		ds.setCapability("platformVersion","8.0.0");
		ds.setCapability("appPackage","com.android.calculator2");

		//ds.setCapability("appActivity","com.android.calculator2.CalculatorSecurity - Calculator");
		ds.setCapability("appActivity","com.android.calculator2.Calculator");
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,ds);
		test = extent.createTest("Test ", "Test Case Started");
		System.out.println("application stated");
		objpage=new WebElementCAl(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public  void Addition() throws Exception {
		
		objpage.clickeight();
		test.log(Status.PASS, "Click on 8");
		objpage.clickplus();
		test.log(Status.PASS, "Click on plus");
		//three.click();
		objpage.clickthree();
		test.log(Status.PASS, "Click on three");
		//equals.click();
		objpage.clickequal();
		test.log(Status.PASS, "Click on equal");
		
		System.out.println(objpage.data());
		test.log(Status.PASS, "Get text of result");
		String ec ="11";
		test.log(Status.PASS, "Equal test pass");
		Assert.assertEquals(objpage.data(), ec);
		test.log(Status.INFO, "Test Completed");	 
}
	@Test
	public  void minus() throws Exception {
		
		objpage.clickfour();;
		test.log(Status.PASS, "Click on 4");
		objpage.clickminus();;
		test.log(Status.PASS, "Click on minus");
		//three.click();
		objpage.clickthree();
		test.log(Status.PASS, "Click on three");
		//equals.click();
		objpage.clickequal();
		test.log(Status.PASS, "Click on equal");
		
		System.out.println(objpage.data());
		test.log(Status.PASS, "Get text of result");
		String ec ="1";
		test.log(Status.PASS, "Equal test pass");
		Assert.assertEquals(objpage.data(), ec);
		test.log(Status.INFO, "Test Completed");	 
}	@Test
	public  void multiply() throws Exception {
	
	objpage.clickfive();;
	test.log(Status.PASS, "Click on 5");
	objpage.clickmultiply();;
	test.log(Status.PASS, "Click on multiply");
	objpage.clickthree();
	test.log(Status.PASS, "Click on three");
	//equals.click();
	objpage.clickequal();
	test.log(Status.PASS, "Click on equal");
	
	System.out.println(objpage.data());
	test.log(Status.PASS, "Get text of result");
	String ec ="15";
	test.log(Status.PASS, "Equal test pass");
	Assert.assertEquals(objpage.data(), ec);
	test.log(Status.INFO, "Test Completed");	 
}	@Test
	public  void division() throws Exception {
	
	objpage.clickeight();;
	test.log(Status.PASS, "Click on 8");
	objpage.clickdivision();;
	test.log(Status.PASS, "Click on division");
	objpage.clickfour();;
	test.log(Status.PASS, "Click on four");
	//equals.click();
	objpage.clickequal();
	test.log(Status.PASS, "Click on equal");
	
	System.out.println(objpage.data());
	test.log(Status.PASS, "Get text of result");
	String ec ="2";
	test.log(Status.PASS, "Equal test pass");
	Assert.assertEquals(objpage.data(), ec);
	test.log(Status.INFO, "Test Completed");	 
}
@AfterTest
public void aftertest() {
	driver.quit();
}
	}

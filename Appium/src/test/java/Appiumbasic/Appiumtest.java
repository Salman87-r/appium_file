package Appiumbasic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class Appiumtest extends Extentreportde  {
	AppiumDriver<MobileElement> driver;
	//Extentreportde extent1;ii;
	ExtentTest test;
	//		WebElementCAl objpage;
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public  void Addition() throws Exception {

		MobileElement one = driver.findElement(By.xpath("com.android.calculator2:id/digit_3"));
		MobileElement plus = driver.findElement(By.id("com.android.calculator2:id/op_add"));
		MobileElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
		MobileElement equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
		MobileElement result = driver.findElement(By.className("android.widget.EditText"));
		one.click();
		test.log(Status.PASS, "Click on 3");
		plus.click();
		test.log(Status.PASS, "Click on plus");
		three.click();
		test.log(Status.PASS, "Click on three");
		equals.click();
		//objpage.clickequal();
		test.log(Status.PASS, "Click on equal");

		System.out.println(result.getText());
		test.log(Status.PASS, "Get text of result");
		String ec ="4";
		test.log(Status.PASS, "Equal test pass");
		Assert.assertEquals(result.getText(), ec);
		test.log(Status.INFO, "Test Completed");



	}}



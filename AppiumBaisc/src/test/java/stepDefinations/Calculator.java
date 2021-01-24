package stepDefinations;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;

public class Calculator {
	public AndroidDriver<MobileElement> driver;
	
	@After
	public void browserClose() {
		driver.close(); 
	}
}

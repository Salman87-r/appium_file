package tests.song;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClassSong{
	public AndroidDriver<MobileElement> driver;
	@BeforeTest
	public void setUp() {
		try {
			DesiredCapabilities ds = new DesiredCapabilities();

			ds.setCapability("deviceName","Honor 8 Lite");
			ds.setCapability("uid","HGHDU17214005306");
			ds.setCapability("platformName","Android");
			ds.setCapability("platformVersion","8.0.0");
			ds.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

			ds.setCapability("appPackage", "com.android.mediacenter");
			ds.setCapability("appActivity", "com.android.mediacenter.PageActivity");
			ds.setCapability(MobileCapabilityType.NO_RESET, "true");
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url,ds);
		} catch (Exception e) {
			System.out.println("Cause: "+e.getCause());
			System.out.println("Message: "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Application Started");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

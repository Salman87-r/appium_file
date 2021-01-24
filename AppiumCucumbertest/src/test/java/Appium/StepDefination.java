package Appium;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	AppiumDriver<MobileElement> driver;
	Pagefactory objpage;
	//@Before
	@Given("enter details of mobile and application")
	public void enter_details_of_mobile_and_application() throws Exception {
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
	}

	@When("land on app")
	public void land_on_app() {
		System.out.println("application stated");
		objpage=new Pagefactory(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@Then("enter first number")
	public void enter_first_number() {
		objpage.clickeight();
	}

	@Given("enter plus")
	public void enter_plus() {
		objpage.clickplus();
	}

	@When("enter second number for addition")
	public void enter_second_number_for_addition() {
		objpage.clickthree();
	}

	@Then("enter equal for addition anser")
	public void enter_equal_for_addition_anser() {
		objpage.clickequal();
		String ec ="11";
		String ar=objpage.data();
		assertEquals(ec,ar);
	}

	@Given("enter minus")
	public void enter_minus() {
		objpage.clickminus();
	}

	@When("enter second number for subtraction")
	public void enter_second_number_for_subtraction() {
	    objpage.clicksix();
	}

	@Then("enter equal for subtraction anser")
	public void enter_equal_for_subtraction_anser() {
		objpage.clickequal();
		String ec ="2";
		String ar=objpage.data();
		assertEquals(ec,ar);
	}

	@Given("enter multiply")
	public void enter_multiply() {
		objpage.clickmultiply();
	    
	}

	@When("enter second number for multpication")
	public void enter_second_number_for_multpication() {
	   objpage.clickfour();

	}

	@Then("enter equal for multpication")
	public void enter_equal_for_multpication() {
		objpage.clickequal();
		String ec ="32";
		String ar=objpage.data();
		assertEquals(ec,ar);
	}

	@Given("enter division")
	public void enter_division() {
		objpage.clickdivision();
	}

	@When("enter second number for division")
	public void enter_second_number_for_division() {
		objpage.clickfour();
	}

	@Then("enter equal for division")
	public void enter_equal_for_division() {
		objpage.clickequal();
		String ec ="2";
		String ar=objpage.data();
		assertEquals(ec,ar);
	}
//   @After
//   public void teardown() {
//	   driver.close();
//   }
}

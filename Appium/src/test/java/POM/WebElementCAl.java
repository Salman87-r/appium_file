package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WebElementCAl {
	AppiumDriver<MobileElement> driver;
	@AndroidFindBy(id="com.android.calculator2:id/digit_1")
	public WebElement  one;
	@AndroidFindBy(id="com.android.calculator2:id/digit_2")
	public WebElement  two;	  
	@AndroidFindBy(id="com.android.calculator2:id/digit_3")
	public WebElement  three;	  
	@AndroidFindBy(id="com.android.calculator2:id/digit_4")
	public WebElement  four;	  
	@AndroidFindBy(id="com.android.calculator2:id/digit_5")
	public WebElement  five;	  
	@AndroidFindBy(id="com.android.calculator2:id/digit_6")
	public WebElement  six;	  
	@AndroidFindBy(id="com.android.calculator2:id/digit_7")
	public WebElement  seven;	  
	@AndroidFindBy(id="com.android.calculator2:id/digit_8")
	public WebElement  eight;	  
	@AndroidFindBy(id="com.android.calculator2:id/digit_9")
	public WebElement  nine;	 
	@AndroidFindBy(id="com.android.calculator2:id/digit_0")
	public WebElement  zero;
	@AndroidFindBy(id="com.android.calculator2:id/eq")
	public WebElement  equal;
	@AndroidFindBy(id="com.android.calculator2:id/op_add")
	public WebElement  plus;
	@AndroidFindBy(id = "com.android.calculator2:id/op_mul")
	public WebElement Multiply;
	@AndroidFindBy(id = "com.android.calculator2:id/op_sub")
	public WebElement Minus;
	@AndroidFindBy(id = "com.android.calculator2:id/op_div")
	public WebElement Divide;
	@AndroidFindBy(className="android.widget.EditText")
	public WebElement  result;
	@AndroidFindBy(id="com.android.calculator2:id/op_clr")
	public WebElement  clear;
	public WebElementCAl(AppiumDriver <MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	public void clickclear() {
		clear.click();
	}
	public void clickone() {
		one.click();
	}
	public void clicktwo() {
		two.click();
	}	  public void clickthree() {
		three.click();
	}	  public void clickfour() {
		four.click();
	}	  public void clickfive() {
		five.click();
	}	  public void clicksix() {
		six.click();
	}	  public void xlixkseven() {
		seven.click();
	}	  public void clickeight() {
		eight.click();
	}	  public void clicknine() {
		nine.click();
	}	  public void clickzero() {
		zero.click();
	}
	public void clickplus() {
		plus.click();
	}	  public void clickminus() {
		Minus.click();
	}	  public void clickmultiply() {
		Multiply.click();
	}	  public void clickdivision() {
		Divide.click();
	}	  public void clickequal() {
		equal.click();
	}
	public String data() {
		return result.getText();
	}


}

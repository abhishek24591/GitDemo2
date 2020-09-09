package pkg1;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author Abhishek.Deshmukh
 *
 */
/**
 * @author Abhishek.Deshmukh
 *
 */
public class Base1 extends Sample {

	
	public static void main(String[] args) throws Exception {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementByClassName("android.widget.CheckBox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementById("android:id/edit").sendKeys("Abhishek");
		driver.findElementsByClassName("android.widget.Button").get(1).click(); 
		
		
		
		
		
		
		
		
	}
}

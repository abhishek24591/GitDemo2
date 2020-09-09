package pkg1;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.WebElement;
import static java.time.Duration.ofSeconds;

public class DragAndDrop extends Base1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		TouchAction t = new TouchAction(driver);
		WebElement circle = driver.findElementByXPath("(//android.view.View)[1]");
		WebElement circle2 = driver.findElementByXPath("(//android.view.View)[2]");
		
		//longpress , move , release 
		
		t.longPress(longPressOptions().withElement(element(circle))).moveTo(element(circle2)).release().perform();

	}

}

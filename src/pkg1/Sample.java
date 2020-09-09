package pkg1;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Sample {

	public static AndroidDriver<AndroidElement> capabilities() throws Exception {
		// TODO Auto-generated method stub

		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");

		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "AbhishekPixel2");
		dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		dcap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

		// Connection to the appium server

		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://127.0.0.1:4723/wd/hub"), dcap);

		return driver;
	}

}

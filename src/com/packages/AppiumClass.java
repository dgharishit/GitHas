package com.packages;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumClass {
	public static AndroidDriver<AndroidElement> driver;

	public static AndroidDriver<AndroidElement> BaseCap() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver;
		
		// TODO Auto-generated method stub
		File file = new File("src");
		File app = new File(file,"General-Store.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android_test");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		 driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		cap.setCapability("autoGrantPermissions", "true");
		cap.setCapability("automationName","uiautomator2");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
		
		
        
	}

}

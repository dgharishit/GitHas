package com.packages;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebDriver;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends AppiumClass {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=BaseCap();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='Media']"));
		System.out.println(ele.isDisplayed());
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Tap
		TouchAction t =new TouchAction(driver);
		WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	WebElement pn=	driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		//Thread.sleep(2000);
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
		t.tap(tapOptions().withElement(element(pn))).perform();
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		
		

	}

}

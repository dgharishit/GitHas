package com.packages;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragAndDrop extends AppiumClass {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=BaseCap();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='Media']"));
		System.out.println(ele.isDisplayed());
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Tap
		TouchAction t =new TouchAction(driver);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
		WebElement first=driver.findElementsByClassName("android.view.View").get(0);
		WebElement Second=driver.findElementsByClassName("android.view.View").get(1);
		t.longPress(longPressOptions().withElement(element(first))).moveTo(element(Second)).release().perform();
		boolean Blr=driver.findElement(By.xpath("//android.widget.TextView[@text='Dropped!']")).isDisplayed();
		System.out.println(Blr);
		
		

	}

}

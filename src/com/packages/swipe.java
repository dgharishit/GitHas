package com.packages;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class swipe extends AppiumClass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=BaseCap();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TouchAction act= new TouchAction(driver);
		WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='Media']"));
		System.out.println(ele.isDisplayed());
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
		WebElement First=driver.findElement(By.xpath("//*[@content-desc='12']"));
		WebElement Second= driver.findElement(By.xpath("//*[@content-desc='2']"));
		act.longPress(longPressOptions().withElement(element(First)).withDuration(ofSeconds(2)))
		.moveTo(element(Second)).release().perform();
		
		
		
		
		
	}
	public static void Sample(){
		
	}

}

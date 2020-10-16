package com.pakage.ecommerse;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.packages.AppiumClass;
public class ECommLoginError extends AppiumClass {

	public static void main(String[] args) throws MalformedURLException {
		System.out.println("dhh");
		
	    AndroidDriver<AndroidElement> driver = BaseCap();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   // System.out.println("hh");
	    driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("");
	    driver.hideKeyboard();
	    driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Afghanistan']")).click();
	    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"));").click();
	    //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"pak\"));");
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	    String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
//	    boolean displyed=ToastMessage.isDisplayed();
//	    String Message = ToastMessage.getAttribute("name");
	    
	   
	    System.out.println("IS Displyed  and Message is"+toastMessage);
	    
	    
	    
	    

	}

}

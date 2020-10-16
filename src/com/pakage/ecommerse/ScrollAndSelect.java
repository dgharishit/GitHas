package com.pakage.ecommerse;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.packages.AppiumClass;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollAndSelect  extends AppiumClass{

	public static void main(String[] args) throws MalformedURLException {

	    AndroidDriver<AndroidElement> driver = BaseCap();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   // System.out.println("hh");
	    driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
	    driver.hideKeyboard();
	    driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Afghanistan']")).click();
	    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"));").click();
	    //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"pak\"));");
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	    driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
	    
	    //driver.findElement(MobileBy.AndroidUIAutomator("newUiScrollable(new UiSelector().resourceId"(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"
		int size=driver.findElements(By.xpath("//android.widget.TextView[@resourse-id='com.androidsample.generalstore:id/productAddCart']")).size();
		for(int i=0;i<size;i++){
			String str= driver.findElements(By.xpath("//android.widget.TextView[@resourse-id='com.androidsample.generalstore:id/productAddCart']")).get(i).getText();
			if(str.equalsIgnoreCase("Air Jordan 1 Mid SE")){
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			break;}
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

	     

		String lastpageText=    driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
        System.out.println(lastpageText);
	}

}

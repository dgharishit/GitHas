package com.facebook;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.concurrent.TimeUnit;
import org.apache.commons.*;
//import org.apache.commons.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Documents\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		ele.sendKeys("dgharish.it@gmail.com");
		String pass1 = "Maapa0o!1";
		//byte[] encodedPwdBytes = Base64.Encoder.class(pass1.getBytes());
//		//Encoder encodedBytes = Base64.getEncoder();
//		WebElement pwd = driver.findElement(By.id("j_password"));
//   
		//byte[] encodedBytes = Base64.encodeBase64("Password".getBytes());
//		System.out.println("encodedBytes "+ new String(encodedBytes));
//
//		byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
//		System.out.println("decodedBytes "+ new String(decodedBytes));
//	

		//byte[] decodedPwdBytes = Base64.decodeBase64(encodedPwdBytes);

		//String decodedPwd= new String(decodedPwdBytes))
		pass.sendKeys(pass1);
		WebElement Submit=driver.findElement(By.xpath("//button[@name='login']"));
		Submit.click();
		
		
		
		

	}

}

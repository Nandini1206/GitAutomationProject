package com.facebook.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpageobject {
	
	WebDriver driver;

	
	public void openURL()   {
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://facebook.com/");
	}
		
		
		public void enterUsername() {
		// TODO Auto-generated method stub
			
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gamil.com");
		
	}
		
		public void enterPassword() {
			// TODO Auto-generated method stub
			
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abc@gamil.com");
			
			
		}
		
		public void clickLoginButton() {
			// TODO Auto-generated method stub
			
			driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
			
			
		}
		
		public void verifyLogin() {
			// TODO Auto-generated method stub
			
			System.out.println("successful");
			
			
		}
		
		
		
	
	
}

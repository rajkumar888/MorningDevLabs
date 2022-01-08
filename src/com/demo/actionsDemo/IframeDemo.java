package com.demo.actionsDemo;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String url="http://demo.guru99.com/test/guru99home/";
		driver.get(url);
		
		
//		 driver.switchTo().frame("a077aa5e");
		 
		 WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		 driver.switchTo().frame(frameEle);
		 
		
		
		 System.out.println("********We have switched to the iframe*******");
		 driver.findElement(By.xpath("html/body/a/img")).click();
		 driver.switchTo().defaultContent();
		

		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}

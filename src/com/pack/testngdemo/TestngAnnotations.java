package com.pack.testngdemo;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
	@Test(invocationCount=20,threadPoolSize=20)
	public void test1() throws InterruptedException {
		System.out.println("Test Case 1 "+new Date() );
		Assert.assertEquals(1, 1, "Comaparison is failed.............");
//		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getId()+"...........");
	}

	
}

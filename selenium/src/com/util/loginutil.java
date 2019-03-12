package com.util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class loginutil {
 
	 public static WebDriver driver;
	 public static String url1;
	 @BeforeClass
	  public void setUp() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		 driver=new ChromeDriver();
		url1="http://localhost:8080/examsys/";
			driver.get(url1);
		
	  }
	 @AfterClass
	  public void tearDown() throws Exception {		 
		 //driver.close();
	    }
}

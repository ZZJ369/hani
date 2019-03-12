package com.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import com.util.loginutil;

public class loginpage extends loginutil{
	
	//用户名输入
	public void setusername(){
		
		driver.findElement(By.name("username")).sendKeys("hujianming");
		
	}
	
	//密码输入
	public void setpassword(){
		
		  driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).sendKeys("hujianming123");
		  
	}
	//选择类型
	public void selectlx()  {
		new Select(driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td/select"))).selectByVisibleText("管理员");
		
	}
	public void clicklogin() {
		driver.findElement(By.cssSelector("button.tm_btn")).click();
	}
	   
	
}

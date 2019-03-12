package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.loginutil;

public class tikupage extends loginutil{
	
	
	//点击题库管理
	public void tkgl() {
		driver.findElement(By.linkText("题库管理")).click();
	}
  //点击新增题库
	public void xztk() {
		driver.findElement(By.linkText("新增题库")).click();
	}
	
	//输入题库名
	public void srtkm(String name) {
		driver.findElement(By.name("d_name")).sendKeys(name);
	}
	//选择状态
	public void  xzzt() {
		WebElement c=driver.findElement(By.name("d_status"));
		Select b=new Select(c);
		b.selectByVisibleText("关闭");
	}
	//点击提交按钮
	public void tj() {
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
}

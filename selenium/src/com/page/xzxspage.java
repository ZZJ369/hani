package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.util.loginutil;

public class xzxspage extends loginutil{
	
	public static void tzzb() {
		driver.switchTo().frame("menu");
	}
	
          //点击学生管理
	public void xsgl() {
		driver.findElement(By.linkText("学生管理")).click();
	}
	//跳转到右边的框架
			public static void tzyb() {
				driver.switchTo().defaultContent();
				driver.switchTo().frame("main");
			}
	//点击新增学生
	public void xzxs() {
		driver.findElement(By.linkText("新增学生")).click();
	}
	//输入用户名u_username
	public void sryhm(String name) {
		driver.findElement(By.name("u_username")).sendKeys("name");
	}
	//输入密码u_userpass
		public void srmm(String pass) {
			driver.findElement(By.name("u_userpass")).sendKeys("pass");
		}
		//选择所属班级 u_branchid
		public void xzbj() {
			new Select(driver.findElement(By.name("u_branchid"))).selectByVisibleText("17测试4班");
		}
		//选择担任职务u_positionid
		public void drzw() {
			new Select(driver.findElement(By.name("u_positionid"))).selectByVisibleText("班长");
		}
		//输入真实姓名u_positionid
		public void zsxm(String zname) {
			driver.findElement(By.name("u_positionid")).sendKeys("zname");
		}
		//输入积分u_score
		public void jf(String score) {
			driver.findElement(By.name("u_score")).sendKeys("score");
		}
		//点击提交tm_btn tm_btn_primary
		public void tj() {
			driver.findElement(By.className("tm_btn tm_btn_primary")).click();
		}
}

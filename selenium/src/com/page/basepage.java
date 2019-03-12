package com.page;

import com.util.loginutil;

public class basepage extends loginutil{
	//跳转到左边的框架
	public  void tzzb() {
		driver.switchTo().frame("menu");
	}
	//跳转到右边的框架
		public  void tzyb() {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
		}
}

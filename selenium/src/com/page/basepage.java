package com.page;

import com.util.loginutil;

public class basepage extends loginutil{
	//��ת����ߵĿ��
	public  void tzzb() {
		driver.switchTo().frame("menu");
	}
	//��ת���ұߵĿ��
		public  void tzyb() {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
		}
}

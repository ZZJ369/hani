package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.util.loginutil;

public class xzxspage extends loginutil{
	
	public static void tzzb() {
		driver.switchTo().frame("menu");
	}
	
          //���ѧ������
	public void xsgl() {
		driver.findElement(By.linkText("ѧ������")).click();
	}
	//��ת���ұߵĿ��
			public static void tzyb() {
				driver.switchTo().defaultContent();
				driver.switchTo().frame("main");
			}
	//�������ѧ��
	public void xzxs() {
		driver.findElement(By.linkText("����ѧ��")).click();
	}
	//�����û���u_username
	public void sryhm(String name) {
		driver.findElement(By.name("u_username")).sendKeys("name");
	}
	//��������u_userpass
		public void srmm(String pass) {
			driver.findElement(By.name("u_userpass")).sendKeys("pass");
		}
		//ѡ�������༶ u_branchid
		public void xzbj() {
			new Select(driver.findElement(By.name("u_branchid"))).selectByVisibleText("17����4��");
		}
		//ѡ����ְ��u_positionid
		public void drzw() {
			new Select(driver.findElement(By.name("u_positionid"))).selectByVisibleText("�೤");
		}
		//������ʵ����u_positionid
		public void zsxm(String zname) {
			driver.findElement(By.name("u_positionid")).sendKeys("zname");
		}
		//�������u_score
		public void jf(String score) {
			driver.findElement(By.name("u_score")).sendKeys("score");
		}
		//����ύtm_btn tm_btn_primary
		public void tj() {
			driver.findElement(By.className("tm_btn tm_btn_primary")).click();
		}
}

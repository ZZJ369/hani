package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.loginutil;

public class tikupage extends loginutil{
	
	
	//���������
	public void tkgl() {
		driver.findElement(By.linkText("������")).click();
	}
  //����������
	public void xztk() {
		driver.findElement(By.linkText("�������")).click();
	}
	
	//���������
	public void srtkm(String name) {
		driver.findElement(By.name("d_name")).sendKeys(name);
	}
	//ѡ��״̬
	public void  xzzt() {
		WebElement c=driver.findElement(By.name("d_status"));
		Select b=new Select(c);
		b.selectByVisibleText("�ر�");
	}
	//����ύ��ť
	public void tj() {
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
}

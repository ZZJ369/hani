package com.testcase;
import org.testng.annotations.Test;
import com.busniss.loginbusniss;
import com.util.loginutil;

public class logintestcase extends loginutil{
  @Test
  public void login() throws Exception {
	  loginbusniss l=new loginbusniss();
	  l.loginb();
	  
  }
}

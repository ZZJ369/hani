package com.testcase;

import org.testng.annotations.Test;

import com.busniss.loginbusniss;
import com.busniss.xztkbusniss;
import com.util.loginutil;
@Test
public class xztkTestcase extends loginutil{
   loginbusniss  login=new loginbusniss();
   xztkbusniss tk=new xztkbusniss();
   public void test() throws Exception {
	   login.loginb();
	   tk.xztkcz();
   }
}

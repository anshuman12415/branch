package com.inetBankingV2.testCases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.inetBankingV2.pageObject.LoginPage;

import junit.framework.Assert;

public class Login_Test extends Baseclass {

	@Test
	public void login() {
		d.get(baseURL);
		
		LoginPage lp = new LoginPage(d);
		lp.setusername(username);
		lp.setpaswrd(password);
		lp.clicksubmit();
		 
		if (d.getTitle().equals("Branch-Winds")) {
			Assert.assertTrue(true);
			
		} else {
			Assert.assertTrue(false);
		}

	}

}

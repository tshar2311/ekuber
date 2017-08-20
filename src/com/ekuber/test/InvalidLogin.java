package com.ekuber.test;

import generic.BaseTest;
import generic.Excel;

import org.testng.annotations.Test;

import com.ekuber.page.LoginPage;

public class InvalidLogin extends BaseTest{

	@Test
	public void testInvalidLogin()
	{
		for (int i = 1; i <=Excel.getRowCount(XLPATH,"InvalidLogin"); i++) {
			
				String un = Excel.getCellValue(XLPATH,"InvalidLogin",i,0);
				String pw = Excel.getCellValue(XLPATH, "InvalidLogin",i,1);
	            LoginPage l1=new LoginPage(driver);
	            l1.enterUserName(un);
	            l1.enterPassword(pw);
	            l1.clicklogin();
	            l1.verifyErrMsgIsDisplayed();
	
		}
	}
}


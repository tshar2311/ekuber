package com.ekuber.test;

import org.testng.annotations.Test;

import com.ekuber.page.LoginPage;

import generic.BaseTest;
import generic.Excel;

public class Validlogin extends BaseTest {

	@Test
	public void testValidLogin()
	{
		String un = Excel.getCellValue(XLPATH, "Validlogin", 1, 0);
		String pwd = Excel.getCellValue(XLPATH, "Validlogin", 1, 1);
		String hp = Excel.getCellValue(XLPATH, "Validlogin",1, 2);
		LoginPage l1=new LoginPage(driver);
		l1.enterUserName(un);
		l1.enterPassword(pwd);
		l1.clicklogin();
		l1.verifyTitle(hp);
	}
}

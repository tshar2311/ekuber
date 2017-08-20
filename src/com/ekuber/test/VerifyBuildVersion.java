package com.ekuber.test;

import org.testng.annotations.Test;

import com.ekuber.page.EnterTimeTrackPage;
import com.ekuber.page.LoginPage;

import generic.BaseTest;

public class VerifyBuildVersion extends BaseTest{
	@Test(priority=3)
	public void testVerifyBuildVersion()
	{
		//verify the version
		LoginPage l=new LoginPage(driver);
		l.verifyVersion("v. 3.3");
		//username
		l.enterUserName("admin");
		//password
		l.enterPassword("manager");
		//click login
		l.clicklogin();
		//click help
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.clickHelp();
		// click about actitime
		e.clickAboutActitime();
		//verify build no
		e.verifyBuildNum("3.3 (build 17443), Auto-installation package");
		//click close button
		e.clickCloseButton();
		//logout
		e.clickLogout();
		
	}

	}
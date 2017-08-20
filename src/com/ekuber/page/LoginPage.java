package com.ekuber.page;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {
	
	@FindBy(name="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy(id="loginButton")
	private WebElement loginBTN;
	@FindBy(xpath="(//span[@class='errormsg'])[1]")
	private WebElement errMsg;
	@FindBy(xpath="//nobr[.='v. 3.3']")
	private WebElement version;
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clicklogin()
	{
		loginBTN.click();
	}
    public void verifyErrMsgIsDisplayed()
    {
    	try{
    		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	Assert.assertTrue(errMsg.isDisplayed());
    }
    public void verifyVersion(String eversion)
    {
    	String aversion=version.getText();
    	Assert.assertEquals(aversion,eversion);
    }

}

package com.ekuber.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BasePage;

public class EnterTimeTrackPage extends BasePage {
	@FindBy(xpath="//span[.='Help & Support']")
	private WebElement help;
	@FindBy(xpath="//div[contains(text(),'About actiTIME')]")
	private WebElement aboutActitime;
	@FindBy(xpath="//td[.='3.3 (build 17443), Auto-installation package']")
	private WebElement buildNum;
	@FindBy(xpath="//img[@class='close']")
	private WebElement closeBTN;
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickHelp()
	{
		help.click();
	}
	public void clickAboutActitime()
	{
		aboutActitime.click();
	}
	public void verifyBuildNum(String eBuildNum)
	{
		try{
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		String aBuildNum=buildNum.getText();
		Assert.assertEquals(aBuildNum,eBuildNum);
	}

	public void clickCloseButton()
	{
       try{
    	   Thread.sleep(2000);
       }
       catch(Exception e)
       {
    	   
       }
		closeBTN.click();
	
	}
	public void clickLogout()
	{
		logoutLink.click();
	}
	
	
}

package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest implements IAutoConst  {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void initDriver()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	@BeforeMethod
	public void openApplication()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
	}
	@AfterMethod
	public void closeApplication()
	{
		driver.quit();
	}
	

}

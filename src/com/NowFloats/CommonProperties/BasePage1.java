package com.NowFloats.CommonProperties;

import java.io.FileInputStream;
//import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage1
{

	
	public static WebDriver driver;
	public static String sTestSiteURL ;
	public static String sExpectedUrl;
	public static  String path="./app.properties";
	
		

	public static String loadData(String Key) throws IOException
	{
		Properties p =new Properties();
		
		FileInputStream fis =new FileInputStream(path);
		p.load(fis);
		String value = p.getProperty(Key);
		return value;
		
	} 
	
public static void openBrowser(String browser) throws Exception
	{
	
	
		System.out.println("Inside browser launch");
    if(browser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");      
		driver = new ChromeDriver(); 
		sTestSiteURL=loadData("test_url");
		driver.get(sTestSiteURL);
		System.out.println("Test Url:  " +sTestSiteURL);
	
	    }
else if(browser.equalsIgnoreCase("firefox"))
{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	
	driver = new FirefoxDriver();
	System.out.println("Test Url" + sTestSiteURL);
	driver.get(sTestSiteURL);
	
}
else if(browser.equalsIgnoreCase("ie"))
{
	System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	System.out.println("Test Url" + sTestSiteURL);
	driver.get(sTestSiteURL);
	
}
driver.manage().window().maximize();

	}

@BeforeClass

public void LaunchBrowser() throws Exception
{
 openBrowser("Chrome");
 
}




@AfterClass
public void CloseBrowser()
{
	driver.quit();
}
}
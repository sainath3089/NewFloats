package com.NowFloats.CommonProperties;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.FileReader;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class BasePage 
{
	
	public static WebDriver driver;
	public static String sTestSiteURL ;
	
	
	public static void readPropertiesFileNSetLocalVars()
	{
		Properties p = new Properties();
		FileReader reader;
		try
		{
			reader = new FileReader("app.properties");

			p.load(reader);
			
			sTestSiteURL = p.getProperty("test_url");
			
			reader.close();

			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void openBrowser(String browser) throws Exception
	{
if(browser.equalsIgnoreCase("Chrome"))
		{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");      
	driver = new ChromeDriver();  
	    }
else if(browser.equalsIgnoreCase("firefox"))
{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	
	driver = new FirefoxDriver();
	
}
else if(browser.equalsIgnoreCase("ie"))
{
	System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	
}
//driver.manage().window().maximize();

	}
 /* @AfterClass
  public void afterClass()
  {
	  driver.quit(); 
   }
*/
}

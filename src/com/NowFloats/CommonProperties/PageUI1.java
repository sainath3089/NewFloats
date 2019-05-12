package com.NowFloats.CommonProperties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.NowFloats.CommonProperties.BasePage1;

public class PageUI1 extends BasePage1
{
// WebDriver driver;
	//@FindBy(xpath="//a[@class='dropdown-toggle'][contains(text(),'Services')]") WebElement Services;
@FindBy(how=How.XPATH,using="//a[@class='dropdown-toggle'][contains(text(),'Services')]") WebElement Services;


public void ServicesTest() throws Exception
{
	
	Thread.sleep(3000);
	System.out.println(Services);
	Services.click();
	
}

public PageUI1(WebDriver driver)
{
  //PageFactory.initElements(driver, PageUI1.class.getName());
    PageFactory.initElements(driver, this);
	 //this.driver = driver; 
}
}

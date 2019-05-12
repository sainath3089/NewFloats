package com.NowFloats.PageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.NowFloats.CommonProperties.BasePage1;

public class PageUI extends BasePage1
{
	//Contact Number Web Elements
	
@FindBy(how=How.CLASS_NAME,using="underline") WebElement PhoneNumber;
	//Service page Web ELements
@FindBy(how=How.XPATH,using="//a[@class='dropdown-toggle'][contains(text(),'Services')]") WebElement Services;
@FindBy(how=How.XPATH,using="//a[contains(text(),'Vintage Cars')]") WebElement VintageCars;
@FindBy(how=How.XPATH,using="//a[@class='product_type_simple buy_now_button cta-btn-secondary product-btn']") WebElement BuyNow;

   //Search Page Web Elements
 @FindBy(how=How.XPATH,using="//div[@class='search']//img") WebElement SearchButton;
 @FindBy(how=How.XPATH,using="//input[@placeholder='Type keyword(s) here']") WebElement InputText;
 @FindBy(how=How.XPATH,using="//button[@class='btn btn-primary']") WebElement Search;
 
 //HomePage WEb Elememnts
 
 @FindBy(how=How.XPATH,using="//div[5]//li[1]//div[1]//div[1]//div[1]//div[3]//div[1]//a[1]//span[1]") WebElement Details;
 @FindBy(how=How.XPATH,using="//body[@id='product-details-page']/main/div[@id='product-section']/div[@class='container']/div[@class='row']/div[@class='content-area col-md-12 col-sm-12 col-xs-12']/ul[@class='products row']/li[2]/div[1]/div[1]/div[1]/div[3]/a[1]") 
 WebElement BuyNowforSelectedItem;
 
public void ServicesTest() throws Exception
{
	
	Thread.sleep(3000);
	new Actions(PageUI.driver).moveToElement(this.Services).perform();
	VintageCars.click();
	BuyNow.click();
	
	
}


public void Search() throws Exception
{
	SearchButton.click();
	Thread.sleep(5000);
	InputText.sendKeys("Test");
    Search.click();	
    String CurrentUrl = driver.getCurrentUrl();
    System.out.println(CurrentUrl);
    sExpectedUrl=loadData("ExpectedUrl");
    System.out.println(sExpectedUrl);
  
    assertEquals(CurrentUrl, sExpectedUrl);
	
}


public PageUI(WebDriver driver)
{
 
    PageFactory.initElements(driver, this);
	 
}


public void ContactNumberTest() 
{
PhoneNumber.click();	
}


public void BuyNOwForSelectedItems() throws Exception
{
   Details.click();
   BuyNowforSelectedItem.click();
   Thread.sleep(5000);
}
}

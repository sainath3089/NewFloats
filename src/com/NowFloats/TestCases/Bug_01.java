package com.NowFloats.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.NowFloats.CommonProperties.BasePage1;
import com.NowFloats.PageObjects.PageUI;


public class Bug_01 extends BasePage1
{
	
  @Test
  public void ContactNumber() throws Exception 
  {
	
	PageUI page= new PageUI(driver);
	 page.ContactNumberTest();

	  
	  }
}

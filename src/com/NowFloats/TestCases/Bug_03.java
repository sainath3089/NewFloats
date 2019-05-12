package com.NowFloats.TestCases;

import org.testng.annotations.Test;

import com.NowFloats.CommonProperties.BasePage1;
import com.NowFloats.PageObjects.PageUI;

public class Bug_03 extends BasePage1
{
  @Test
  public void SearchButton() throws Exception
  {
	  PageUI page= new PageUI(driver);
		 page.Search();

  }
}

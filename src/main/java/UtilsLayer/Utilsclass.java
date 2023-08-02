package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Utilsclass extends BaseClass{
	
	
			public static void sendkeys(WebElement wb,String value)
			{
				if(wb.isDisplayed()&&wb.isEnabled())
				{
					wb.sendKeys(value);
				}
			}

			public static void jsclick(WebElement wb)
			{
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",wb);

			}
			public static void click(WebElement wb)
			{
				wb.click();
			}
}

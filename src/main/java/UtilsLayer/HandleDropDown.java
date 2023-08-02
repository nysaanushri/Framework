package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	
	
	
	
				public static void handledown(WebElement wb,String Value)
				{
					Select sel=new Select(wb);
					sel.selectByVisibleText(Value);
				}
}





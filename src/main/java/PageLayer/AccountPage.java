package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.Utilsclass.*;
import static UtilsLayer.HandleDropDown.*;

import BaseLayer.BaseClass;

public class AccountPage extends BaseClass {
	
	
	@FindBy(name="name")
	private WebElement uname;
	
	@FindBy(name="mail")
	private WebElement eadd;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement fname;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement lname;
	
	@FindBy(name="profile_main[field_country][und]")
	private WebElement country;
	
	@FindBy(xpath="(//select[@class='form-select'])[4]")
    private WebElement state;
	
	@FindBy(xpath="//input[@name=\"profile_main[field_pin_code][und][0][value]\"]")
	private WebElement pin;
	
	@FindBy(xpath="(//select[@class=\"form-select required\"])[2]")
	private WebElement edu;
	
	@FindBy(xpath="//input[@class='form-checkbox']")
	private WebElement subscribe;
	
	
	public AccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createNewAccountFunctionality(String namee1,String eadd1,String fname1,String lname2, String country1,String state1,String pincode1,String edu1)
	{
		sendkeys(uname,namee1);
		sendkeys(eadd,eadd1);
		sendkeys(fname,fname1);
		sendkeys(lname,lname2);
		handledown(country,country1);
		handledown(state,state1);
		sendkeys(pin,pincode1);
		handledown(edu,edu1);
		click(subscribe);

	}
	

}

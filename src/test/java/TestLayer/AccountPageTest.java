package TestLayer;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.AccountPage;

public class AccountPageTest extends BaseClass {
	
		@BeforeTest()
		public void setup()
		{
			BaseClass.init();
		}
		
		@Test
		public static void validatecreateNewAccountFunctionality()
		{
            AccountPage pg=new AccountPage();
            pg.createNewAccountFunctionality("Anushri","patilanushri14@gmail.com", "Anushri", "Patil", "American Samoa","Punjab","416416","Vocational");
					
		}

		@AfterTest()
		public void teardown()
		{
			
		}
}

package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Pages.ForgotpasswordPage;
import Pages.HomePage;
import Pages.LoginPage;

public class ForgotPasswordPageTest extends TestBase{
	
	LoginPage lp;
	HomePage hp;
	ForgotpasswordPage fp;
	
	public ForgotPasswordPageTest(){
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		inilization();
		lp=new LoginPage();
		fp = new ForgotpasswordPage();
	}
	
	@Test(priority=1)
	public void VerifyForgotPasswordPageTitle(){
	lp.CLickonForgotpassword();
	fp.ForgotPasswordPopupTitle();
		
	}

	@Test(priority=2)
	public void ClickonSendEmailButton(){
		lp.CLickonForgotpassword();
		fp.CLickonSendButton(prop.getProperty("ForgotPasswordEmail"));
		//lp.LoginiconCLick();
		//lp.CLickonForgotpassword();
		//fp.CLickonSendButton(prop.getProperty("ForgotPasswordEmail"));
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}

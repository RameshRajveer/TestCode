package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage lp;
	HomePage hp;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		inilization();

		lp = new LoginPage();
	}

	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = lp.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Giftease - Gifting Experience | Online Gifting | Personalized Gifts");
	}
	
	@Test(priority=2)
	public void logingiftease(){
		hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//a[@class='user-profile-icon']")
	WebElement loginicon;

	@FindBy(id = "j_username")
	WebElement username;

	@FindBy(id = "j_password")
	WebElement password;

	@FindBy(id = "Sign")
	WebElement loginbutton;

	@FindBy(linkText = "Forgot Your Password?")
	WebElement Forgotpasswordlink;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public static String ValidateLoginPageTitle() {
		return driver.getTitle();

	}

	public HomePage login(String un, String ps) {
		loginicon.click();
		username.sendKeys(un);
		password.sendKeys(ps);
		loginbutton.click();

		return new HomePage();

	}

	public ForgotpasswordPage CLickonForgotpassword() {
		loginicon.click();
		Forgotpasswordlink.click();
		return new ForgotpasswordPage();
	}
	
	public void LoginiconCLick(){
		loginicon.click();
	}



}

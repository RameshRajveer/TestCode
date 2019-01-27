package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.TestBase;



public class ForgotpasswordPage extends TestBase{

	@FindBy(xpath="//span[@class='modal-title forgotpass']") 
	WebElement ForgotPasswordPopupTitle;
	
	@FindBy(xpath="//input[@id='forgottenPwd.email']")
	WebElement ForgotpasswordEmail;
	
	@FindBy(xpath="//button[contains(text(),'SEND EMAIL')]")
	WebElement SendEmail;
	
	@FindBy(xpath="//div[@class='newlettersuccessmessage']")
	WebElement PasswordCOnfirmationmessage;
	
	public ForgotpasswordPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public void ForgotPasswordPopupTitle(){
		
		Assert.assertEquals(ForgotPasswordPopupTitle.getText(), "Forgot Your Password");
		
	}
	
	public void CLickonSendButton(String forgotemil){
		ForgotpasswordEmail.sendKeys(forgotemil);
		SendEmail.click();
		//String message=PasswordCOnfirmationmessage.getText();
		//Assert.assertEquals(message, "Sorry, this Email ID does not exist.");
	}
}

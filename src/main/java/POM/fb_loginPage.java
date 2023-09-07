package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_loginPage {
	//declaration
	// address of email textfield
	@FindBy(id="email")
	private WebElement emailTF;
	
	//address of password
	@FindBy(id="pass")
	private WebElement passwordTF;
	
	// address of loginbutton
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginbtn;
	
	// initialization
	public fb_loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utization
	public void emailTextField(String value) {
		emailTF.sendKeys(value);
	}
	public void passwordTextField(String value) {
		passwordTF.sendKeys(value);
	}
	public void loginbutton() {
		loginbtn.click();
	}
	//getter and setter method for practice
	public WebElement getEmailTF() {
		return emailTF;
	}
	public void setEmailTF(WebElement emailTF) {
		this.emailTF = emailTF;
	}
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	public void setPasswordTF(WebElement passwordTF) {
		this.passwordTF = passwordTF;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}
	
}

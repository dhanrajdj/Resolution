package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seliniumUtilities.Utilites;

public class LoginPage {
	
	public WebDriver Idriver;
	
	public LoginPage(WebDriver rdriver){
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

//	@FindBy(xpath="https://admin-demo.nopcommerce.com/login")
//	@CacheLookup
	
	
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[text()]")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(linkText="Dashboard")
//	@FindBy(xpath="//div[@class='content-header']")
	@CacheLookup
	WebElement dashboard;

	@FindBy(linkText="Logout")
	@CacheLookup
	WebElement lnkLogout;
	
	public void setUserName(String uname){
		txtEmail.clear();
		txtEmail.sendKeys(uname);
		

	}
		
		
	
				
	public void setPassword(String paswd) throws InterruptedException{
		txtPassword.clear();
		Thread.sleep(5000);
//		txtPassword.sendKeys(paswd);
		Utilites.enter(txtPassword, "DHANRAJ", paswd);
		
		
	
		
	}
	
	public void clickLogin(){
//		btnLogin.click();
//		Utilites.click(btnLogin, "login button");
		Utilites.click(btnLogin, "SHEELU");
		
	}
	
	public void homePage(){
		System.out.println(dashboard.isDisplayed());	
	}
	
	public void clickLogout(){
		lnkLogout.click();
	}
	
	
	
}

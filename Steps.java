package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.*;
import pageObjects.LoginPage;
import seliniumUtilities.Utilites;

public class Steps {
	
//	public WebDriver driver;
//	public LoginPage lp;
	
	public WebDriver driver;
	public LoginPage lp;

//	@BeforeStep
//	public void Good(){
//		System.out.println("DHANRAJ");
//	}
//	
//	@AfterStep
//	
//	public void Bad(){
//		
//		System.out.println("SOMRAJ");
//	}
	
//	@Before(order=-1)
//	public void Check(){
//		System.out.println("SUPER");
//	}
//	
//	
//	@Before(order=0)
//	public void Cold(){
//		System.out.println("Not Super");
//	}.
	
	
	@Given("User launch Chrome browser")
	public void user_launch_Chrome_browser() {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\tttttt\\New folder\\chromedriver_win32\\\\chromedriver.exe");
//	driver=new ChromeDriver();
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\tttttt\\New folder (2)\\chromedriver_win32\\\\chromedriver.exe");
	

	
	driver=new ChromeDriver();	
	
	lp=new LoginPage(driver);
		
		
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String dj) {
	
	driver.get(dj);
	driver.manage().window().maximize();
	
	}
	
//	@When("User enters Email as {string} and Password as \"admin")
//	public void user_enters_Email_as_and_Password_as_admin(String email) {
//	lp.setUserName(email);	

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String pwde) throws InterruptedException {
	   
	  lp.setUserName(email);  
			  
		
	  
	  lp.setPassword(pwde);
	  
	  

	}		
	

	@When("Click on Login")
	public void click_on_Login() throws InterruptedException {
	lp.clickLogin();
	lp.homePage();

	}
	@Then("Page Title should {string}")
	public void page_Title_should(String title) {
	
//	if(driver.getPageSource().contains("Login was unsuccessful")){	
//	driver.close();
//	Assert.assertTrue(false);
//	}else{
//		Assert.assertEquals(title,driver.getTitle());
//	}
		
	}

	@When("User click on Log out Link")
	public void user_click_on_Log_out_Link() throws InterruptedException {
	
	
	
	lp.clickLogout();
	Thread.sleep(3000);

	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String string) {
	
	}
	
	

	@Then("Close browser")
	public void close_browser() {
	
//	driver.close();	

	}

}

		
		
	
	
	


		
	


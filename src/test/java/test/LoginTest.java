package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	String username="demo@techfios.com";
	String password="abc123";
	WebDriver driver;
	@Test
	public void userShouldBeAbleToLogin() {
		
	driver=	BrowserFactory.init();
//	BrowserFactory.tearDown();
	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	loginpage.insertUserName(username);
	loginpage.insertPassword(password);
	loginpage.clickOnLoginButton();
	
	DashboardPage dashboardpage=PageFactory.initElements(driver,DashboardPage.class);
	dashboardpage.DashboradValidation();
	BrowserFactory.tearDown();
	}
	

}

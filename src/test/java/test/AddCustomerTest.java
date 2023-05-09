package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	String username = "demo@techfios.com";
	String password = "abc123";
	String fullname = "malak ali";
	String company = "Techfios";
	String email = "demo@techfios.com";
	String phone = "88888";
	String country = "Yemen";
@Test
	public void userShouldBeAbleToAddCustomer() {
		driver = BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(username);
		loginpage.insertPassword(password);
		loginpage.clickOnLoginButton();
		
		DashboardPage dashboardpage=PageFactory.initElements(driver,DashboardPage.class);
		dashboardpage.DashboradValidation();
		dashboardpage.clickOnCustomerMenuElement();
		dashboardpage.clickOnAddCustomerMenuElement();
		
		AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
		addcustomerpage.addCustomerHeaderValidation();
		addcustomerpage.insertFullName(fullname);
 	    addcustomerpage.insertCompanyName(company);
 	    addcustomerpage.insertEmail(email);
 	    addcustomerpage.insertPhoneNumber(phone);

	}

}

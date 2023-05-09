package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADD_CUTOMER_MENU_ELEMENT;
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
		
	public void DashboradValidation() {

		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "Dashboard", "dashborad page is not found");

	}
	public void clickOnCustomerMenuElement() {
		CUSTOMER_MENU_ELEMENT.click();
	}
	public void clickOnAddCustomerMenuElement() {
		ADD_CUTOMER_MENU_ELEMENT.click();
	}

	
	}
	



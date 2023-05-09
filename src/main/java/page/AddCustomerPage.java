package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Contact')]")
	WebElement ADD_CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMAPNY_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_ELEMENT;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addCustomerHeaderValidation() {

		Assert.assertEquals(ADD_CUSTOMER_HEADER_ELEMENT.getText(), "Add Contact", "add cutomer pag is not found");

	}

	public void insertFullName(String fullname) {
		String insertedfullname = fullname + generateRandomNum(999);
		FULL_NAME_ELEMENT.sendKeys(insertedfullname);
	}

	public void insertCompanyName(String company) {
		selectFromDropDown(COMAPNY_NAME_ELEMENT, company);
	}

	public void insertEmail(String email) {
		String insertedemail = generateRandomNum(999) + email;
		EMAIL_ELEMENT.sendKeys(insertedemail);

	}

	public void insertPhoneNumber(String phone) {
		String insertedphonenum = generateRandomNum(999) + phone;
		PHONE_NUMBER_ELEMENT.sendKeys(insertedphonenum);
	}
	public void SelectCountryElement(String country) {
		selectFromDropDown(COUNTRY_ELEMENT, country);
	}

}
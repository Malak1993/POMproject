package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public int generateRandomNum(int bounderyNum) {
		Random rnd = new Random();
		return rnd.nextInt(bounderyNum);
	}

	public void waitforElement(WebDriver driver, int waittimeinSec, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, waittimeinSec);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	public void selectFromDropDown(WebElement element,String visibletext) {
		Select sel=new Select(element);
		sel.selectByVisibleText(visibletext);
	}
	

}

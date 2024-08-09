package page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BrowserFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage() {
		
	}
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}


	@FindBy (how = How.XPATH, using = "//*[@id=\"user_name\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH,using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"login_submit\"]") WebElement SIGNIN_BUTTON_ELEMENT;
	
	//INDIVIDUAL METHOD
	public void insertUserName(String userName) {
		
		USER_NAME_ELEMENT.sendKeys(userName);
	}

	public void insertPassword(String password) {
		
		PASSWORD_ELEMENT.sendKeys(password);
	}


	public void clicksigninButton() {
		
		SIGNIN_BUTTON_ELEMENT.click();
	}

// CONBIND METHOD
//	 public void performLogin(String userName, String password) {
//		 
//		 USER_NAME_ELEMENT.sendKeys(userName); 
//		 PASSWORD_ELEMENT.sendKeys(password);
//		 SIGNIN_BUTTON_ELEMENT.click();
//	 }
}

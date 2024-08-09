package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	String userName = "demo@codefios.com";
	String password = "abc123";
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		//object or by name of class
	
		driver = BrowserFactory.init();
		
		//LoginPage loginPage1 = new LoginPage(driver);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clicksigninButton();
	
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		//String actualDashboadHeaderText = dashboardPage.validateDashboardPage();
		Assert.assertEquals(dashboardPage.validateDashboardPage(), "Dashboard", "Dashboard page not found");
		BrowserFactory.tearDown();
	}
}

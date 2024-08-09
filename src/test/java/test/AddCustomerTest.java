package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	
	String userName = "demo@codefios.com";
	String password = "abc123";
	
	@Test
	public void userShouldBeAbleToAddCustomer() {
		
		driver = BrowserFactory.init();
		//LoginPage loginPage1 = new LoginPage(driver);
				LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
				
				loginPage.insertUserName(userName);
				loginPage.insertPassword(password);
				loginPage.clicksigninButton();
			
				
				DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
				//String actualDashboadHeaderText = dashboardPage.validateDashboardPage();
				Assert.assertEquals(dashboardPage.validateDashboardPage(), "Dashboard", "DashBoard Page not found!!");
	
				dashboardPage.ClickCustomerMenuButton();
				dashboardPage.ClickAddCustomerMenuButton();
				AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
				assertEquals(addCustomerPage.validateAddCustomerPage(), "New Customer", "Add Customer page not found!");
				addCustomerPage.insertFullName("Selenium");
				addCustomerPage.selectCompany("Techfios");
				addCustomerPage.insertEmail("abc123@techfios.com");
				
				addCustomerPage.selectCountry("Aruba");
	
	}		

}

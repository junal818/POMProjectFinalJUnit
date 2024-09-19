package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;


public class LoginTest {
	
	WebDriver driver;
	
	String userName = "demo@codefios.com";
	String password = "abc123";
	
	@Test
	public void validUserShouldBeAbleTpLogin() {
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSigninButton();
		
		DashBoardPage dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		String actualDashboardHeaderText = dashBoardPage.validateDashboardPage();
		
		BrowserFactory.tearDown();
}
}
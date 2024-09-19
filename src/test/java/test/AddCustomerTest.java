package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	
	String userName = "demo@codefios.com";
	String password = "abc123";
	
	@Test
	public void userShouldBeAbleToAddCustomer()  {

		driver = BrowserFactory.init();
		

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSigninButton();
		
		DashBoardPage dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		
		dashBoardPage.clickCustomerMenuButton();
		dashBoardPage.clickAddCustomerMenuButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		
		addCustomerPage.insertFullName("Junmun");
		addCustomerPage.selectCompany("Techfios");
		addCustomerPage.insertEmail("junmun@gmail.com");
		addCustomerPage.insertPhoneNum("4695280068");
		addCustomerPage.insertAddress("queens");
		addCustomerPage.insertCity("Newyork");
		addCustomerPage.selectGroup("SQL");
		addCustomerPage.insertZipcode("76229");
		addCustomerPage.clickSave();
		addCustomerPage.selectCountry("United States of America");
}
}	

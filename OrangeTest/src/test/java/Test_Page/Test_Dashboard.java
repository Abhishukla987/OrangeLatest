package Test_Page;

import java.awt.AWTException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import Orange_Page.BaseClass;
import Orange_Page.Login_Admin;
import Utility_Page.ConfingLoginData;


public class Test_Dashboard extends BaseClass{
	@Test
	public void loginApp() {
		logger=report.createTest("Login_Orange");
		ConfingLoginData ConfigLogin = new ConfingLoginData();
		logger.info("Starting Applicaton");
		Login_Admin Loging_page= PageFactory.initElements(driver, Login_Admin.class);
		Loging_page.loginAdmin_Orange(ConfigLogin.getUsername(), ConfigLogin.getPassword());
		logger.pass("The TL Loging shows Success");
		
	}
	
	@Test(dependsOnMethods = {"loginApp",})
	public void My_Info_page() throws InterruptedException, AWTException {
		logger=report.createTest("Login Orange App");
		logger.info("Login Orange");
		Login_Admin LogingTL_page= PageFactory.initElements(driver, Login_Admin.class);
		LogingTL_page.My_Info();
		logger.pass("The TL Create New Work-Item shows Success");
		
	}

}

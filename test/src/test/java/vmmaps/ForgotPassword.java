package vmmaps;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ForgotPassword {

//	 = "mr.smartzee@gmail.com";
	String password = "demo";

	@BeforeTest
	public void setUp() {
		Helper.precondition();
		Helper.getDriver().get(Helper.getApplicationUrl());
	}

	@Test(priority = 1)
	@Parameters({ "email" })
	public void enterEmail(String email) {
		Repository.loginEmail.click();
		Repository.loginEmail.sendKeys(email);
	}

	@Test(priority = 2)
	public void clickForgotPassword() {
		Repository.forgotPassword.click();
	}

	@AfterTest
	public void tearDown() {
//		 Close the browser
		Helper.getDriver().quit();
	}

}

package vmmaps;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchApplicationAndLogin {

	@BeforeTest
	public void setUp() {
		Helper.precondition();
		Helper.getDriver().get(Helper.getApplicationUrl());
	}

	@Test
	@Parameters({ "email" })
	public void enterEmail(String email) {
		Repository.loginEmail.click();
		Repository.loginEmail.sendKeys(email);
	}

	@Test(dependsOnMethods = "enterEmail")
	@Parameters({ "password" })
	public void enterPassword(String password) {
		Repository.loginPassword.click();
		Repository.loginPassword.sendKeys(password);
	}

	@Test(dependsOnMethods = "enterPassword")
	public void clickLogin() {
		Helper.getDriver().findElement(By.id("loginSubmit")).click();
	}

	@Test(dependsOnMethods = "clickLogin")
	public void validateLogin() {
		boolean check = Repository.homePage.isDisplayed();
		Assert.assertTrue(check, "Element is not displayed");
	}

	@AfterTest
	public void tearDown() {
//		 Close the browser
		Helper.getDriver().quit();
	}
}
package vmmaps;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registration {
	String name = "Dhuvarakesan";
	String email = "dhuvarakesan.m@gmail.com";
	String mobilenumber = "8508558899";
	String password = "Demo@1234";
	String confirmPassword = "Demo@1234";

	@BeforeTest
	public void setUp() {
		Helper.precondition();
		Helper.getDriver().get(Helper.getApplicationUrl());
	}

	@Test
	public void clickRegisterHere() {
		Repository.registerHere.click();
	}

	@Test
	public void enterFullName() {
		Repository.fullName.click();
		Repository.fullName.sendKeys(name);
		Repository.fullName.sendKeys(Keys.ENTER);
	}

	@Test
	public void enterEmail() {
		Repository.email.sendKeys(email);
		Repository.email.sendKeys(Keys.ENTER);
	}

	@Test
	public void enterMobile() {
		Repository.moblieNumber.sendKeys(mobilenumber);
		Repository.moblieNumber.sendKeys(Keys.ENTER);
	}

	@Test
	public void enterPassword() {
		Repository.password.sendKeys(password);
		Repository.password.sendKeys(Keys.ENTER);
	}

	@Test
	public void enterConfirmPassword() {
		Repository.confirmPassword.sendKeys(confirmPassword);
	}

	@Test
	public void clickTermsPolicy() {
		Repository.termsPolicy.click();
	}

	@Test
	public void clickNewsLetter() {
		Repository.newsLetter.click();
	}

	@Test
	public void clickRegister() {
		Repository.register.click();
	}

	@AfterTest
	public void tearDown() {
//		 Close the browser
		Helper.getDriver().quit();
	}

}

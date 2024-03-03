package vmmaps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Repository {

	@FindBy(css = "span.New-user-Register-Here#registerHere")

	public static WebElement registerHere;

	@FindBy(xpath = "//input[@id='signup-username']")

	public static WebElement fullName;

	@FindBy(xpath = "//input[@id='signup-email']")

	public static WebElement email;

	@FindBy(xpath = "//input[@id='signup-mobile']")

	public static WebElement moblieNumber;

	@FindBy(xpath = "//input[@id='signup-password']")

	public static WebElement password;

	@FindBy(xpath = "//input[@id='signup-confirmPassword']")

	public static WebElement confirmPassword;

	@FindBy(xpath = "//input[@id='terms-vms-policy']")

	public static WebElement termsPolicy;

	@FindBy(xpath = "//input[@id='newsLetter']")

	public static WebElement newsLetter;

	@FindBy(xpath = "//input[@id='signup-submit-text']")

	public static WebElement register;

	@FindBy(xpath = "//input[@id='login-email']")

	public static WebElement loginEmail;

	@FindBy(xpath = "//input[@id='login-password']")

	public static WebElement loginPassword;

	@FindBy(xpath = "//p[contains(text(), 'Manage your info')]")

	public static WebElement homePage;

	@FindBy(xpath = "//input[@type=\"email\"]")

	public static WebElement username;

	@FindBy(xpath = "//span[@class='Forgot-Password' and @id='Forgot-Password']\r\n")

	public static WebElement forgotPassword;

}

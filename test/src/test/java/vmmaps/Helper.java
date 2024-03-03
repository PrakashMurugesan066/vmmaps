package vmmaps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
	private static String vmmapsUrl = "https://accounts.vmmaps.com/";
	public static WebDriver driver;

	public static String getApplicationUrl() {
		return vmmapsUrl;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@SuppressWarnings("deprecation")
	public static void precondition() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, Repository.class);
	}

}

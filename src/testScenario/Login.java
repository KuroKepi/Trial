package testScenario;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import object.LoginApplication;

public class Login {

	LoginApplication objRep;
	WebDriver driver;

	@BeforeTest
	public void setup() {
		if (driver == null) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		objRep = new LoginApplication(driver);
	}

	@Test(priority = 0)
	public void verifyHeaderHomePage() throws InterruptedException {
		objRep.verifyHeader();
	}

	@Test(priority = 1)
	public void clickLinkForgotPassword() throws InterruptedException {
		objRep.clickForgotPassword();
	}

	@Test(priority = 2)
	public void verifyHeaderPassword() throws InterruptedException {
		objRep.headerForgotPassword();
	}

	@Test(priority = 3)
	public void inputName() throws InterruptedException {
		objRep.insertFieldName("testar");
	}

	@Test(priority = 4)
	public void inputEmail() throws InterruptedException {
		objRep.insertFieldEmail("kokoro@gmail.com");
	}

	@Test(priority = 5)
	public void inputPhone() throws InterruptedException {
		objRep.insertFieldPhoneNumber("0812132");
	}

	@Test(priority = 6)
	public void clickButtonResetLogin() throws InterruptedException {
		objRep.clickResetLogin();
	}

	@Test(priority = 7)
	public void verifyHeaderPasswordAfter() throws InterruptedException {
		objRep.verifyHeaderForgotPassword();
	}

	@Test(priority = 8)
	public void clickButtonGoToLogin() throws InterruptedException {
		objRep.clickGoToLogin();
	}

	@Test(priority = 9)
	public void inputUsername() throws InterruptedException {
		objRep.inputUsername("testing");
	}

	@Test(priority = 10)
	public void inputPassword() throws InterruptedException {
		objRep.inputPassword("rahulshettyacademy");
	}

	@Test(priority = 11)
	public void clickCheckBoxRemember() throws InterruptedException {
		objRep.clickCheckBoxRemember();
	}

	@Test(priority = 12)
	public void clickCheckBoxTerm() throws InterruptedException {
		objRep.clickCheckBoxTerm();
	}

	@Test(priority = 13)
	public void clickButtonSignIn() throws InterruptedException {
		objRep.clickButtonSignIn();
	}

	@Test(priority = 14)
	public void verifyAfterLogin() throws InterruptedException {
		objRep.verifyAfterLogin();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginApplication {
	WebDriver driver;

	public LoginApplication(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//h1[contains (text(), 'Sign')]") public WebElement header;
	@FindBy(id ="inputUsername") public WebElement fieldUsername;
	@FindBy(xpath="//input[@name='inputPassword']") public WebElement fieldPasword;
	@FindBy(id="chkboxOne") public WebElement checkBoxRemember;
	@FindBy(id="chkboxTwo") public WebElement checkBoxTerm;
	@FindBy(xpath="//a[contains(text(),'Forgot')]") public WebElement linkForgotPassword;
	@FindBy(xpath="//button[@class='submit signInBtn']") public WebElement buttonSignIn;
	@FindBy(xpath="//h2[contains(text(), 'Forgot password')]") public WebElement headerForgotPassword;
	@FindBy(xpath="//input[@type='text' and @placeholder='Name']") public WebElement fieldName;
	@FindBy(xpath="//input[@type='text' and @placeholder='Email']") public WebElement fieldEmail;
	@FindBy(xpath="//input[@type='text' and @placeholder='Phone Number']") public WebElement fieldPhoneNumber;
	@FindBy(xpath="//button[@class='go-to-login-btn']") public WebElement buttonGoToLogin;
	@FindBy(xpath="//button[@class='reset-pwd-btn']") public WebElement buttonResetLogin;
	@FindBy(xpath="//p[contains(text(),'Please use temporary')]") public WebElement verifyHeaderForgotPassword;
	@FindBy(xpath="//p[contains(text(),'You are')]") public WebElement verifyHeaderSuccesLogin;

	public void verifyHeader() throws InterruptedException {
		Thread.sleep(2000);
		String verifyHeaderHome = header.getText();
		Assert.assertEquals(verifyHeaderHome, "Sign in");
	}

	public void clickForgotPassword() throws InterruptedException {
		Thread.sleep(2000);
		linkForgotPassword.click();
	}

	public void headerForgotPassword() throws InterruptedException {
		Thread.sleep(2000);
		String HeaderPasswordHome = headerForgotPassword.getText();
		Assert.assertEquals(HeaderPasswordHome, "Forgot password");
	}

	public void verifyHeaderForgotPassword() throws InterruptedException {
		Thread.sleep(2000);
		String verifyHeaderHomeForgotPassword = verifyHeaderForgotPassword.getText();
		Assert.assertEquals(verifyHeaderHomeForgotPassword,
				"Please use temporary password 'rahulshettyacademy' to Login.");
	}

	public void insertFieldName(String inputName) throws InterruptedException {
		Thread.sleep(2000);
		fieldName.clear();
		fieldName.sendKeys(inputName);
	}

	public void insertFieldEmail(String inputEmail) throws InterruptedException {
		Thread.sleep(2000);
		fieldEmail.clear();
		fieldEmail.sendKeys(inputEmail);
	}

	public void insertFieldPhoneNumber(String inputPhone) throws InterruptedException {
		Thread.sleep(2000);
		fieldPhoneNumber.clear();
		fieldPhoneNumber.sendKeys(inputPhone);
	}

	public void clickGoToLogin() throws InterruptedException {
		Thread.sleep(2000);
		buttonGoToLogin.click();
	}

	public void clickResetLogin() throws InterruptedException {
		Thread.sleep(2000);
		buttonResetLogin.click();
	}

	public void inputUsername(String username) throws InterruptedException{
		Thread.sleep(2000);
		fieldUsername.clear();
		fieldUsername.sendKeys(username);
	}
	
	public void inputPassword(String password) throws InterruptedException{
		Thread.sleep(2000);
		fieldPasword.clear();
		fieldPasword.sendKeys(password);
	}
	
	public void clickCheckBoxRemember() throws InterruptedException {
		Thread.sleep(2000);
		checkBoxRemember.click();
	}

	public void clickCheckBoxTerm() throws InterruptedException {
		Thread.sleep(2000);
		checkBoxTerm.click();
	}

	public void clickButtonSignIn() throws InterruptedException {
		Thread.sleep(2000);
		buttonSignIn.click();
	}

	public void verifyAfterLogin() throws InterruptedException {
		Thread.sleep(2000);
		String verfiyHeaderAfterLogin = verifyHeaderSuccesLogin.getText();
		Assert.assertEquals(verfiyHeaderAfterLogin, "You are successfully logged in.");
	}
}

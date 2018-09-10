package integration.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends MobilePageObject {
    public LoginPage(WebDriver driver) {
        super(driver);}

        @AndroidFindBy(xpath="//input[@type='email']")
        @iOSFindBy(xpath="//XCUIElementTypeButton[@label='Log In']")
        private WebElement loginEmail;

        @AndroidFindBy(xpath="//input[@type='password']")
        @iOSFindBy(xpath="//XCUIElementTypeTextField[@name=\"Email address\"]")
        private WebElement loginPassword;

        @AndroidFindBy(xpath="//*[@type='button' and text()='Login']")
        @iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Next Button\"]")
        private WebElement loginSubmit;

        @AndroidFindBy(xpath="//input[@type='email' and @placeholder='Email Address']")
        @iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'not registered')]")
        private WebElement emailId;

        @AndroidFindBy(xpath="//input[@type='email' and @placeholder='Confirm Email Address']")
        @iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Next Button\"]")
        private WebElement confirmEmailId;

        @AndroidFindBy(xpath="//input[@type='text' and @placeholder='First Name']")
        @iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Next Button\"]")
        private WebElement firstName;

        @AndroidFindBy(xpath="//input[@type='text' and @placeholder='Last Name']")
        @iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Next Button\"]")
        private WebElement lastName;

        @AndroidFindBy(xpath="//input[@type='password' and @placeholder='Password']")
        @iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Next Button\"]")
        private WebElement password;

        @AndroidFindBy(xpath="//input[@type='password' and @placeholder='Confirm Password']")
        @iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Next Button\"]")
        private WebElement confirmPassword;

        @AndroidFindBy(xpath="//*[@type='button' and text()='Sign Up']")
        @iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Next Button\"]")
        private WebElement signUpButton;

        @AndroidFindBy(xpath="//*[@type='button' and text()='Next']")
        @iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Next Button\"]")
        private WebElement nextButton;


    public void enterLoginCredentials(String email,String pass){
        loginEmail.sendKeys(email);
        loginPassword.sendKeys(pass);
        loginSubmit.submit();
    }

    public void clickSignUpOption(){
        signUpButton.click();
    }

    public void enterSignUpDetails(String email)
    {
        emailId.sendKeys(email);
        confirmEmailId.sendKeys(email);
        firstName.sendKeys("sam");
        lastName.sendKeys("lastname");
        password.sendKeys("password");
        confirmPassword.sendKeys("password");
        nextButton.submit();
    }



}

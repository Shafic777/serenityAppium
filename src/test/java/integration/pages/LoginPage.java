package integration.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends MobilePageObject {
    public LoginPage(WebDriver driver) {
        super(driver);

        @AndroidFindBy(xpath="//android.widget.Button[@text='Log In']")
        @iOSFindBy(xpath="//XCUIElementTypeButton[@label='Log In']")
        private WebElement WPLogInButton;

        @AndroidFindBy(xpath="//android.widget.EditText")
        @iOSFindBy(xpath="//XCUIElementTypeTextField[@name=\"Email address\"]")
        private WebElement WPEmailAddressField;

        @AndroidFindBy(id="org.wordpress.android:id/primary_button")
        @iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Next Button\"]")
        private WebElement WPLogInPageNextButton;

        @AndroidFindBy(id="org.wordpress.android:id/textinput_error")
        @iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'not registered')]")
        private WebElement WPLogInPageInvalidEmailErrorMessage;

        @FindBy(id="com.flipkart.android:id/btn_mlogin")
        private WebElement existingUsersignIn;

        @FindBy(id="com.flipkart.android:id/mobileNo")
        private WebElement userId;

        @FindBy(id="com.flipkart.android:id/et_password")
        private WebElement password;

        @FindBy(id="com.flipkart.android:id/btn_mlogin")
        private WebElement login_Button;
    }
}

package integration;

import integration.serenitySteps.IFixitSteps;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/ifixit.feature")
public class IFixitAppTest {

    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @Steps
    public IFixitSteps userSteps;

    @Test
    public void verifyInvalidLogin(){
        try {
            userSteps.clickOnStartARepairButton();
            userSteps.clickOnCarAndTruckText();
            userSteps.clickOnAcuraText();
            userSteps.waitkOnXCUIElementTypeNavigationBar();
            userSteps.isXCUIElementTypeNavigationBarShown();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

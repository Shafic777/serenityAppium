package integration.cucumer;

import cucumber.api.java.en.*;
import integration.serenitySteps.LoginSteps;
import integration.serenitySteps.WordPressLoginSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class LoginScenarioSteps {


    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @Steps
    LoginSteps loginSteps;

    @Given("User is on login page")
    public void gotoLoginPage(){
       // loginSteps.enterLoginData(email,pass);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("I login using \"(.*)\" and \"(.*)\" credentials")
    public void enterValidData(String email,String pass){
        loginSteps.enterLoginData(email,pass);
    }

    @Then("I should be able to login to system")
    public void checkErrorMessage(){
        //loginSteps.checkErrorMessage();
    }
}


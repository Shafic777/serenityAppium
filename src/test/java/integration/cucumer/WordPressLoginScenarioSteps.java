package integration.cucumer;

//import cucumber.annotation.en.*;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

import integration.serenitySteps.WordPressLoginSteps;

public class WordPressLoginScenarioSteps {

    @Steps
    WordPressLoginSteps loginSteps;

    @Given("User is on login pages")
    public void gotoLoginPage(){
        loginSteps.loginPageInvalidDataInput();
    }

    @When("Enter invalid credentials")
    public void enterInvalidData(){
        loginSteps.enterLoginData();
    }

    @Then("User is shown error message")
    public void checkErrorMessage(){
        loginSteps.checkErrorMessage();
    }

}

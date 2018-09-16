package integration.serenitySteps;


import integration.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;


    @Step
    public void enterLoginData(String emailid,String pass){
        loginPage.enterLoginCredentials(emailid,pass);
    }

    @Step
    public void enterSignUpData(String emailid){
        loginPage.enterSignUpDetails(emailid);
    }

    /*@Step
    public void checkErrorMessage(){
        assertThat(loginPage.isErrorMessageShownWPLoginPage()).isTrue();
    }*/
}

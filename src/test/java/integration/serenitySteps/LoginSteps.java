package integration.serenitySteps;


import integration.pages.WordPressLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps extends ScenarioSteps {

    WordPressLoginPage loginPage;

    @Step
    public void loginPageDataInput(){
        loginPage.gotoWPLoginPage();
    }

    @Step
    public void enterLoginData(){
        loginPage.enterInvalidEmailIdWPLoginPage();
    }

    @Step
    public void checkErrorMessage(){
        assertThat(loginPage.isErrorMessageShownWPLoginPage()).isTrue();
    }
}

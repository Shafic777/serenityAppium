package integration;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Managed;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import integration.serenitySteps.WordPressLoginSteps;

//@RunWith(SerenityRunner.class)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/loginFlow.feature")
public class loginToIndigoSkyAppTest {

}

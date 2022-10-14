package org.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.LoginActions;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver;
    LoginActions loginActions;

    public LoginSteps(CommonSteps commonSteps, LoginActions loginActions) {
        this.driver = commonSteps.getDriver();
        this.loginActions=loginActions;
    }
    @Given("Open the application in url")
    public void open_the_application_in_url() {
        driver.get("https://demo.guru99.com/V1/");
    }

    @When("enter valid username and password")
    public void enter_valid_username_and_password() {
        loginActions.enterUserId();
        loginActions.enterPassword();
        loginActions.clickOnLogin();
    }

    @Then("Login should be successfully")
    public void login_should_be_successfully() {
        System.out.println("Login should be successfully");
    }



}

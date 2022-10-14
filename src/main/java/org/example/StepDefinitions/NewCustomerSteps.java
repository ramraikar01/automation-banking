package org.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.NewCustomerActions;
import org.openqa.selenium.WebDriver;

public class NewCustomerSteps {
    WebDriver driver;

    CommonSteps commonSteps;
    NewCustomerActions newCustomerActions;


    public NewCustomerSteps(CommonSteps commonSteps,NewCustomerActions newCustomerActions) {
        this.driver = commonSteps.getDriver();
        this.newCustomerActions=newCustomerActions;
    }
    @Given("Open the url in browser")
    public void open_the_url_in_browser() {
        driver.get("https://demo.guru99.com/V1/html/addcustomerpage.php");
    }

    @When("Enter the CustomerName and Address")
    public void enter_the_customer_name_and_address() {
        newCustomerActions.enterCustomerName();
    }

    @Then("Login should be success")
    public void login_should_be_success() {
        System.out.println("Login should be success");
    }

}


package org.example.PageActions;

import org.example.PageElements.LoginElements;
import org.example.StepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class LoginActions {

    WebDriver driver;
    CommonSteps commonSteps;
    LoginElements loginElements;

    public LoginActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.loginElements=new LoginElements(driver);
    }

    public void enterUserId(){
        loginElements.UserId.sendKeys("mngr446962");

    }
    public void enterPassword(){
        loginElements.Password.sendKeys("qEsyzAj");
    }
    public  void clickOnLogin(){
        loginElements.Login.click();
    }
}


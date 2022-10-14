package org.example.PageActions;
import org.example.StepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class NewCustomerActions {
    WebDriver driver;
    NewCustomerElement newCustomerElement;

    public NewCustomerActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.newCustomerElement=new NewCustomerElement(driver);
    }
    public  void enterCustomerName(){
        newCustomerElement.Customer.
        newCustomerElement.Gender.sendKeys();
        newCustomerElement.dateOfBirth.sendKeys("12/05/2022");
        newCustomerElement.Address.sendKeys("sambhaji nagar");
        newCustomerElement.City.sendKeys("pune");
        newCustomerElement.State.sendKeys("mh");
        newCustomerElement.Pin.sendKeys("412201");
        newCustomerElement.Telephone.sendKeys("92548624568");
        newCustomerElement.Email.sendKeys("ram2123@gmail.com");
        newCustomerElement.Submit.click();
    }
}


package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {
    WebDriver driver;

    @FindBy(xpath = "//input[@onkeyup='validateuserid();']")
    public WebElement UserId;

    @FindBy(xpath = "//input[@onkeyup='validatepassword();']")
    public WebElement Password;

    @FindBy(xpath = "//input[@name='btnLogin']")
    public WebElement Login;


    public LoginElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}


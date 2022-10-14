package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerElements {
    WebDriver driver;

    @FindBy(xpath = "//input[@onkeyup='validatecustomername();']")
    public WebElement CustomerName;

    @FindBy(xpath = "//input[@name='rad1']")
    public WebElement Male;

    @FindBy(xpath = "//input[@name='dob']")
    public WebElement dateOfBirth;

    @FindBy




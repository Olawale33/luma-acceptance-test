package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {
    //Element locator
    @FindBy(id = "firstname")
    public static WebElement FirstNameField;

    @FindBy(id = "lastname")
    public static WebElement LastNameField;

    @FindBy(name = "email")
    public static WebElement EmailField;

    @FindBy(id = "password")
    public static WebElement PasswordField;

    @FindBy(name = "password_confirmation")
    public static WebElement ConfirmPasswordField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;



    //Initialize elements using selenium webdriver
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver,this);
    }



    //Page specific methods
    public void enterFirstName(String FirstName){
        FirstNameField.sendKeys(FirstName);
    }

    public void enterLastName(String LastName){
        LastNameField.sendKeys(LastName);
    }

    public void enterEmail(String Email){
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void enterPasswordConfirmation(String ConfirmPassword){
        ConfirmPasswordField.sendKeys(ConfirmPassword);
    }

    public void clickCreateAccountButton(){
        CreateAccountButton.click();
    }








}

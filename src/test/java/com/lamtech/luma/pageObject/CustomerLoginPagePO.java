package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//find element locator
public class CustomerLoginPagePO {
    @FindBy(name = "login[username]")
    public static WebElement UserNameField;

    @FindBy(name = "login[password]")
    public static WebElement LoginPasswordField;

    @FindBy(css = "#send2 > span")
    public static WebElement SignInButton;
    //Initialize element using selenium webdriver
    public CustomerLoginPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //page specific method
    public void enterLoginUserName(String Email) {
        UserNameField.sendKeys(Email);
    }
    public void enterLoginPassword(String Password){
        LoginPasswordField.sendKeys(Password);
    }
    public void clickSignInButton(){
        SignInButton.click();
    }

}


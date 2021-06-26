package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//find element locator
public class CustomerLoginPagePO {
    @FindBy(name = "login[username]")
    public static WebElement UserNameField;

    @FindBy(name = "login[password]")
    public static WebElement LoginPasswordField;

    @FindBy(css = "#send2 > span")
    public static WebElement SignInButton;

    //Declare Webdriver wait
    private WebDriverWait wait;

    //Initialize element using selenium webdriver
    public CustomerLoginPagePO(WebDriver driver) {
        wait = new WebDriverWait(driver, 5);
        PageFactory.initElements(driver, this);
    }



    //page specific method
    public void enterLoginUserName(String Email) {
        wait.until(ExpectedConditions.visibilityOf(UserNameField));
        UserNameField.sendKeys(Email);
    }
    public void enterLoginPassword(String Password){
        LoginPasswordField.sendKeys(Password);
    }
    public void clickSignInButton(){
        SignInButton.click();
    }

}


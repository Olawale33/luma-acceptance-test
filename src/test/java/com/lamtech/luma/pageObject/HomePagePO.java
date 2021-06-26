package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagePO {

    //Element locator
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;

    private WebDriverWait wait;




    //Initialize elements using selenium webdriver
    public HomePagePO(WebDriver driver){
        wait = new WebDriverWait(driver,5);
        PageFactory.initElements(driver,this);
    }


    //Page specific methods
    public void clickCreateAccountLink(){
        wait.until(ExpectedConditions.elementToBeClickable(CreateAccountLink));
        CreateAccountLink.click();
    }

    public void clickSignInLink(){
        SignInLink.click();
    }











}

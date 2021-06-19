package com.lamtech.luma.stepDefinition;

import com.lamtech.luma.pageObject.CreateAccountPagePO;
import com.lamtech.luma.pageObject.CustomerLoginPagePO;
import com.lamtech.luma.pageObject.HomePagePO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountManagementSteps {
    WebDriver driver;

    @Given("^user is on create an account page$")
    public void userIsOnCreateAnAccountPage() {
        //Define browser
        WebDriverManager.chromedriver().setup();
        //Open browser
        driver = new ChromeDriver();
        //Maximize browser window
        driver.manage().window().maximize();
        //Launch the application
        driver.get("https://magento2-demo.magebit.com/");
        //click on create an account
        //driver.findElement(By.linkText("Create an Account")).click();

        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();

    }

    @When("^user enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void userEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) throws Throwable {
        //driver.findElement(By.id("firstname")).sendKeys(FirstName);
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);

        //driver.findElement(By.id("lastname")).sendKeys(LastName);
        createAccountPagePO.enterLastName(LastName);

        //driver.findElement(By.name("email")).sendKeys(Email);
        createAccountPagePO.enterEmail(Email);

        //driver.findElement(By.id("password")).sendKeys(Password);
        createAccountPagePO.enterPassword(Password);

        //driver.findElement(By.name("password_confirmation")).sendKeys(ConfirmPassword);
        createAccountPagePO.enterPasswordConfirmation(ConfirmPassword);

    }


    @And("^user clicks on create an account$")
    public void userClicksOnCreateAnAccount() {
        //driver.findElement(By.cssSelector("#form-validate > div > div.primary > button > span")).click();
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("^my account page is displayed$")
    public void myAccountPageIsDisplayed() {
        String expectedResult = "My Account";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult,actualResult);
    }



    //Sign in Method


    @Given("^user is on sign in page$")
    public void userIsOnSignInPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento2-demo.magebit.com/");
        //driver.findElement(By.linkText("Sign In")).click();
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLink();
    }

    @When("^user enters \"([^\"]*)\" \"([^\"]*)\"$")
    public void userEnters(String Email, String Password){
       //driver.findElement(By.name("login[username]")).sendKeys(Email);
        CustomerLoginPagePO customerLoginPagePO = new CustomerLoginPagePO(driver);
        customerLoginPagePO.enterLoginUserName(Email);

       //driver.findElement(By.name("login[password]")).sendKeys(Password);
        customerLoginPagePO.enterLoginPassword(Password);

    }

    @And("^user clicks on sign in$")
    public void userClicksOnSignIn() {
        //driver.findElement(By.cssSelector("#send2 > span")).click();
        CustomerLoginPagePO customerLoginPagePO = new CustomerLoginPagePO(driver);
        customerLoginPagePO.clickSignInButton();
    }



    @Then("^user signed in successfully$")
    public void userSignedInSuccessfully() {
          String expectedResult = "Magento 2 Commerce (Enterprise) Demo - Magebit";
          String actualResult = driver.getTitle();
          Assert.assertEquals(expectedResult, actualResult);
    }
//Duplicate account creation Java step
    @Then("^a pop up displays account already exist$")
    public void aPopUpDisplaysAccountAlreadyExist() {
          String expectedResult = "Create New Customer Account";
          String actualResult = driver.getTitle();
          Assert.assertEquals(expectedResult, actualResult);
    }


}


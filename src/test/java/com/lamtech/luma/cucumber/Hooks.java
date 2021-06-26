package com.lamtech.luma.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void beforeScenario(){
        //Define browser
        WebDriverManager.chromedriver().setup();
        //Open browser
        driver = new ChromeDriver();
        //Maximize browser window
        driver.manage().window().maximize();
        //Launch the application
        driver.get("https://magento2-demo.magebit.com/");
    }

    @After
    public void afterScenario(){
        //driver.close();
        //driver.quit();
    }



}

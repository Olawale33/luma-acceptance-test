package com.lamtech.luma.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void beforeScenario() throws IOException {
        //load properties file
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src\\test\\resources\\env.properties");
        properties.load(fileInputStream);

        if (properties.getProperty("targetBrowser").equalsIgnoreCase("chrome")){
            //Define browser
            WebDriverManager.chromedriver().setup();
            //Open browser
            driver = new ChromeDriver();
            //Maximize browser window
            driver.manage().window().maximize();


        }else if (properties.getProperty("targetBrowser").equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }

        //Launch the application
        //driver.get("https://magento2-demo.magebit.com/");
        driver.get(properties.getProperty("targetURL"));
    }

    @After
    public void afterScenario(){
        //driver.close();
        //driver.quit();
    }



}

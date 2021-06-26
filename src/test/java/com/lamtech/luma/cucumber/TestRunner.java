package com.lamtech.luma.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",
        glue = {"com.lamtech.luma.stepDefinition","com.lamtech.luma.cucumber"},
        format = {"pretty","html:target/site/cucumber-pretty"},
        tags = {"@SignIn"}

)


public class TestRunner {
}

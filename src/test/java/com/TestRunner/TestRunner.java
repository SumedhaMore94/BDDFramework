package com.TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"com.StepDefinitions", "com.ApplicationHooks"},
        plugin = {"pretty"},
        dryRun = false
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
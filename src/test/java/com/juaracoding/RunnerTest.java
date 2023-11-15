package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/main/resources/features/Login.feature",
                "src/main/resources/features/Dashboard.feature",
                "src/main/resources/features/UserRegister.feature",
                "src/main/resources/features/SelfRegistration.feature",
                "src/main/resources/features/Division.feature"},
        glue = "com.juaracoding",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}

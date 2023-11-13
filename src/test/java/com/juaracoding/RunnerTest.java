package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/01Login.feature",
                    "src/main/resources/features/02ManagementUnit.feature",
                    "src/main/resources/features/03ManagementUnitSetting.feature",
                    "src/main/resources/features/04ManagementPosisi.feature",
                    "src/main/resources/features/05ManagementClientUpliner.feature"}, //path .feature
        glue = "com.juaracoding", //package
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-json"} //output
)

public class RunnerTest extends AbstractTestNGCucumberTests {

}

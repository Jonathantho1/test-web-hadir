package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/01Login.feature",
                    "src/main/resources/02Sakit.feature",
                    "src/main/resources/03Lembur.feature","src/main/resources/04PerjalananDinas.feature","src/main/resources/05Koreksi.feature"},
        glue = "com.juaracoding",  // package
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}

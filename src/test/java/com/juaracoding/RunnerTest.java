package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/01Login.feature",
                "src/main/resources/features/02ManagementAbsenPoint.feature",
                "src/main/resources/features/03ManagementJabatan.feature",
                "src/main/resources/features/04ManagementShifting.feature",
                "src/main/resources/features/05ManagementJadwal.feature"},
        glue = "com.juaracoding",  // package
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}

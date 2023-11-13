package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        I Gede Arya Krisnadi
//        "src/main/resources/features/Kehadiran.feature"
//        "src/main/resources/features/IzinTerlambat.feature"
//        "src/main/resources/features/IzinPulangCepat.feature"
//        "src/main/resources/features/Cuti.feature"
        features = {"src/main/resources/features/Kehadiran.feature",
                "src/main/resources/features/IzinTerlambat.feature",
                "src/main/resources/features/IzinPulangCepat.feature",
                "src/main/resources/features/Cuti.feature"
        },
        glue = "com.juaracoding",
        plugin = {"pretty", "html:target/cucumber-report.html",
                "json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}

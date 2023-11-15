package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Constans;
import com.juaracoding.utils.TestCases;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

import java.io.IOException;

public class Hooks {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ExtentReports reports = new ExtentReports("target/extent-report.html");

    @Before
    public void setUp(Scenario scenario) {
        DriverSingleton.getInstance((Constans.CHROME));
        driver = DriverSingleton.getDriver();

        // Mengambil nama testcase dari scenario
        String testCaseName = scenario.getName();

        extentTest = reports.startTest(testCaseName);
        Utils.testCount++;
    }


    @AfterAll
    public static void finish() {
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if(scenario.isFailed()) {

            String screenshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
                    +extentTest.addScreenCapture(screenshotPath));
        }
    }

    @After
    public void endTestCase() {
        reports.endTest(extentTest);
        reports.flush();
    }
}

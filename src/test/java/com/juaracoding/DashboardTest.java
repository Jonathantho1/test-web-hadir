package com.juaracoding;

import com.juaracoding.pages.DashboardPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DashboardTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static DashboardPage dashboardPage = new DashboardPage();

    public DashboardTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Displays the total of all employees")
    public void displays_the_total_of_all_employees() {
        String totalEmployees = dashboardPage.getTotalEmployees();
        if(totalEmployees != null) {
            extentTest.log(LogStatus.PASS, "Menampilkan total karyawan");
        }
    }

    @Then("Displays total absences for today")
    public void displays_total_absences_for_today() {
        String absenToday = dashboardPage.getAbsenToday();
        if(absenToday != null) {
            extentTest.log(LogStatus.PASS, "Menampilkan total absen hari ini");
        }
    }
}

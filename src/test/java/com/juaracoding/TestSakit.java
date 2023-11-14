package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.SakitPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestSakit {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static SakitPage sakitPage = new SakitPage();

    public TestSakit(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // TCC.HADIR.002
    @Given("user klik menu laporan")
    public void user_klik_menu_laporan() {
        sakitPage.clickMenuLaporan();
        extentTest.log(LogStatus.PASS,"user klik menu laporan");
    }

    @When("user klik menu sakit")
    public void user_klik_menu_sakit() {
        sakitPage.clickMenuSakit();
        extentTest.log(LogStatus.PASS,"User klik menu sakit");
    }
    @And("user input search")
    public void user_input_search() {
        sakitPage.inputSearch("Elpa");
        extentTest.log(LogStatus.PASS,"User input search");
    }
    @And("user click button search")
    public void user_click_button_search() {
        sakitPage.clickSearch();
        extentTest.log(LogStatus.PASS,"User click button search");
    }

    // TCC.HADIR.003
    @Given("user klik button reset")
    public void user_klik_button_reset() {
        sakitPage.clickReset();
        extentTest.log(LogStatus.PASS,"user klik button reset");
    }

    @When("user input start date")
    public void user_input_start_date() {
        sakitPage.startDate("07-07-2023");
        extentTest.log(LogStatus.PASS,"input start date");
    }
    @And("user input end date")
    public void user_input_end_date() {
        sakitPage.endDate("07-08-2023");
        extentTest.log(LogStatus.PASS,"input end date");
    }

}

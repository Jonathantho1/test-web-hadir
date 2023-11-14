package com.juaracoding;

import com.juaracoding.pages.LemburPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.PerjalananDinasPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestPerjalananDinas {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static PerjalananDinasPage perjalananDinasPage = new PerjalananDinasPage();

    public TestPerjalananDinas(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // TCC.HADIR.002
    @Given("user klik menu perjalanandinas")
    public void user_klik_menu_perjalanandinas() {
        perjalananDinasPage.clickMenuperjalanandinas();
        extentTest.log(LogStatus.PASS,"User klik menu perjalanandinas");
    }
    @When("user input search perjalanandinas")
    public void user_input_search_perjalanandinas() {
        perjalananDinasPage.inputSearch("Dummy Staff");
        extentTest.log(LogStatus.PASS,"User input search perjalanandinas");
    }
    @And("user klik button search perjalanandinas")
    public void user_klik_button_search_perjalanandinas() {
        perjalananDinasPage.clickSearch();
        extentTest.log(LogStatus.PASS,"user klik button search perjalanandinas");
    }

    // TCC.HADIR.003
    @Given("user klik button reset perjalanandinas")
    public void user_klik_button_reset_perjalanandinas() {
        perjalananDinasPage.clickReset();
        extentTest.log(LogStatus.PASS,"user klik button reset perjalanandinas");
    }

    @When("user input start date perjalanandinas")
    public void user_input_start_date_perjalanandinas() {
        perjalananDinasPage.startDate("12-09-2023");
        extentTest.log(LogStatus.PASS,"input start date perjalanandinas");
    }
    @And("user input end date perjalanandinas")
    public void user_input_end_date_perjalanandinas() {
        perjalananDinasPage.endDate("12-09-2023");
        extentTest.log(LogStatus.PASS,"input end date perjalanandinas");
    }

}

